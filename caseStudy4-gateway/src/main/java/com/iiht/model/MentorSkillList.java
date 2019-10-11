package com.iiht.model;

import java.util.ArrayList;
import java.util.List;

public class MentorSkillList {

	private List<MentorSkills> mentorSkills;

	public MentorSkillList() {
		mentorSkills = new ArrayList<>();
	}

	public List<MentorSkills> getMentorSkills() {
		return mentorSkills;
	}

	public void setMentorSkills(List<MentorSkills> mentorSkills) {
		this.mentorSkills = mentorSkills;
	}

	@Override
	public String toString() {
		return "MentorSkillList [mentorSkills=" + mentorSkills + "]";
	}

}
