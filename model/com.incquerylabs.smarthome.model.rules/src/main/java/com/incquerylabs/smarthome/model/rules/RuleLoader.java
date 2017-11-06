package com.incquerylabs.smarthome.model.rules;

import java.io.IOException;
import java.net.URL;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import org.osgi.framework.FrameworkUtil;

import com.incquerylabs.smarthome.eventbusservice.DrlConfiguration;
import com.incquerylabs.smarthome.eventbusservice.DtableConfiguration;
import com.incquerylabs.smarthome.eventbusservice.IRuleLoader;
import com.incquerylabs.smarthome.eventbusservice.RuleTemplateConfiguration;

public class RuleLoader implements IRuleLoader {

    List<String> drlPaths = null;

    @Override
    public List<DrlConfiguration> getDrls() {

        List<DrlConfiguration> list = new LinkedList<DrlConfiguration>();

        List<URL> loadedDrls = Collections
                .list(FrameworkUtil.getBundle(getClass()).findEntries("/src/main/resources/base-rules", "*.drl", true));

        loadedDrls.addAll(Collections
                .list(FrameworkUtil.getBundle(getClass()).findEntries("/src/main/resources/gen-rules", "*.drl", true)));

        for (URL url : loadedDrls) {
            addInputStreamToList(url, list);
        }
        return list;
    }

    private void addInputStreamToList(URL url, List<DrlConfiguration> list) {
        try {
            list.add(new DrlConfiguration(url.openStream(),url.getFile()));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

	@Override
	public List<DtableConfiguration> getDtables() {
		return null;
	}

	@Override
	public List<RuleTemplateConfiguration> getRuleTemplates() {
		return null;
	}
}
