package com.incquerylabs.smarthome.demorules.homeio;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.AbstractMap.SimpleEntry;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;

import org.osgi.framework.FrameworkUtil;

import com.incquerylabs.smarthome.eventbusservice.IDrlLoader;

public class DrlLoader implements IDrlLoader {

    List<String> drlPaths = null;

    @Override
    public List<Entry<String, InputStream>> getDrls() {

        List<Entry<String, InputStream>> list = new LinkedList<Entry<String, InputStream>>();

        List<URL> e = Collections
                .list(FrameworkUtil.getBundle(getClass()).findEntries("/src/main/resources/", "*.drl", true));

        for (URL url : e) {
            addInputStreamToList(url, list);
        }
        return list;
    }

    private void addInputStreamToList(URL url, List<Entry<String, InputStream>> list) {
        try {
            list.add(new SimpleEntry<String, InputStream>(url.getFile(), url.openStream()));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
