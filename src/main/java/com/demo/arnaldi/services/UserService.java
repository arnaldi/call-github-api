package com.demo.arnaldi.services;

import com.demo.arnaldi.model.User;

public interface UserService {
	
	void save(User user);

    User findByUsername(String username);

}
