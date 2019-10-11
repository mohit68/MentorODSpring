package com.iiht.controller;

import java.net.URISyntaxException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.iiht.caseStudy4gateway.CaseStudy4Component;
import com.iiht.model.SearchResultList;
import com.iiht.model.User;


@RestController
@ComponentScan
@CrossOrigin(origins = "*", maxAge = 3600)
public class CaseStudy4Controller {
	
	@Autowired
	CaseStudy4Component caseStudy4Component;
	
	@RequestMapping(value = "/hello")
    public String sayHello(){
		return "Hello";
    }
	
	@RequestMapping(value = "/user")
    public List<User> getAllUser() throws URISyntaxException {
		System.out.println("message from gateway- calling getAllUser  >>>>>>>>>>>>>");
		return caseStudy4Component.getAllUser();
    }
	
	
	@GetMapping("/search")
	public List<List> getAllSerachResult() throws URISyntaxException {
		return caseStudy4Component.getAllSerachResult();
	}
	
	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping("/search/{search}")
	public List<SearchResultList> getSerachResult(@PathVariable String search) throws URISyntaxException {
		return caseStudy4Component.getSerachResult(search);
	}
	
	

}
