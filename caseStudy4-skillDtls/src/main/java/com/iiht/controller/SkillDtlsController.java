package com.iiht.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.iiht.model.SkillDtls;
import com.iiht.service.SkillDtlsService;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
public class SkillDtlsController {
	@Autowired
	SkillDtlsService skillDtlsService;

	@GetMapping("/hello")
	String sayHello() {
		return "hello";
	}

	@GetMapping("/skill")
	public List<SkillDtls> getAllSkill() {
		return skillDtlsService.getAllSkillDtls();
	}

	@PostMapping("/skill")
	public void addSkill(@RequestBody SkillDtls skillDtls) {
		skillDtlsService.addSkillDtls(skillDtls);
	}
	
	@GetMapping("/skill/{search}")
	public List<SkillDtls> searchSkill(@PathVariable String search) {
		return skillDtlsService.searchSkill(search);
	}
	
	@DeleteMapping("/skill/{id}")
	public void deleteSkillDtls(@PathVariable Long id) {
		skillDtlsService.deleteSkillDtls(id);
	}
	
	@PutMapping("/skill/update/{id}")
	public void updateSkillDtls(@PathVariable Long id,@RequestBody SkillDtls skillDtls){
		skillDtlsService.updateSkillDtls(id,skillDtls);
	}
	
	
}