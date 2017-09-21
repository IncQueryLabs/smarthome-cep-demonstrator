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
        private Dictionary<string, MemoryBit> memoryOutputBits = new Dictionary<string, MemoryBit>();
        private Dictionary<string, MemoryFloat> memoryOutputFloats = new Dictionary<string, MemoryFloat>();
        
        private OpenHABConnectorMQTT openhab = new OpenHABConnectorMQTT();


        // HomeIO value changed, sending it to OpenHAB
        private void OnValueChanged(MemoryMap sender, MemoriesChangedEventArgs args)
        {
            foreach (MemoryBit mem in args.MemoriesBit)
            {
                // if a device has a name, it is set to external control, so we could use it
                if (mem.HasName)
                {
                    // send update to OpenHAB
                    openhab.SendUpdate(mem);
                }
            }

            foreach (MemoryFloat mem in args.MemoriesFloat)
            {
                if (mem.HasName)
                {
                    // send update to OpenHAB
                    openhab.SendUpdate(mem);
                }
            }
            
            foreach (MemoryDateTime mem in args.MemoriesDateTime)
            {
                if (mem.HasName)
                {
                    // send update to OpenHAB
                    openhab.SendUpdate(mem);
                }
            }
        }


        //Command received form OpenHAB to HomeIO
        private void OnUpdateState(object sender, OpenHABEventArgs args)
        {
            string name = args.Name;
            string state = args.State;
            OpenHABTransformer transformer = args.Transformer;

            MemoryBit memBit;
            MemoryFloat memFloat;
            
            // if item is bit
            if (memoryOutputBits.TryGetValue(name, out memBit))
            {
                //converting from OpenHAB value to HomeIO value
                memBit.Value = transformer.StateToBit(state);
            }
            // if item is float
            else if (memoryOutputFloats.TryGetValue(name, out memFloat))
            {
                memFloat.Value = transformer.StateToFloat(state);
            }

            // writing changes to HomeIO
            MemoryMap.Instance.Update();
        }


        private void InitHomeIO(string openHABConfDir = "")
        {
            MemoryMap.Instance.InputsValueChanged += new MemoriesChangedEventHandler(OnValueChanged);
            MemoryMap.Instance.OutputsValueChanged += new MemoriesChangedEventHandler(OnValueChanged);
            openhab.StateChanged += OnUpdateState;

            // NOTE, update only works, if you have active listeners, probably HomeIO bug.
            MemoryMap.Instance.Update();

            foreach (MemoryBit mem in MemoryMap.Instance.GetBitMemories(MemoryType.Output))
            {
                if (mem.HasName)
                {
                    memoryOutputBits.Add(mem.Name, mem);
                }
            }

            foreach (MemoryFloat mem in MemoryMap.Instance.GetFloatMemories(MemoryType.Output))
            {
                if (mem.HasName)
                {
                    memoryOutputFloats.Add(mem.Name, mem);
                }
            }

            if (openHABConfDir != "")
            {
                openhab.GenerateConfigFiles(openHABConfDir);
            }
        }

        public HomeIO()
        {
            InitHomeIO();
        }

        public HomeIO(string openHABConfDir)
        {
            InitHomeIO(openHABConfDir);
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
