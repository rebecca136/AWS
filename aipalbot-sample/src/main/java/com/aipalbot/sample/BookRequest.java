package com.aipalbot.sample;

import java.io.Serializable;

public class BookRequest implements Serializable{
	

private static final long serialVersionUID = 1L;	
	
	private String userId;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	

}
