package com.demo.arnaldi.services;

public interface SecurityService {
	String findLoggedInUsername();

	void autoLogin(String username, String password);
	
}
