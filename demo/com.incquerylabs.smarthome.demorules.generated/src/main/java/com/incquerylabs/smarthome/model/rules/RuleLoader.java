package com.incquerylabs.smarthome.model.rules;

import java.io.IOException;
import java.net.URL;
import java.util.Collections;
import java.util.Enumeration;
import java.util.LinkedList;
import java.util.List;

import org.osgi.framework.FrameworkUtil;

import com.incquerylabs.smarthome.eventbus.api.DrlConfiguration;
import com.incquerylabs.smarthome.eventbus.api.DtableConfiguration;
import com.incquerylabs.smarthome.eventbus.api.IRuleLoader;
import com.incquerylabs.smarthome.eventbus.api.RuleTemplateConfiguration;

public class RuleLoader implements IRuleLoader {

    List<String> drlPaths = null;

    @Override
    public List<DrlConfiguration> getDrls() {

        List<DrlConfiguration> list = new LinkedList<DrlConfiguration>();

        Enumeration<URL> baseRules = FrameworkUtil.getBundle(getClass()).findEntries("/src/main/resources/base-rules", "*.drl", true);
        Enumeration<URL> genRules = FrameworkUtil.getBundle(getClass()).findEntries("/src/main/resources/gen-rules", "*.drl", true);
        
        if(baseRules == null) {
        	throw new RuntimeException("Error, base-rules folder shouldn't be empty.");
        }
        if(genRules == null) {
        	throw new RuntimeException("Error, gen-rules folder shouldn't be empty. Have you forget to generate the rules?");
        }
        
        List<URL> loadedDrls = Collections.list(baseRules);
        loadedDrls.addAll(Collections.list(genRules));

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
