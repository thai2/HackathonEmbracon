package com.embracon.model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "users")
public class User {
	
	@Id
	private String id;
	
	private String name;
	
	private List<Dream> dreams;

	public String getId() {
		return id;
	}

	public void setId(String id) {

			this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Dream> getDreams() {
		return dreams;
	}

	public void setDreams(List<Dream> dreams) {
		this.dreams = dreams;
	}
	
	
	

}
