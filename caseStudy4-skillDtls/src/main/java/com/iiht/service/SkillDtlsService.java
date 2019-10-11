package com.iiht.service;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.iiht.model.SkillDtls;
import com.iiht.repository.SkillDtlsRepository;

@Service
@Transactional
public class SkillDtlsService {

	@Autowired
	SkillDtlsRepository skillDtlsRepository;

	public List<SkillDtls> getAllSkillDtls() {
		// TODO Auto-generated method stub
		return (List<SkillDtls>) skillDtlsRepository.findAll();
	}

	public void addSkillDtls(SkillDtls skillDtls) {
		skillDtlsRepository.save(skillDtls);

	}

	public List<SkillDtls> searchSkill(String search) {
		System.out.println("hello");
		// TODO Auto-generated method stub
		List<SkillDtls> skillDtls = (List<SkillDtls>) skillDtlsRepository.findAll();
		ListIterator<SkillDtls> iterator = skillDtls.listIterator();
		List<SkillDtls> skillDtls2 = new ArrayList<SkillDtls>();
		System.out.println("till here");
		System.out.println(iterator.toString());
		while (iterator.hasNext()) {
			SkillDtls s2 = iterator.next();
			String name = s2.getName().toLowerCase();
			String toc=s2.getToc().toLowerCase();
			if (name.contains(search.toLowerCase()) || toc.contains(search.toLowerCase())) {
				skillDtls2.add(s2);
			}
		}
		return skillDtls2;

	}
	
	public void deleteSkillDtls(Long id) {
		skillDtlsRepository.deleteById(id);
	}

	public void updateSkillDtls(Long id, SkillDtls skillDtls) {
		skillDtls.setId(id);
		skillDtlsRepository.save(skillDtls);
		
	}

}
