# OpenSHS
Open Smart Home Simulator

# #Quick start
Ensure you have blender installed. To start a simulation of our demo:

```
cd app/
python openshs start -c morning
```

## My python files.
1. **app/blender/mymqtt.py** The MQTT subscriber pool module. Referenced from the blender objects .py file.
2. app/python/mqtt-general.py This is a template file, which can be inserted into a blender object .py file. It contains code snippet for subscribing to MQTT and publishing messages.
3. app/python/mqtt-publish.py This was a test file for publishing.
4. app/python/mqtt-subscribe.py This was a test file for subscribing.