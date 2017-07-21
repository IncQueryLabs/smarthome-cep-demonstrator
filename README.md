# OpenHAB

## OpenHAB configuration files
These files are taken from my OpenHAB instance, copying them to your OpenHAB instance **should** work (not tested yet). It requires the requires **HABPanel, Experimental Rule engine, MQTT binding, Astro binding, Yahoo wheather binding, dandridbinding**

1. Check your OpenHAB instance, and install the missing bindings.
2. dandridbinding has to be compiled to jar file, I used the **dandridbinding.jar* name for it (not sure if it matters).
3. **conf** folder is the configuration folder of OpenHAB, locate your configuration oflder (it depends on the install), and copy the fils there. It contains MQTT configuration files, and some images for the HABPanel
4. **userdata** folder contains rules, items, things, linking between them and the HABPanel UI panel configuration, shown in the demo (dont forget to load the UI from your HABPanel once done).
