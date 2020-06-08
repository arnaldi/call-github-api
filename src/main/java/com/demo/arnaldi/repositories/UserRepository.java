package com.demo.arnaldi.repositories;

import org.springframework.data.repository.CrudRepository;

import com.demo.arnaldi.model.User;

public interface UserRepository extends CrudRepository<User, Long>{
	User findByUsername(String username);

}
