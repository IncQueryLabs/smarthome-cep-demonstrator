package com.incquerylabs.smarthome.rules;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
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

        List<DrlConfiguration> drlList = new LinkedList<DrlConfiguration>();

        List<URL> urls = Collections
                .list(FrameworkUtil.getBundle(getClass()).findEntries("/src/main/resources/", "*.drl", true));

        for (URL url : urls) {
            addInputStreamToList(url, drlList);
        }
        return drlList;
    }

	@Override
	public List<DtableConfiguration> getDtables() {
		List<DtableConfiguration> dtableList = new LinkedList<DtableConfiguration>();
		
        List<URL> urls = new ArrayList<URL>();
        Enumeration<URL> foundUrls = FrameworkUtil.getBundle(getClass()).findEntries("/src/main/resources/dtables/", "*.xlsx", true);
        if(foundUrls != null) {
        	urls = Collections.list(foundUrls);
        }
        
        for (URL url : urls) {
            try {
				dtableList.add(new DtableConfiguration(url.openStream(), url.getFile()));
			} catch (IOException e) {
				e.printStackTrace();
			}
        }
		return dtableList;
	}

	@Override
	public List<RuleTemplateConfiguration> getRuleTemplates() {
		List<RuleTemplateConfiguration> ruleTemplateList = new LinkedList<RuleTemplateConfiguration>();
		return ruleTemplateList;
	}
	
    private void addInputStreamToList(URL url, List<DrlConfiguration> list) {
        try {
            list.add(new DrlConfiguration(url.openStream(), url.getFile()));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
