from bge import logic
import paho.mqtt.client as mqtt
import paho.mqtt.publish as publish

cont = logic.getCurrentController()
own = cont.owner

def on():
    
def off():
    

def mqtt_publish(message):
    publish.single("in/"+own.name+"/command", payload=message, qos=0, retain=False, hostname="127.0.0.1",
       port=1183, client_id="python-client", keepalive=60, will=None, auth=None,
       tls=None, protocol=mqtt.MQTTv31)

def on_message(client, userdata, msg):
    if msg.payload == b'ON':
        on()
    elif msg.payload == b'OFF':
        off()

client = mqtt.Client()
client.on_message = on_message
client.connect("127.0.0.1", 1183, 60)
client.subscribe("out/"+own.name+"/state")

client.loop_start()

mqtt_publish("ON")
mqtt_publish("OFF")
