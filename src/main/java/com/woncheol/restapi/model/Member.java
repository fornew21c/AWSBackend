package com.woncheol.restapi.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import java.util.Date;

@Data
@AllArgsConstructor

public class Member {
	String userId;
	String name;
	int age;
	String address;
	Date createdAt;
    String companyName;

    public Member() {
    	
    }
	public Member(String userId, String name, int age, String address, Date createAt, String companyName) {
		// TODO Auto-generated constructor stub
		this.userId = userId;
		this.name = name;
		this.age = age;
		this.address = address;
		this.createdAt = createAt;
		this.companyName = companyName;
	}
	
	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getAddress() {
		return this.address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public Date getCreatedAt() {
		return this.createdAt;
	}
	
	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}
	
	public String getCompanyName() {
		return this.companyName;
	}
	
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
}
