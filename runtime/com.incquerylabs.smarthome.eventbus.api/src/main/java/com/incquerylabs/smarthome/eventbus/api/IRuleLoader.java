package com.incquerylabs.smarthome.eventbus.api;

import java.util.List;

public interface IRuleLoader {
    public List<DrlConfiguration> getDrls();
    public List<DtableConfiguration> getDtables();
    public List<RuleTemplateConfiguration> getRuleTemplates();
}

