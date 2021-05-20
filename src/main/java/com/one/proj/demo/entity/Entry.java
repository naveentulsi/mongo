package com.one.proj.demo.entity;

public class Entry {
	private String id;
	private String title;
	private String parents;
	private String imageUrl;
	private String showpath;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getParents() {
		return parents;
	}

	public void setParents(String parents) {
		this.parents = parents;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public String getShowpath() {
		return showpath;
	}

	public void setShowpath(String showpath) {
		this.showpath = showpath;
	}

	public Entry() {
	}

	public Entry(String id, String title, String parents, String imageUrl, String showpath) {
		this.id = id;
		this.title = title;
		this.parents = parents;
		this.imageUrl = imageUrl;
		this.showpath = showpath;
	}
}
