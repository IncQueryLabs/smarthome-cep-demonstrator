import paho.mqtt.client as mqtt
import paho.mqtt.publish as publish



class Borg:

	subscribers = {}
	def __init__(self, name):
		if name not in self.subscribers:
			self.subscribers[name] = {name : {}} 
			print("Adding new subscriber: "+name)

		self.__dict__ = self.subscribers[name] 

class MyClient(Borg):
	cb_msg = None
	name = None
	client = None

	def __init__(self, name, cb_msg):
		Borg.__init__(self, name)
		self.name = name
		self.cb_msg = cb_msg
		if self.client is None: 
			self.client = mqtt.Client()
			self.client.on_message = self.on_message
			self.client.connect("127.0.0.1", 1183, 60)
			self.client.subscribe("out/"+self.name+"/state")
			self.client.loop_start()
			print("Client connected: "+self.name)

	def mqtt_publish_state(self,message):
		publish.single("in/"+self.name+"/state", payload=message, qos=0, retain=False, 
hostname="127.0.0.1",port=1183,client_id="python-client", keepalive=60, will=None, auth=None, tls=None, protocol=mqtt.MQTTv31)
	
	def mqtt_publish(self, message):
    		publish.single("in/"+self.name+"/command", payload=message, qos=0, retain=False, hostname="127.0.0.1", 
port=1183, 
client_id="python-client", keepalive=60, will=None, auth=None, tls=None, protocol=mqtt.MQTTv31)

	def on_message(self, client, userdata, msg):
		self.cb_msg(msg.payload)
