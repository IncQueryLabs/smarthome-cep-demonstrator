package com.incquerylabs.smarthome.demorules.homeio;

import java.io.IOException;
import java.net.URL;
import java.util.Collections;
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
		
        List<URL> urls = Collections
                .list(FrameworkUtil.getBundle(getClass()).findEntries("/src/main/resources/dtables/", "*.xlsx", true));
        
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
		List<DrlConfiguration> templateRules = new LinkedList<DrlConfiguration>();
		
		try {
			URL drtUrl = FrameworkUtil.getBundle(getClass()).getEntry("src/main/resources/ruletemplates/motion-template.drt");
			templateRules.add(new DrlConfiguration(drtUrl.openStream(), drtUrl.getFile()));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		URL templateDataUrl = FrameworkUtil.getBundle(getClass()).getEntry("src/main/resources/ruletemplates/motion-template-data.xlsx");
		RuleTemplateConfiguration ruleTempConf;
		try {
			ruleTempConf = new RuleTemplateConfiguration(templateDataUrl.openStream(), templateDataUrl.getFile(), "Motion template", 2, 1, templateRules);
			ruleTemplateList.add(ruleTempConf);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
        
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
