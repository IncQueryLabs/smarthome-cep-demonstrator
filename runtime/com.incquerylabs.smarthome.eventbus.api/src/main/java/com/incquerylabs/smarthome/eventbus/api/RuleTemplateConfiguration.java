package com.incquerylabs.smarthome.eventbus.api;

import java.io.InputStream;
import java.util.List;

public class RuleTemplateConfiguration {

	private InputStream templateData;
	private String path;
	private String worksheetName;
	private int startRow;
	private int startColumn;
	private List<DrlConfiguration> templateRules;

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

	public void setTemplateData(InputStream templateData) {
		this.templateData = templateData;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public String getWorksheetName() {
		return worksheetName;
	}

	public void setWorksheetName(String worksheetName) {
		this.worksheetName = worksheetName;
	}

	public int getStartRow() {
		return startRow;
	}

	public void setStartRow(int startRow) {
		this.startRow = startRow;
	}

	public int getStartColumn() {
		return startColumn;
	}

	public void setStartColumn(int startColumn) {
		this.startColumn = startColumn;
	}

	public List<DrlConfiguration> getTemplateRules() {
		return templateRules;
	}

	public void setTemplateRules(List<DrlConfiguration> templateRules) {
		this.templateRules = templateRules;
	}

}
