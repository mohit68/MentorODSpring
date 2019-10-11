package com.iiht.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import com.iiht.model.DAOUser;
import com.iiht.model.MentorSkills;
import com.iiht.model.UserDTO;
import com.iiht.repository.MentorSkillsRepository;
import com.iiht.repository.UserDao;

@Service
@Transactional
public class JwtUserDetailsService implements UserDetailsService {

	@Autowired
	private JavaMailSender javaMailSender;
	
	@Autowired
	private PasswordEncoder bcryptEncoder;
	
	@Autowired
	private UserDao userDao;
	
	@Autowired
	private MentorSkillsRepository mentorSkillsRepository;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		DAOUser user = userDao.findByUsername(username);
		if (user == null) {
			throw new UsernameNotFoundException("User not found with username: " + username);
		}
		return new org.springframework.security.core.userdetails.User(user.getUsername(), user.getPassword(),
				new ArrayList<>());
	}
	
	public DAOUser save(DAOUser user) {
		System.out.println("here "+user.getUsername()+user.getPassword());
		
		//DAOUser newUser = new DAOUser();
		//newUser.setUsername(user.getUsername());
		user.setPassword(bcryptEncoder.encode(user.getPassword()));
		
		SimpleMailMessage msg = new SimpleMailMessage();
		msg.setTo(user.getUsername());

		msg.setSubject("WellCome "+user.getFirstName() +" "+user.getLastName()+" mentor on Demand");
		msg.setText("U have successfully Registered as "+user.getRole());

		javaMailSender.send(msg);
		userDao.save(user);
		
		if(user.getRole().equals("mentor")){
			MentorSkills mentorSkills=new MentorSkills();
			mentorSkills.setMentorId(user.getId());
			mentorSkills.setMentorName(user.getFirstName()+" "+user.getLastName());
			mentorSkills.setYearsOfExperience(user.getYearsOfExperience());
			mentorSkills.setSkills(user.getSkills());
			mentorSkillsRepository.save(mentorSkills);
			
		}
		
		
		return user;
	}
}