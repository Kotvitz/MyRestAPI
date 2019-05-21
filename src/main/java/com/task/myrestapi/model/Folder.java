package com.task.myrestapi.model;

import java.util.List;

public class Folder {
	String path;
	String id;
	List<Asset> assets;
	
	public Folder(String path, String id, List<Asset> assets) {
		this.path = path;
		this.id = id;
		this.assets = assets;
	}
	
	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public List<Asset> getAssets() {
		return assets;
	}

	public void setAssets(List<Asset> assets) {
		this.assets = assets;
	}
}
