package com.incquerylabs.smarthome.eventbus.api;

import java.io.InputStream;
import java.util.List;

public class RuleTemplateConfiguration {
	// Table of data
	protected final InputStream templateData;
	protected final String path;
	protected final String worksheetName;

	//parameters where the data starts in the table
	protected final int startRow;
	protected final int startColumn;
	
	// The template data can be applied on many template rules
	protected final List<DrlConfiguration> templateRules;

	public RuleTemplateConfiguration(InputStream templateData, String path, String worksheetName, int startRow,
			int startColumn, List<DrlConfiguration> templateRules) {
		this.templateData = templateData;
		this.path = path;
		this.worksheetName = worksheetName;
		this.startRow = startRow;
		this.startColumn = startColumn;
		this.templateRules = templateRules;
	}

	public InputStream getTemplateData() {
		return templateData;
	}

	public String getPath() {
		return path;
	}
	
	public String getWorksheetName() {
		return worksheetName;
	}

	public int getStartRow() {
		return startRow;
	}

	public int getStartColumn() {
		return startColumn;
	}

	public List<DrlConfiguration> getTemplateRules() {
		return templateRules;
	}
}
