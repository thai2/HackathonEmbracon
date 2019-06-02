package com.embracon.dto;

import java.util.List;

import com.embracon.model.User;

public class RequestUser {
	
	private List<User> user;

	public List<User> getUser() {
		return user;
	}

	public void setUser(List<User> user) {
		this.user = user;
	}

}
