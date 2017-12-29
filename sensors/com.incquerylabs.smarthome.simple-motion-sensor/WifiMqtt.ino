#include <EEPROM.h>
#include <ESP8266WiFi.h>
#include <PubSubClient.h>
#include <Wire.h>

// Connect to the WiFi
const char* wifi_ssid =       "IncQuery_Interns";
const char* wifi_password =   "u4sejJWUKctv";
const char* mqtt_server =     "192.168.3.45";
const int   mqtt_port =       1183;
const char* mqtt_user =       "dandrid";
const char* mqtt_password =   "M+O!S%Q/U=I(T)t0o1";
const String client_id =      "a0:20:a6:19:4a:fc-ESP8266";

long lastReconnectAttempt = 0;


void callback(char* topic, byte* payload, unsigned int length) 
{
  Serial.print("Message arrived [");
  Serial.print(topic);
  Serial.print("] ");
  
  String message = "";
  for (int i=0;i<length;i++) 
  {
    message += (char)payload[i];
  }
  Serial.println(message);
  
  if (message == "ON")
  {
    ledState = LOW;
    Serial.println("Led ON");
  }
  else if (message == "OFF")
  {
    ledState = HIGH;
    Serial.println("Led OFF");
  }
  else if (message == "change")
  {
    ledState = !ledState;
    Serial.println("Led CHANGE");
  }
}
 
 
bool reconnect() 
{
  Serial.print("Attempting MQTT connection...");
  
  if (client.connect("ESP8266 Client", mqtt_user, mqtt_password)) // Attempt to connect
  {
    Serial.println("connected");
    client.publish("connection", (client_id + " connected").c_str());
    client.subscribe(topicSwitchIn);  //subscribed to topic
    client.loop();
  }
  else 
  {
    Serial.print("failed, rc=");
    Serial.println(client.state());
  }
  return client.connected();
}
 
void wifiSetup()
{
   WiFi.mode(WIFI_STA);
   WiFi.begin(wifi_ssid, wifi_password);
   
   client.setServer(mqtt_server, mqtt_port);
   client.setCallback(callback);
   
   lastReconnectAttempt = 0;
}
 
void wifiLoop()
{
  if (!client.connected())
  {
    long now = millis();
    if (now - lastReconnectAttempt > 5000) 
    {
      lastReconnectAttempt = now;
      if (reconnect())
      {
        lastReconnectAttempt = 0;
      }
    }
  }
  client.loop();
}
