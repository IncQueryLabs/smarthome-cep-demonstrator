using EngineIO;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Net;
using System.Text;
using System.Threading;
using System.Threading.Tasks;
using uPLibrary.Networking.M2Mqtt;
using uPLibrary.Networking.M2Mqtt.Messages;

namespace HomeIO_MQTT
{
    class Program
    {
        static void Main(string[] args)
        {
            HomeIO homeIO;
            if(args.Length > 0)
            {
                homeIO = new HomeIO(args[0]);
            } else
            {
                homeIO = new HomeIO();
            }

            while (!Console.KeyAvailable)
            {
                homeIO.Update();
               Thread.Sleep(16);
            }
            homeIO.Dispose();
        }
    }
}
