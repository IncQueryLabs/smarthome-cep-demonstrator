import paho.mqtt.client as mqtt
import paho.mqtt.publish as publish

out_topic="in/mqttSwitch/command"

def mqtt_publish(message):
    publish.single(out_topic, payload=message, qos=0, retain=False, hostname="127.0.0.1",
       port=1183, client_id="python-client", keepalive=60, will=None, auth=None,
       tls=None, protocol=mqtt.MQTTv31)

mqtt_publish("ON")


