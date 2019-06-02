package com.embracon.model;

import lombok.Data;

@Data
public class Dream {
	
	private String id;
	
	private String desc;
	
	private String expiration_date;
	
	private String done_date;
	
	private String hide_flag;
	
	private String photo_id;
	
	private String done_flag;
	
	
	
	

	public Dream() {
		super();
	}

	public Dream(Dream d) {
		super();
		this.id = d.id;
		this.desc = d.desc;
		this.expiration_date = d.expiration_date;
		this.done_date = d.done_date;
		this.hide_flag = d.hide_flag;
		this.photo_id = d.photo_id;
		this.done_flag = d.done_flag;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String getExpiration_date() {
		return expiration_date;
	}

	public void setExpiration_date(String expiration_date) {
		this.expiration_date = expiration_date;
	}

	public String getDone_date() {
		return done_date;
	}

	public void setDone_date(String done_date) {
		this.done_date = done_date;
	}

	public String getHide_flag() {
		return hide_flag;
	}

	public void setHide_flag(String hide_flag) {
		this.hide_flag = hide_flag;
	}

	public String getPhoto_id() {
		return photo_id;
	}

	public void setPhoto_id(String photo_id) {
		this.photo_id = photo_id;
	}

	public String getDone_flag() {
		return done_flag;
	}

	public void setDone_flag(String done_flag) {
		this.done_flag = done_flag;
	}
	
	

}
