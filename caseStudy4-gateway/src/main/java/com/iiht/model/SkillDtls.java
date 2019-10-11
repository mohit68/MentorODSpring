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
@Table(name = "SKILLDTLS")
public class SkillDtls {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String toc;
	private String prerequisites;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	@Override
	public String toString() {
		return "SkillDtls [id=" + id + ", name=" + name + ", toc=" + toc + ", prerequisites=" + prerequisites + "]";
	}
	

}
