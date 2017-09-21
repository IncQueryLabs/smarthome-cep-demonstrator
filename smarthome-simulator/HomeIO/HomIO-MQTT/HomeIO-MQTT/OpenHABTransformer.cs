using EngineIO;
using System;
using System.Collections.Generic;
using System.Globalization;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace HomeIO_MQTT
{
    public class OpenHABTransformer
    {
        public string NameToOpenHAB(string name)
        {
            return name.Replace("(", string.Empty)
                .Replace(")", string.Empty)
                .Replace("-", string.Empty)
                .Replace(' ', '_')
                .Replace('/', '_')
                .Remove(1, 1);
        }

        public string NameToHomeIO(string name)
        {
            string[] parts = name.Split('_');
            if (parts[parts.Count() - 1] == "Up")
            {
                name = ReplaceLastOccurrence(name, "Up", "(Up)");
            }
            else if (parts[parts.Count() - 1] == "Down")
            {
                name = ReplaceLastOccurrence(name, "Down", "(Down)");
            }
            else if (parts[parts.Count() - 1] == "Analog")
            {
                name = ReplaceLastOccurrence(name, "Analog", "(Analog)");
            }
            name = name.Replace("Up_Down", "Up/Down");

            return name.Replace('_', ' ').Insert(1, " -");
        }

        public string NameToHomeIOFromTopic(string topic)
        {
            return NameToHomeIO(GetNameFromTopic(topic));
       }

        private string ReplaceLastOccurrence(string Source, string Find, string Replace)
        {
            int place = Source.LastIndexOf(Find);

            if (place == -1)
                return Source;

            string result = Source.Remove(place, Find.Length).Insert(place, Replace);
            return result;
        }

        public bool StateToBit(string state)
        {
            return state == "ON" ? true : false;
        }

        public float StateToFloat(string state)
        {

            // in OpenHAB 0-100
            const float openhabMax = 100;
            const float openhabMin = 0;

            // in HomeIO 0-10
            const float homeioMax = 10;
            const float homeioMin = 0;

            const float openhabToHomeioRate = openhabMax / homeioMax;

            if (state == "ON")
            {
                return homeioMax;
            }
            else if (state == "OFF")
            {
                return homeioMin;
            }
            // Percent value
            else
            {
                try
                {
                    float commandValue = float.Parse(state, CultureInfo.InvariantCulture.NumberFormat);
                    if (commandValue >= openhabMin && commandValue <= openhabMax)
                    {
                        return commandValue / openhabToHomeioRate;
                    }
                    else
                    {
                        Console.WriteLine("Float is out of range! " + commandValue);
                    }
                }
                catch (Exception ex)
                {
                    Console.WriteLine("Can't convert to float: " + ex.Message);
                }
            }
            return 0;
        }

        public string BoolToState(bool value)
        {
            return value == true ? "OPEN" : "CLOSED";
        }

        public string FloatToState(float value)
        {
            return value.ToString();
        }


        private string GetNameFromTopic(string name)
        {
            return name.Split('/')[1];
        }

        public void GenerateConfigFiles(string openHABConfDirectory)
        {
            Dictionary<char, List<string>> files = new Dictionary<char, List<string>>();
            for (char c = 'A'; c < 'P'; c++)
            {
                files.Add(c, new List<string>());
            }

            string[] groups =
            {
                "Group" + '\t' + "gAll",
                "Group" + '\t' + "gSwitch" + '\t' + "(gAll)",
                "Group" + '\t' + "gContact" + '\t' + "(gAll)",
                "Group:Switch:OR(ON, OFF)" + '\t' + "gRollerShadesUp" + '\t' + "\"Roller shades going up [%d]\""+ '\t' + "(gSwitch)",
                "Group:Switch:OR(ON, OFF)" + '\t' + "gRollerShadesDown" + '\t' + "\"Roller shades going down [%d]\""+ '\t' + "(gSwitch)",
                "Group:Switch:OR(ON, OFF)" + '\t' + "gLight" + '\t' + "\"Active lights [%d]\""+ '\t' + "(gSwitch)",
                "Group:Switch:OR(ON, OFF)" + '\t' + "gSiren" + '\t' + "\"Active sirens [%d]\""+ '\t' + "(gSwitch)",
                "Group:Switch:OR(ON, OFF)" + '\t' + "gHeater" + '\t' + "\"Active heaters [%d]\""+ '\t' + "(gSwitch)",
                "Group:Number:AVG" + '\t' + "gBrightnessSensor" + '\t' + "\"Average brightness [%.3f]\""+ '\t' + "(gAll)",
                "Group:Number:AVG" + '\t' + "gRoolerShadesOpenness" + '\t' + "\"Average rooler shades Openness [%.1f]\""+ '\t' + "(gAll)",
                "Group:Number:AVG" + '\t' + "gTemperature" + '\t' + "\"Average Room Temperatures [%.1f °C]\""+ '\t' + "(gAll)",
                "Group:Contact:OR(CLOSED, OPEN)" + '\t' + "gDoorDetector" + '\t' + "\"Opened doors/windows [%d]\""+ '\t' + "(gAll)",
                "Group:Contact:OR(OPEN, CLOSED)" + '\t' + "gMotionDetector" + '\t' + "\"Triggered motion detectors [%d]\""+ '\t' + "(gAll)",
                "Group" + '\t' + "gA" + '\t' + "(gAll)",
                "Group" + '\t' + "gB" + '\t' + "(gAll)",
                "Group" + '\t' + "gC" + '\t' + "(gAll)",
                "Group" + '\t' + "gD" + '\t' + "(gAll)",
                "Group" + '\t' + "gE" + '\t' + "(gAll)",
                "Group" + '\t' + "gF" + '\t' + "(gAll)",
                "Group" + '\t' + "gG" + '\t' + "(gAll)",
                "Group" + '\t' + "gH" + '\t' + "(gAll)",
                "Group" + '\t' + "gI" + '\t' + "(gAll)",
                "Group" + '\t' + "gJ" + '\t' + "(gAll)",
                "Group" + '\t' + "gK" + '\t' + "(gAll)",
                "Group" + '\t' + "gL" + '\t' + "(gAll)",
                "Group" + '\t' + "gM" + '\t' + "(gAll)",
                "Group" + '\t' + "gN" + '\t' + "(gAll)",
                "Group" + '\t' + "gO" + '\t' + "(gAll)"
            };

            string[] common =
            {
                "DateTime HomeIO_Date \"HomeIO Date\""
            };

            foreach (MemoryBit mem in MemoryMap.Instance.GetBitMemories(MemoryType.Input))
            {
                if (mem.HasName)
                {
                    List<string> file;
                    if (files.TryGetValue(mem.Name[0], out file))
                    {
                        if(mem.Name.Contains("Door Detector"))
                        {
                            file.Add("Contact" + '\t' + NameToOpenHAB(mem.Name) + '\t' + '"' + mem.Name + '"' + '\t' + "(gDoorDetector, g" + mem.Name[0] + ")");
                        }
                        else if (mem.Name.Contains("Motion Detector"))
                        {
                            file.Add("Contact" + '\t' + NameToOpenHAB(mem.Name) + '\t' + '"' + mem.Name + '"' + '\t' + "(gMotionDetector, g" + mem.Name[0] + ")");
                        }
                        else
                        {
                            file.Add("Contact" + '\t' + NameToOpenHAB(mem.Name) + '\t' + '"' + mem.Name + '"' + '\t' + "(gContact, g" + mem.Name[0] + ")");
                        }
                    }
                }
            }

            foreach (MemoryFloat mem in MemoryMap.Instance.GetFloatMemories(MemoryType.Input))
            {
                if (mem.HasName)
                {
                    List<string> file;
                    if (files.TryGetValue(mem.Name[0], out file))
                    {
                        if(mem.Name.Contains("Brightness Sensor"))
                        {
                            file.Add("Number" + '\t' + NameToOpenHAB(mem.Name) + '\t' + '"' + mem.Name + '"' + '\t' + "(gBrightnessSensor, g" + mem.Name[0] + ")");
                        }
                        else if (mem.Name.Contains("Roller Shades"))
                        {
                            file.Add("Number" + '\t' + NameToOpenHAB(mem.Name) + '\t' + '"' + mem.Name + '"' + '\t' + "(gRoolerShadesOpenness, g" + mem.Name[0] + ")");
                        }
                        else if (mem.Name.Contains("Room Temperature"))
                        {
                            file.Add("Number" + '\t' + NameToOpenHAB(mem.Name) + '\t' + '"' + mem.Name + '"' + '\t' + "(gTemperature, g" + mem.Name[0] + ")");
                        }
                    }
                }
            }

            foreach (MemoryBit mem in MemoryMap.Instance.GetBitMemories(MemoryType.Output))
            {
                if (mem.HasName)
                {
                    List<string> file;
                    if (files.TryGetValue(mem.Name[0], out file))
                    {
                        if (mem.Name.Contains("Light"))
                        {
                            file.Add("Switch" + '\t' + NameToOpenHAB(mem.Name) + '\t' + '"' + mem.Name + '"' + '\t' + "(gLight, g" + mem.Name[0] + ")");
                        }
                        else if (mem.Name.Contains("Siren"))
                        {
                            file.Add("Switch" + '\t' + NameToOpenHAB(mem.Name) + '\t' + '"' + mem.Name + '"' + '\t' + "(gSiren, g" + mem.Name[0] + ")");
                        }
                        else if (mem.Name.Contains("Heater"))
                        {
                            file.Add("Switch" + '\t' + NameToOpenHAB(mem.Name) + '\t' + '"' + mem.Name + '"' + '\t' + "(gHeater, g" + mem.Name[0] + ")");
                        }
                        else if (mem.Name.Contains("Roller Shades"))
                        {
                            if (mem.Name.Contains("Up"))
                            {
                                file.Add("Switch" + '\t' + NameToOpenHAB(mem.Name) + '\t' + '"' + mem.Name + '"' + '\t' + "(gRollerShadesUp, g" + mem.Name[0] + ")");
                            }
                            else if (mem.Name.Contains("Down"))
                            {
                                file.Add("Switch" + '\t' + NameToOpenHAB(mem.Name) + '\t' + '"' + mem.Name + '"' + '\t' + "(gRollerShadesDown, g" + mem.Name[0] + ")");
                            }
                        }
                        else
                        {
                            file.Add("Switch" + '\t' + NameToOpenHAB(mem.Name) + '\t' + '"' + mem.Name + '"' + '\t' + "(gSwitch, g" + mem.Name[0] + ")");
                        }
                    }
                }
            }

            foreach (MemoryFloat mem in MemoryMap.Instance.GetFloatMemories(MemoryType.Output))
            {
                if (mem.HasName)
                {
                    List<string> file;
                    if (files.TryGetValue(mem.Name[0], out file))
                    {
                        if (mem.Name.Contains("Light"))
                        {
                            file.Add("Dimmer" + '\t' + NameToOpenHAB(mem.Name) + '\t' + '"' + mem.Name + '"' + '\t' + "(gLight, g" + mem.Name[0] + ")");
                        }
                        else
                        {
                            file.Add("Dimmer" + '\t' + NameToOpenHAB(mem.Name) + '\t' + '"' + mem.Name + '"' + '\t' + "(g" + mem.Name[0] + ")");
                        }
                    }
                }
            }

            System.IO.File.WriteAllLines(openHABConfDirectory + @"HomeIO-groups.items", groups);
            System.IO.File.WriteAllLines(openHABConfDirectory + @"HomeIO-common.items", common);
            foreach (var file in files)
            {
                System.IO.File.WriteAllLines(openHABConfDirectory + @"HomeIO-" + file.Key + ".items", file.Value);
            }
            Console.WriteLine("Successfully generated configuration files to: " + openHABConfDirectory);
        }
    }
}
