package com.springboot.soap.api.entity;

import java.util.ArrayList;
import java.util.List;

public class User {

	private Long UserId;
	private String name;
	private String phone;
	
	List<Contact> contacts = new ArrayList<>();

	public User(Long userId, String name, String phone, List<Contact> contacts) {
		super();
		UserId = userId;
		this.name = name;
		this.phone = phone;
		this.contacts = contacts;
	}
	
	
	
	public User(Long userId, String name, String phone) {
		
		this.UserId = userId;
		this.name = name;
		this.phone = phone;
	}



	public User() {
		
	}



	public Long getUserId() {
		return UserId;
	}



	public void setUserId(Long userId) {
		UserId = userId;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getPhone() {
		return phone;
	}



	public void setPhone(String phone) {
		this.phone = phone;
	}



	public List<Contact> getContacts() {
		return contacts;
	}



	public void setContacts(List<Contact> contacts) {
		this.contacts = contacts;
	}
	
	
	
	
	 
}
