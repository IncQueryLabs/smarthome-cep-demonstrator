package com.incquerylabs.smarthome.eventbus.api;

import java.io.InputStream;

public class DtableConfiguration {
	protected final InputStream dtable;
	protected final String path;

	public DtableConfiguration(InputStream dtable, String path) {
		this.dtable = dtable;
		this.path = path;
	}

	public InputStream getDtable() {
		return dtable;
	}

	public String getPath() {
		return path;
	}
}
