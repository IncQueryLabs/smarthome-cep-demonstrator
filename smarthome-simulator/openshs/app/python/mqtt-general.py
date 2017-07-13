import mymqtt

cont = logic.getCurrentController()
own = cont.owner
parent = own.parent



def callback_message(msg):
    if msg == b'ON':

    elif msg == b'OFF':
        
client = mymqtt.MyClient(own.name, callback)

client.mqtt_publish("ON")
client.mqtt_publish("OFF")
