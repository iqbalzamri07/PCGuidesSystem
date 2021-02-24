package com.awesometodo.model;
import java.io.Serializable;

public class UserInfo implements Serializable {
	
	private String fullName;
	private String email;
	private String username;
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
	
	public UserInfo(String a, String b, String c, String d,String e, double f) {
		this.fullName = a;
		this.username = b;
		this.email = c ;
		this.password = d;
		this.address = e;
		this.money = f;
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
	
	@Override
	public String toString() {
		return "UserBean [fullName=" + fullName + ", email=" + email + ", username=" + username + ", password="
				+ password + ", address=" + address + ", money=" + money + "]";
	}
	
	
	
}
