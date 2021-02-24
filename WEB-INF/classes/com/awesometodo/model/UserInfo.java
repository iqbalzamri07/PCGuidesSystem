package com.awesometodo.model;


public class UserInfo {
	
	private int userId;
	private String fullName;
	private String username;
	private String email;
	private String password;
	private String address;
	private double money;
	
	public UserInfo() {
		
		fullName = "";
		username = "";
		email = "";
		password = "";
		money = 1000;
	}
	
	public UserInfo(int userId, String a, String b, String c, String d,String e, double f) {
		this.userId = userId;
		this.fullName = a;
		this.username = b;
		this.email = c ;
		this.password = d;
		this.address = e;
		this.money = f;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public double getMoney() {
		return money;
	}

	public void setMoney(double money) {
		this.money = money;
	}

	@Override
	public String toString() {
		return "UserInfo [userId=" + userId + ", fullName=" + fullName + ", email=" + email + ", username=" + username
				+ ", password=" + password + ", address=" + address + ", money=" + money + "]";
	}
	
}
