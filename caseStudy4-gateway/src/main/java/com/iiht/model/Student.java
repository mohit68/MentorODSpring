//package com.iiht.model;
//
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.Table;
//import javax.validation.constraints.Email;
//
//
//@Entity
//@Table(name = "STUDENT")
//public class Student {
//	@Id
//	@GeneratedValue(strategy=GenerationType.IDENTITY)
//	long sid;
//	String name;
//	@Email
//	String email;
//	String currentTraining;
//	int completedtraining;
//	public long getSid() {
//		return sid;
//	}
//	public void setSid(long sid) {
//		this.sid = sid;
//	}
//	public String getName() {
//		return name;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
//	public String getEmail() {
//		return email;
//	}
//	public void setEmail(String email) {
//		this.email = email;
//	}
//	public String getCurrentTraining() {
//		return currentTraining;
//	}
//	public void setCurrentTraining(String currentTraining) {
//		this.currentTraining = currentTraining;
//	}
//	public int getCompletedtraining() {
//		return completedtraining;
//	}
//	public void setCompletedtraining(int completedtraining) {
//		this.completedtraining = completedtraining;
//	}
//	public Student(long sid, String name, @Email String email, String currentTraining, int completedtraining) {
//		super();
//		this.sid = sid;
//		this.name = name;
//		this.email = email;
//		this.currentTraining = currentTraining;
//		this.completedtraining = completedtraining;
//	}
//	public Student() {
//		super();
//		// TODO Auto-generated constructor stub
//	}
//	@Override
//	public String toString() {
//		return "Student [sid=" + sid + ", name=" + name + ", email=" + email + ", currentTraining=" + currentTraining
//				+ ", completedtraining=" + completedtraining + "]";
//	}
//	
//
//}
