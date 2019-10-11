package com.iiht.model;

import java.io.Serializable;

public class JwtResponse implements Serializable {

	private static final long serialVersionUID = -8091879091924046844L;
	private final String jwttoken;
	private DAOUser user;

	public DAOUser getUser() {
		return user;
	}

	public void setUser(DAOUser user) {
		this.user = user;
	}


	public String getToken() {
		return this.jwttoken;
	}

	public JwtResponse(String jwttoken, DAOUser user) {
		this.jwttoken = jwttoken;
		this.user = user;
	}
	
}