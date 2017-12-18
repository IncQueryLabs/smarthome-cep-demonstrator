package com.incquerylabs.smarthome.eventbus.api;

import java.io.InputStream;

public class DrlConfiguration {
	protected final InputStream drl;
	protected final String path;
	
	public DrlConfiguration(InputStream drl, String path) {
		this.drl = drl;
		this.path = path;
	}

	public InputStream getDrl() {
		return drl;
	}

	public String getPath() {
		return path;
	}
}
