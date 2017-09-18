using EngineIO;
using System;
using System.Collections.Generic;
using System.Globalization;
using System.Linq;
using System.Text;
using System.Threading;
using System.Threading.Tasks;
using uPLibrary.Networking.M2Mqtt;
using uPLibrary.Networking.M2Mqtt.Messages;

namespace HomeIO_MQTT
{
    class HomeIO
    {
        private Dictionary<string, MemoryBit> memoryInputBits = new Dictionary<string, MemoryBit>();
        private Dictionary<string, MemoryBit> memoryOutputBits = new Dictionary<string, MemoryBit>();
        private Dictionary<string, MemoryFloat> memoryInputFloats = new Dictionary<string, MemoryFloat>();
        private Dictionary<string, MemoryFloat> memoryOutputFloats = new Dictionary<string, MemoryFloat>();
        private int lastSentDate = 0;

        MqttClient client = new MqttClient("127.0.0.1");

        private string HomeIONameToOpenHAB(string name)
        {
            return name.Replace("(", string.Empty)
                .Replace(")", string.Empty)
                .Replace("-", string.Empty)
                .Replace(' ', '_')
                .Replace('/', '_')
                .Remove(1,1); 
        }

        private string ReplaceLastOccurrence(string Source, string Find, string Replace)
        {
            int place = Source.LastIndexOf(Find);

            if (place == -1)
                return Source;

            string result = Source.Remove(place, Find.Length).Insert(place, Replace);
            return result;
        }

        private string OpenHABNameToHomeIO(string name)
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

        private string GetNameFromTopic(string name)
        {
            return name.Split('/')[1];
        }

        //Command received form OpenHAB to HomeIO
        private void MqttMsgPublishReceived(object sender, MqttMsgPublishEventArgs e)
        {
            String command = Encoding.ASCII.GetString(e.Message);
            MemoryBit memBit;
            MemoryFloat memFloat;

            Console.WriteLine(string.Format("{0}\t{1}", e.Topic, command));


            // if item is bit
            if (memoryOutputBits.TryGetValue(OpenHABNameToHomeIO(GetNameFromTopic(e.Topic)), out memBit))
            {
                //converting from OpenHAB value to HomeIO value
                memBit.Value = command == "ON" ? true : false;
            }
            // if item is float
            else if (memoryOutputFloats.TryGetValue(OpenHABNameToHomeIO(GetNameFromTopic(e.Topic)), out memFloat))
            {
                // float values

                // in OpenHAB 0-100
                const float openhabMax = 100;
                const float openhabMin = 0;

                // in HomeIO 0-10
                const float homeioMax = 10;
                const float homeioMin = 0;

                const float openhabToHomeioRate = openhabMax / homeioMax;

                if (command == "ON")
                {
                    memFloat.Value = homeioMax;
                }
                else if (command == "OFF")
                {
                    memFloat.Value = homeioMin;
                }
                // Percent value
                else 
                {
                    try
                    {
                        float commandValue = float.Parse(command, CultureInfo.InvariantCulture.NumberFormat);
                        if(commandValue >= openhabMin && commandValue <= openhabMax)
                        {
                            memFloat.Value = commandValue / openhabToHomeioRate;
                        }
                        else
                        {
                            Console.WriteLine("Float is out of range! " + commandValue);
                        }
                    }
                    catch(Exception ex)
                    {
                        Console.WriteLine("Can't convert to float: " + ex.Message); 
                    }
                }
            }

            // writing changes to HomeIO
            MemoryMap.Instance.Update();
        }

        // HomeIO value changed, sending it to OpenHAB
        void OnValueChanged(MemoryMap sender, MemoriesChangedEventArgs args)
        {
            foreach (MemoryBit mem in args.MemoriesBit)
            {
                // if a device has a name, it is set to external control, so we could use it
                if (mem.HasName)
                {
                    // converting HomeIO to OpenHAB
                    client.Publish("in/" + HomeIONameToOpenHAB(mem.Name) + "/state", Encoding.ASCII.GetBytes(mem.Value == true ? "OPEN" : "CLOSED"));
                }
            }
            
            foreach (MemoryDateTime time in args.MemoriesDateTime)
            {
                // filtering time, to not to send more than once a second
                if (time.HasName && time.MemoryType == MemoryType.Input && lastSentDate != time.Value.Second)
                {
                    lastSentDate = time.Value.Second;
                    client.Publish("in/" + "HomeIO_Date" + "/state", Encoding.ASCII.GetBytes(time.Value.ToString("o")));
                }
            }
        }

        private void InitMQTT()
        {
            client.MqttMsgPublishReceived += MqttMsgPublishReceived;
            client.Connect("HomeIO");
            client.Subscribe(new string[] { "out/#/state" }, new byte[] { MqttMsgBase.QOS_LEVEL_EXACTLY_ONCE });
        }

        private void InitHomeIO()
        {
            MemoryMap.Instance.InputsValueChanged += new MemoriesChangedEventHandler(OnValueChanged);
            MemoryMap.Instance.OutputsValueChanged += new MemoriesChangedEventHandler(OnValueChanged);

            // NOTE, update only works, if you have active listeners, probably HomeIO bug.
            MemoryMap.Instance.Update();

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
                "Group" + '\t' + "gLight" + '\t' + "(gSwitch)",
                "Group" + '\t' + "gA",
                "Group" + '\t' + "gB",
                "Group" + '\t' + "gC",
                "Group" + '\t' + "gD",
                "Group" + '\t' + "gE",
                "Group" + '\t' + "gF",
                "Group" + '\t' + "gG",
                "Group" + '\t' + "gH",
                "Group" + '\t' + "gI",
                "Group" + '\t' + "gJ",
                "Group" + '\t' + "gK",
                "Group" + '\t' + "gL",
                "Group" + '\t' + "gM",
                "Group" + '\t' + "gN",
                "Group" + '\t' + "gO"
            };

            string[] common =
            {
                "DateTime HomeIO_Date \"HomeIO Date\""
            };

            foreach (MemoryBit mem in MemoryMap.Instance.GetBitMemories(MemoryType.Input))
            {
                if (mem.HasName)
                {
                    memoryInputBits.Add(mem.Name, mem);

                    List<string> file;
                    if (files.TryGetValue(mem.Name[0], out file))
                    {
                        file.Add("Contact" + '\t' + HomeIONameToOpenHAB(mem.Name) + '\t' + '"' + mem.Name + '"' + '\t' + "(gContact, g" + mem.Name[0] + ")");
                    }
                }
            }
            
            foreach (MemoryBit mem in MemoryMap.Instance.GetBitMemories(MemoryType.Output))
            {
                if (mem.HasName)
                {
                    memoryOutputBits.Add(mem.Name, mem);

                    List<string> file;
                    if (files.TryGetValue(mem.Name[0], out file))
                    {
                        if(HomeIONameToOpenHAB(mem.Name).Contains("Light"))
                        {
                            file.Add("Switch" + '\t' + HomeIONameToOpenHAB(mem.Name) + '\t' + '"' + mem.Name + '"' + '\t' + "(gLight, g" + mem.Name[0] + ")");
                        }
                        else
                        {
                            file.Add("Switch" + '\t' + HomeIONameToOpenHAB(mem.Name) + '\t' + '"' + mem.Name + '"' + '\t' + "(gSwitch, g" + mem.Name[0] + ")");
                        }
                    }
                }
            }

            foreach (MemoryFloat mem in MemoryMap.Instance.GetFloatMemories(MemoryType.Output))
            {
                if (mem.HasName)
                {
                    memoryOutputFloats.Add(mem.Name, mem);

                    List<string> file;
                    if (files.TryGetValue(mem.Name[0], out file))
                    {
                        file.Add("Dimmer" + '\t' + HomeIONameToOpenHAB(mem.Name) + '\t' + '"' + mem.Name + '"' + '\t' + "(gLight, g" + mem.Name[0] + ")");
                    }
                }
            }
            
            System.IO.File.WriteAllLines(@"C:\OpenHAB2\conf\items\HomeIO-groups.items", groups);
            System.IO.File.WriteAllLines(@"C:\OpenHAB2\conf\items\HomeIO-common.items", common);
            foreach (var file in files)
            {
                System.IO.File.WriteAllLines(@"C:\OpenHAB2\conf\items\HomeIO-" + file.Key + ".items", file.Value);
            }

        }

        public HomeIO()
        {
            InitHomeIO();
            InitMQTT();
        }

        public void Update()
        {
            MemoryMap.Instance.Update();
        }

        public void Dispose()
        {
            MemoryMap.Instance.Dispose();
        }
    }
}
