package com.iiht.model;

import java.util.ArrayList;
import java.util.List;

public class SkillDtlsList {
	private List<SkillDtls> skillDtls;

	public SkillDtlsList() {
		skillDtls = new ArrayList<>();
	}

	public List<SkillDtls> getSkillDtls() {
		return skillDtls;
	}

	public void setSkillDtls(List<SkillDtls> skillDtls) {
		this.skillDtls = skillDtls;
	}

	@Override
	public String toString() {
		return "SkillDtlsList [skillDtls=" + skillDtls + "]";
	}

}
