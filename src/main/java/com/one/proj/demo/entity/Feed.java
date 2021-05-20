package com.one.proj.demo.entity;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;


import java.util.List;

public class Feed {
	@JacksonXmlElementWrapper(useWrapping = false)
	private List<Entry> entry;

	public List<Entry> getEntry() {
		return entry;
	}

	public void setEntry(List<Entry> entry) {
		this.entry = entry;
	}

	public Feed() {
	}

	public Feed(List<Entry> entry) {
		this.entry = entry;
	}
}
