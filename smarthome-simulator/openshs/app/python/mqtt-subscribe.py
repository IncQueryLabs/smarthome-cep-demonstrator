import paho.mqtt.client as mqtt
import paho.mqtt.publish as publish


def tv_on():
    own.color = [1,0,0,1]
    logic.states['tv'] = 1
    
def tv_off():
    own.color = [0,0,0,1]
    logic.states['tv'] = 0

def mqtt_publish(message):
    publish.single(out_topic, payload=message, qos=0, retain=False, hostname="127.0.0.1",
       port=1183, client_id="python-client", keepalive=60, will=None, auth=None,
       tls=None, protocol=mqtt.MQTTv31)

def on_message(client, userdata, msg):
    if msg.payload == b'ON':
        tv_on()
    elif msg.payload == b'OFF':
        tv_off()

client = mqtt.Client()
client.on_message = on_message
client.connect("127.0.0.1", 1183, 60)
client.subscribe(in_topic)

client.loop_start()
