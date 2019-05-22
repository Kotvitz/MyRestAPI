package com.task.myrestapi.model;

import java.util.List;

import com.google.gson.annotations.SerializedName;

public class Asset {
	List<Attribute> attributes;
	Base base;
	String mobId;
	Common common;
	
	@SerializedName("media-items")
	List<MediaItem> mediaItems;

	public Asset(List<Attribute> attributes, Base base, String mobId, Common common, List<MediaItem> mediaItems) {
		this.attributes = attributes;
		this.base = base;
		this.mobId = mobId;
		this.common = common;
		this.mediaItems = mediaItems;
	}

	public List<Attribute> getAttributes() {
		return attributes;
	}

	public void setAttributes(List<Attribute> attributes) {
		this.attributes = attributes;
	}

	public Base getBase() {
		return base;
	}

	public void setBase(Base base) {
		this.base = base;
	}

	public String getMobId() {
		return mobId;
	}

	public void setMobId(String mobId) {
		this.mobId = mobId;
	}

	public Common getCommon() {
		return common;
	}

	public void setCommon(Common common) {
		this.common = common;
	}

	public List<MediaItem> getMediaItems() {
		return mediaItems;
	}

	public void setMediaItems(List<MediaItem> mediaItems) {
		this.mediaItems = mediaItems;
	}
}
