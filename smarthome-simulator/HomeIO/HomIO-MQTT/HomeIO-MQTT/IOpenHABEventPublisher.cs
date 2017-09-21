using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace HomeIO_MQTT
{
    public interface IOpenHABEventPublisher
    {
        event EventHandler<OpenHABEventArgs> StateChanged;
    }

    public class OpenHABEventArgs : EventArgs
    {
        public OpenHABEventArgs(string name, string state, OpenHABTransformer transformer)
        {
            Name = name;
            State = state;
            Transformer = transformer;
        }

        public string Name { get; }
        public string State { get; }
        public OpenHABTransformer Transformer { get; set; }
    }
}
