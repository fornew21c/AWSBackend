package com.woncheol.restapi.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import java.util.Date;

@Data
@AllArgsConstructor

public class Member {
	private String userId;
	private String name;
	private int age;
	private String address;
	private Date createdAt;
    private String companyName;

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

	public String getName() {
		return this.name;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public String getAddress() {
		return this.address;
	}
	
	public Date getCreatAt() {
		return this.createdAt;
	}
}
