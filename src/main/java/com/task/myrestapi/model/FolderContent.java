package com.task.myrestapi.model;

import java.util.List;

public class FolderContent {
	String id;
	List<Asset> assets;

	public FolderContent(String id, List<Asset> assets) {
		this.id = id;
		this.assets = assets;
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
