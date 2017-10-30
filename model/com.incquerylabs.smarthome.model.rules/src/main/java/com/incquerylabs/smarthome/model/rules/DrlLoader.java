package com.incquerylabs.smarthome.model.rules;

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

        List<URL> loadedDrls = Collections
                .list(FrameworkUtil.getBundle(getClass()).findEntries("/src/main/resources/base-rules", "*.drl", true));

        loadedDrls.addAll(Collections
                .list(FrameworkUtil.getBundle(getClass()).findEntries("/src/main/resources/gen-rules", "*.drl", true)));

        for (URL url : loadedDrls) {
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
