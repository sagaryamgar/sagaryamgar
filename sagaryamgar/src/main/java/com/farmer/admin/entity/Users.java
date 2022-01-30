package com.farmer.admin.entity;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity(name = "users")
@Table(name = "users")
public class Users {
	@Id
	@GeneratedValue(generator="user_seq")
	@SequenceGenerator(name="user_seq",sequenceName="USER_SEQ", allocationSize=1)
	Long id;
	@Column
	String name;
	@Column
	String mobilNo;
	@Column(length = 8)
	@Enumerated(EnumType.STRING)
	UserType userType;
	@Column
	String education;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMobilNo() {
		return mobilNo;
	}
	public void setMobilNo(String mobilNo) {
		this.mobilNo = mobilNo;
	}
	public UserType getUserType() {
		return userType;
	}
	public void setUserType(UserType userType) {
		this.userType = userType;
	}
	public String getEducation() {
		return education;
	}
	public void setEducation(String education) {
		this.education = education;
	}
	@Override
	public String toString() {
		return "Users [id=" + id + ", name=" + name + ", mobilNo=" + mobilNo + ", userType=" + userType + ", education="
				+ education + "]";
	}
	
}
