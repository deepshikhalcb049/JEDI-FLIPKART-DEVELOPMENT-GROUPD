/**
 * 
 */
package com.flipkart.bean;

/**
 * 
 */
public class FlipFitCustomer extends FlipFitUser {
	private String name;
	private String phoneNumber;
	private int age;
	private String address;
	
	public FlipFitCustomer(String email, String password, int roleId, String name, String phoneNumber, int age, String address) {
		super(email, password, roleId);
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.age = age;
		this.address = address;
	}
	
	public FlipFitCustomer() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}