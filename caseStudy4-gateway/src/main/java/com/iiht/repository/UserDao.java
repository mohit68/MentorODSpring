package com.iiht.repository;

import org.springframework.data.repository.CrudRepository;


import com.iiht.model.DAOUser;


public interface UserDao extends CrudRepository<DAOUser, Integer> {
	
	DAOUser findByUsername(String username);
	
}