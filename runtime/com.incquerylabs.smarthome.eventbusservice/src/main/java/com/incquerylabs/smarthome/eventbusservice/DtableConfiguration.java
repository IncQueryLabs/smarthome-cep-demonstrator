package com.incquerylabs.smarthome.eventbusservice;

import java.io.InputStream;

public class DtableConfiguration {
	private InputStream dtable;
	private String path;

	public DtableConfiguration(InputStream dtable, String path) {
		super();
		this.dtable = dtable;
		this.path = path;
	}

	public InputStream getDtable() {
		return dtable;
	}

	public void setDtable(InputStream dtable) {
		this.dtable = dtable;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

}
