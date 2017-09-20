package com.incquerylabs.smarthome.eventbusservice;

import java.io.InputStream;
import java.util.List;
import java.util.Map.Entry;

public interface IDrlLoader {
    public List<Entry<String, InputStream>> getDrls();
}
