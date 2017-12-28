# _Smarthome_ cep demonstrator
This demonstrator uses **Complex Event Processing** ([CEP](https://en.wikipedia.org/wiki/Complex_event_processing)) to automate devices in a **smart home simulator**, [HomeIO](https://realgames.co/home-io/). It uses [Drools](https://www.drools.org/) as a Complex Event Processing rule engine for [Eclipse SmartHome](https://www.eclipse.org/smarthome/). The HomeIO integration is separated to a standalone [repository](https://github.com/IncQueryLabs/openhab-homeio-mqtt-bridge), but required by this demonstrator.

## Install and tryout
To install and tryout this demonstrator, follow the [developer guide](https://github.com/IncQueryLabs/smarthome-cep-demonstrator/wiki/Developer-Guide).

## Case study
A case study with example Drools smart home automation rules for HomeIO can be found in the [wiki](https://github.com/IncQueryLabs/smarthome-cep-demonstrator/wiki/HomeIO-case-study-with-Drools-rules).

## Rule generator tool
This project also contains a basic rule generator tool for Eclipse to help the creation of smart home automation rules. This rule generator uses an [EMF](https://www.eclipse.org/modeling/emf/) model to model a simple automation rule. Smart home automation rules are generated for this Drools rule engine with [VIATRA](https://www.eclipse.org/viatra/) + [XTEND](https://www.eclipse.org/xtend/documentation/). There is also a graphical editor for this model with [Sirius](http://www.eclipse.org/sirius/). Examples for this rule generator tool can be found in the [wiki](https://github.com/IncQueryLabs/smarthome-cep-demonstrator/wiki/Rule-generator-tool-examples).

## Extended event bus
Drools rule engine operates on objects. However, the Eclipse SmartHome event bus uses only the string name of the item to communicate on the event bus. To solve this, an extended event bus is created, with the same events as in Eclipse SmartHome, but they use the item object instead of the name of the item. More can be read about it in the [wiki](https://github.com/IncQueryLabs/smarthome-cep-demonstrator/wiki/Extended-event-bus).

## Repository layout
1. Demo rules for HomeIO in [demo/com.incquerylabs.smarthome.demorules.homeio/src/main/resources/](https://github.com/IncQueryLabs/smarthome-cep-demonstrator/tree/master/demo/com.incquerylabs.smarthome.demorules.homeio/src/main/resources)
2. Target platform: [releng/com.incquerylabs.smarthome.target](https://github.com/IncQueryLabs/smarthome-cep-demonstrator/tree/master/releng/com.incquerylabs.smarthome.target)
3. Run configuration files: [smarthome-simulator/HomeIO/homeio-resources/launch/](https://github.com/IncQueryLabs/smarthome-cep-demonstrator/tree/master/smarthome-simulator/HomeIO/homeio-resources/launch)
4. OpenHAB configuration files: [smarthome-simulator/HomeIO/homeio-resources/distro-resources/src/main/resources](https://github.com/IncQueryLabs/smarthome-/cep-demonstrator/tree/master/smarthome-simulator/HomeIO/homeio-resources/distro-resources/src/main/resources)
5. Extended event bus + Drools rule engine: [runtime/](https://github.com/IncQueryLabs/smarthome-cep-demonstrator/tree/master/runtime)
6. Rule generator tool: [model/](https://github.com/IncQueryLabs/smarthome-cep-demonstrator/tree/master/model)
7. Code for the physical motion sensor: [sensors/](https://github.com/IncQueryLabs/smarthome-cep-demonstrator/tree/master/sensors)