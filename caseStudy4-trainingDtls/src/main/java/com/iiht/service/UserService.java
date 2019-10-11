package com.iiht.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.iiht.model.TrainingDtls;
import com.iiht.model.User;
import com.iiht.repository.UserRepository;

@Service
@Transactional
public class UserService {
	
	@Autowired
	UserRepository userRepository;
	

	
	public List<User> getAllUser(){
		return (List<User>) userRepository.findAll();
	}
	
	public void saveUser(User user) {
		userRepository.save(user);
	}

	
}