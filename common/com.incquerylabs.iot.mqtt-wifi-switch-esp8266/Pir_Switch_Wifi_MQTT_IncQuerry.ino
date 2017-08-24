const int pirPin = D7;
const int buttonPin = 15;//D8     //const int buttonPin = D3;
const int ledPin = BUILTIN_LED;             //const int ledPin = BUILTIN_LED;
const char* topicSwitchOut =     "in/mqttSwitch/command";
const char* topicSwitchIn =   "out/mqttSwitch/state";
const char* topicPirOut =        "in/mqttPir/command";

volatile bool buttonPressed = false;
volatile bool pirChanged = false;
volatile int pirState = LOW;            //LOW = no motion, HIGH = motion
int ledState = HIGH;                    //LOW = ON, HIGH = OFF;

#include <ESP8266WiFi.h>
#include <PubSubClient.h>
WiFiClient espClient;
PubSubClient client(espClient);

void setup()
{
  Serial.begin(9600);

  wifiSetup();

  pinMode(pirPin, INPUT);
  pinMode(buttonPin, INPUT);
  pinMode(ledPin, OUTPUT);

  attachInterrupt(buttonPin, buttonInterrupt, FALLING);
  attachInterrupt(pirPin, pirInterrupt, CHANGE);

  digitalWrite(ledPin, LOW);
  delay(200);
  digitalWrite(ledPin, HIGH);
  delay(200);
  digitalWrite(ledPin, LOW);
  delay(200);
  digitalWrite(ledPin, HIGH);
  delay(200);

  Serial.println("Start");

}
 
void loop()
{
  wifiLoop();

  if(pirChanged)
  {
    //low = no motion, high = motion
    if (pirState == HIGH)
    {
      //Serial.println("Motion detected  ALARM");
      client.publish(topicPirOut, "ON");
      pirState = LOW;
    }
    else if (pirState == LOW)
    {
      //Serial.println("Motion detected  ALARM");
      client.publish(topicPirOut, "OFF");
      pirState = LOW;
    }
    pirChanged = false;
  }
  

  if(buttonPressed)
  {
    ledState = !ledState;

    if (ledState == LOW)
    {
      client.publish(topicSwitchOut, "ON");
    }
    else
    {
      client.publish(topicSwitchOut, "OFF");
    }
    buttonPressed = false;
  }

  digitalWrite(ledPin, ledState);
 
  delay(100);
}


void pirInterrupt()
{
  Serial.print("pirInterrupt ");
  static const int bounceTime = 500;
  static int lastMotionDetected = 0;
  
  int currentTime = millis();
  int pirCurrentState = digitalRead(pirPin);
  
  if (pirCurrentState == HIGH)
  {
    if(currentTime - lastMotionDetected > bounceTime)
    {
      pirState = HIGH; 
      pirChanged = true;
      Serial.println("MOTION");
    }
    else
    {
      Serial.println("MOTION HANDLED");
    }
    
    lastMotionDetected = currentTime;
  }
  else
  {
    pirState = LOW;
    pirChanged = true;
    Serial.println("NO MOTION");
  }
}

void buttonInterrupt()
{
  //Serial.println("buttonInterrupt");
  static const int bounceTime = 500;
  static int lastPressDetected = 0;
  
  int currentTime = millis();
  
  if (currentTime - lastPressDetected > bounceTime)
  {
    lastPressDetected = currentTime;
    buttonPressed = true;
    //Serial.println("Interrupt valid");
  }
}

