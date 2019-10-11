package com.iiht.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table(name = "MENTORSKILLS")
public class MentorSkills {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private Long mentorId;
	private String mentorName;
	private String skills;
	private float yearsOfExperience=0;
	private int trainingsCompleted=0;
	private float avgRating=0;
	private int rating=0;
	private String description;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getMentorId() {
		return mentorId;
	}

	public void setMentorId(Long mentorId) {
		this.mentorId = mentorId;
	}

	public String getMentorName() {
		return mentorName;
	}

	public void setMentorName(String mentorName) {
		this.mentorName = mentorName;
	}

	public String getSkills() {
		return skills;
	}

	public void setSkills(String skills) {
		this.skills = skills;
	}

	public float getYearsOfExperience() {
		return yearsOfExperience;
	}

	public void setYearsOfExperience(Float float1) {
		this.yearsOfExperience = float1;
	}

	public int getTrainingsCompleted() {
		return trainingsCompleted;
	}

	public void setTrainingsCompleted(int trainingsCompleted) {
		this.trainingsCompleted = trainingsCompleted;
	}

	public float getAvgRating() {
		return avgRating;
	}

	public void setAvgRating(float avgRating) {
		this.avgRating = avgRating;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "MentorSkills [id=" + id + ", mentorId=" + mentorId + ", mentorName=" + mentorName + ", skills=" + skills
				+ ", yearsOfExperience=" + yearsOfExperience + ", trainingsCompleted=" + trainingsCompleted
				+ ", avgRating=" + avgRating + ", rating=" + rating + ", description=" + description + "]";
	}

}
