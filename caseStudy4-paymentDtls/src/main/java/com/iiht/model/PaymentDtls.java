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
@Table(name = "PAYMENTDTLS")
public class PaymentDtls {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String txnType;
	private float amount;
	private String remarks;
	private int mentorId;
	private String mentorName;
	private int trainingId;
	private String skillName;
	private float totalAmountToMentor;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTxnType() {
		return txnType;
	}
	public void setTxnType(String txnType) {
		this.txnType = txnType;
	}
	public float getAmount() {
		return amount;
	}
	public void setAmount(float amount) {
		this.amount = amount;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	public int getMentorId() {
		return mentorId;
	}
	public void setMentorId(int mentorId) {
		this.mentorId = mentorId;
	}
	public String getMentorName() {
		return mentorName;
	}
	public void setMentorName(String mentorName) {
		this.mentorName = mentorName;
	}
	public int getTrainingId() {
		return trainingId;
	}
	public void setTrainingId(int trainingId) {
		this.trainingId = trainingId;
	}
	public String getSkillName() {
		return skillName;
	}
	public void setSkillName(String skillName) {
		this.skillName = skillName;
	}
	public float getTotalAmountToMentor() {
		return totalAmountToMentor;
	}
	public void setTotalAmountToMentor(float totalAmountToMentor) {
		this.totalAmountToMentor = totalAmountToMentor;
	}
	@Override
	public String toString() {
		return "PaymentDtls [id=" + id + ", txnType=" + txnType + ", amount=" + amount + ", remarks=" + remarks
				+ ", mentorId=" + mentorId + ", mentorName=" + mentorName + ", trainingId=" + trainingId
				+ ", skillName=" + skillName + ", totalAmountToMentor=" + totalAmountToMentor + "]";
	}


}
