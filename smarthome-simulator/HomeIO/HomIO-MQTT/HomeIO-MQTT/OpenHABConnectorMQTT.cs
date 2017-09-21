using EngineIO;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using uPLibrary.Networking.M2Mqtt;
using uPLibrary.Networking.M2Mqtt.Messages;

namespace HomeIO_MQTT
{
    public class OpenHABConnectorMQTT : IOpenHABEventPublisher
    {
        private readonly string MqttUrl = "127.0.0.1";
        private readonly string[] MqttTopics = { "out/#/state" };

        private MqttClient client = null;
        private OpenHABTransformer transformer = new OpenHABTransformer();
        private SensorFilter filter = new SensorFilter();

        public event EventHandler<OpenHABEventArgs> StateChanged;

        public OpenHABConnectorMQTT()
        {
            InitMQTT();
        }

        private void InitMQTT()
        {
            Console.WriteLine("Connecting to MQTT broker at " + MqttUrl);
            client = new MqttClient(MqttUrl);
            client.MqttMsgPublishReceived += MqttMsgPublishReceived;
            client.Connect("HomeIO");
            client.Subscribe(MqttTopics, new byte[] { MqttMsgBase.QOS_LEVEL_EXACTLY_ONCE });
            foreach (string topic in MqttTopics)
            {
                Console.WriteLine("Subscribed to topic: " + topic);
            }

        }

        public void SendUpdate(MemoryBit mem)
        {
            if (filter.Apply(mem))
            {
                client.Publish("in/" + transformer.NameToOpenHAB(mem.Name) + "/state", Encoding.ASCII.GetBytes(transformer.BoolToState(mem.Value)));
            }
        }

        public void SendUpdate(MemoryFloat mem)
        {
            if (filter.Apply(mem))
            {
                client.Publish("in/" + transformer.NameToOpenHAB(mem.Name) + "/state", Encoding.ASCII.GetBytes(transformer.FloatToState(mem.Value)));
            }
        }

        public void SendUpdate(MemoryDateTime mem)
        {
            if (filter.Apply(mem))
            {
                //client.Publish("in/" + "HomeIO_Date" + "/state", Encoding.ASCII.GetBytes(mem.Value.ToString("o")));
            }
        }


        //Command received form OpenHAB to HomeIO
        private void MqttMsgPublishReceived(object sender, MqttMsgPublishEventArgs e)
        {
            string state = Encoding.ASCII.GetString(e.Message);

            Console.WriteLine(string.Format("{0}\t{1}", e.Topic, state));

            StateChanged(this, new OpenHABEventArgs(transformer.NameToHomeIOFromTopic(e.Topic), state, transformer));
        }

        internal void GenerateConfigFiles(string openHABConfDir)
        {
            transformer.GenerateConfigFiles(openHABConfDir);
        }
    }
}
