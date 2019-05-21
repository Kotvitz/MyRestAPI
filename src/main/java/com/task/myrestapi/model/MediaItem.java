package com.task.myrestapi.model;

public class MediaItem {
	String essenceType;
	String track;
	String start;
	String length;
	String mobId;
	String online;
	String type;

	public MediaItem(String essenceType, String track, String start, String length, String mobId, String online,
			String type) {
		this.essenceType = essenceType;
		this.track = track;
		this.start = start;
		this.length = length;
		this.mobId = mobId;
		this.online = online;
		this.type = type;
	}

	public String getEssenceType() {
		return essenceType;
	}

	public void setEssenceType(String essenceType) {
		this.essenceType = essenceType;
	}

	public String getTrack() {
		return track;
	}

	public void setTrack(String track) {
		this.track = track;
	}

	public String getStart() {
		return start;
	}

	public void setStart(String start) {
		this.start = start;
	}

	public String getLength() {
		return length;
	}

	public void setLength(String length) {
		this.length = length;
	}

	public String getMobId() {
		return mobId;
	}

	public void setMobId(String mobId) {
		this.mobId = mobId;
	}

	public String getOnline() {
		return online;
	}

	public void setOnline(String online) {
		this.online = online;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

}
