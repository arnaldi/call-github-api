package com.demo.arnaldi.services;

import java.util.HashSet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.demo.arnaldi.model.Role;
import com.demo.arnaldi.model.User;
import com.demo.arnaldi.repositories.RoleRepository;
import com.demo.arnaldi.repositories.UserRepository;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private RoleRepository roleRepository;
	
	@Autowired
	private BCryptPasswordEncoder bCryptPasswordEncoder; 

	@Override
	public void save(User user) {
		user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
		user.setRoles( new HashSet<Role>(roleRepository.findAll()));
		userRepository.save(user);
		
	}

	@Override
	public User findByUsername(String username) {
		
		return userRepository.findByUsername(username);
	}

}
