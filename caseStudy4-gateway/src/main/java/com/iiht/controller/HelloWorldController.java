package com.iiht.controller;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@ComponentScan
@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
public class HelloWorldController {

	@RequestMapping({ "/hello1" })
	public String firstPage() {
		return "Hello World";
	}

}