# OpenHAB
Make sure you have read [OpenHAB wiki](https://github.com/IncQueryLabs/smarthome-cep-demonstrator/wiki/OpenHAB)

## OpenHAB configuration files
These files are taken from my OpenHAB instance, copying them to your OpenHAB instance **should** work. 

### Install dependencies
The configuration files requires the following bindings to be installed:

1. **HABPanel**
2. **Experimental Rule engine**
4. **MQTT binding**
5. **Astro binding**
6. **Yahoo wheather binding**
7. **dandridbinding**


### Copy the files

1. dandridbinding has to be compiled to jar file, I used the *dandridbinding.jar* name for it (not sure if it matters).
2. **conf** folder is the configuration folder of OpenHAB, locate your configuration oflder (it depends on the install), and copy the files there. It contains MQTT configuration files, and some images for the HABPanel
3. **userdata** folder contains rules, items, things, linking between them and the HABPanel UI panel configuration, shown in the demo (dont forget to load the UI from your HABPanel once done).


