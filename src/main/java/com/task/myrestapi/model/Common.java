package com.task.myrestapi.model;

import java.util.Date;

public class Common {
	Date created;
	Date modified;
	String name;

	public Common(Date created, Date modified, String name) {
		this.created = created;
		this.modified = modified;
		this.name = name;
	}

	public Date getCreated() {
		return created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}

	public Date getModified() {
		return modified;
	}

	public void setModified(Date modified) {
		this.modified = modified;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
