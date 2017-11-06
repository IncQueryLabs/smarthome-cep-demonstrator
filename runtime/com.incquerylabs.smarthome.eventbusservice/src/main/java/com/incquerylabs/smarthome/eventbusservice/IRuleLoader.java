package com.incquerylabs.smarthome.eventbusservice;

import java.util.List;

public interface IRuleLoader {
    public List<DrlConfiguration> getDrls();
    
    public List<DtableConfiguration> getDtables();
    
    public List<RuleTemplateConfiguration> getRuleTemplates();
}
