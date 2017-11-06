package com.incquerylabs.smarthome.eventbusservice;

import java.io.InputStream;

public class DrlConfiguration {
	private InputStream drl;
	private String path;

	public DrlConfiguration(InputStream drl, String path) {
		this.drl = drl;
		this.path = path;
	}

	public InputStream getDrl() {
		return drl;
	}

	public void setDrl(InputStream drl) {
		this.drl = drl;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}
}
