package com.spring;

public class Spring {
	//Data members
	private String message;
	//setters and getters
	
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	
	
	//generate to string
	@Override
	public String toString() {
		return "WishMessgae [message=" + message + "]";
	}

}
