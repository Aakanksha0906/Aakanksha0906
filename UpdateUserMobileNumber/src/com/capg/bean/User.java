package com.capg.bean;

public class User {
	private String name;
	private int age;
	private String address;
	private String mobilenumber;
	private int userid;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age2) {
		this.age = age2;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getMobilenumber() {
		return mobilenumber;
	}
	public void setMobilenumber(String mobilenumber) {
		this.mobilenumber = mobilenumber;
	}
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	@Override
	public String toString() {
		return "User [name=" + name + ", age=" + age + ", address=" + address + ", mobilenumber=" + mobilenumber
				+ ", userid=" + userid + "]";
	}
	

}
