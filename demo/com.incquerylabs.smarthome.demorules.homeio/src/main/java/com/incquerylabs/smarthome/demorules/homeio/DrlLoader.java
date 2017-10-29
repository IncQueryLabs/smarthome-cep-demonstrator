package com.incquerylabs.smarthome.demorules.homeio;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.AbstractMap.SimpleEntry;
import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;

import org.osgi.framework.FrameworkUtil;

import com.incquerylabs.smarthome.eventbusservice.IDrlLoader;

public class DrlLoader implements IDrlLoader {

    List<String> drlPaths = null;

    private void initDrlPaths() {
        drlPaths = new LinkedList<String>();

        drlPaths.add("rules/Common.drl");
        drlPaths.add("rules/Alarm.drl");
        drlPaths.add("rules/Timing.drl");

        char[] dimmeRooms = { 'A', 'D', 'E', 'H', 'I', 'J', 'K', 'L', 'N' };
        char[] lightsRooms = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N' };
        char[] motionRoomes = { 'A', 'B', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N' };
        char[] rollershadesRooms = { 'A', 'D', 'E', 'F', 'G', 'H', 'J', 'L', 'M', 'N' };

        for (char room : dimmeRooms) {
            drlPaths.add("rules/dimmer/Room-" + room + ".drl");
        }
        for (char room : lightsRooms) {
            drlPaths.add("rules/lights/Room-" + room + ".drl");
        }
        for (char room : motionRoomes) {
            drlPaths.add("rules/motion/Room-" + room + ".drl");
        }
        for (char room : rollershadesRooms) {
            drlPaths.add("rules/rollershades/Room-" + room + ".drl");
        }
    }

    @Override
    public List<Entry<String, InputStream>> getDrls() {
        initDrlPaths();

        List<Entry<String, InputStream>> list = new LinkedList<Entry<String, InputStream>>();

        for (String path : drlPaths) {
            addPathToList("/src/main/resources/" + path, list);
        }
        return list;
    }

    private void addPathToList(String path, List<Entry<String, InputStream>> list) {
        try {
            URL drlUrl = FrameworkUtil.getBundle(getClass()).getEntry(path);
            list.add(new SimpleEntry<String, InputStream>(path, drlUrl.openStream()));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
