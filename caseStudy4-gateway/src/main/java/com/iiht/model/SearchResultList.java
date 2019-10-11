package com.iiht.model;

public class SearchResultList {
	private int id;
	private int courseId;
	private String name;
	private String toc;
	private String prerequisites;
	private Long mentorId;
	private String mentorName;
	private String skills;
	private float yearsOfExperience;
	private int trainingsCompleted;
	private float avgRating;
	private int rating;
	private String description;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCourseId() {
		return courseId;
	}

	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getToc() {
		return toc;
	}

	public void setToc(String toc) {
		this.toc = toc;
	}

	public String getPrerequisites() {
		return prerequisites;
	}

	public void setPrerequisites(String prerequisites) {
		this.prerequisites = prerequisites;
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

	public void setYearsOfExperience(float yearsOfExperience) {
		this.yearsOfExperience = yearsOfExperience;
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
		return "SearchResultList [id=" + id + ", courseId=" + courseId + ", name=" + name + ", toc=" + toc
				+ ", prerequisites=" + prerequisites + ", mentorId=" + mentorId + ", mentorName=" + mentorName
				+ ", skills=" + skills + ", yearsOfExperience=" + yearsOfExperience + ", trainingsCompleted="
				+ trainingsCompleted + ", avgRating=" + avgRating + ", rating=" + rating + ", description="
				+ description + "]";
	}

}
