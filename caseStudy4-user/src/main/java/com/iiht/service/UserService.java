package com.iiht.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.iiht.model.User;
import com.iiht.repository.UserRepository;

@Service
@Transactional
public class UserService {
	 
	@Autowired
	private JavaMailSender javaMailSender;

	@Autowired
	UserRepository userRepository;

	public List<User> getAllUser() {
		return (List<User>) userRepository.findAll();
	}

	public void saveUser(User user) {
		userRepository.save(user);

		SimpleMailMessage msg = new SimpleMailMessage();
		msg.setTo(user.getUserName());

		msg.setSubject("WellCome "+user.getFirstName() +" "+user.getLastName()+" mentor on Demand");
		msg.setText("U have successfully Registered as "+user.getRole());

		javaMailSender.send(msg);

	}

	public void deleteUser(Long id) {
		userRepository.deleteById(id);
	}
	
	public void updateUser(long id, User user){
		user.setId(id);
		userRepository.save(user);
	}
	
}