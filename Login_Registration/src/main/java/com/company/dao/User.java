package com.company.dao;

public class User {
  private String username;
  private String email;
  private String password;
  private String phone;
  private double cgpa;
  private double cgpa1;
  
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}

public String getPhone() {
	return phone;
}
public void setPhone(String pho) {
	this.phone = pho;
}

public double getCgpa() {
	return cgpa;
}
public void setCgpa(String cgpa)
{
     double d = Double.valueOf(cgpa);
	this.cgpa = d;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public void setNewCgpa(Double cgpa2) {
	// TODO Auto-generated method stub
	this.cgpa1 = cgpa2;
}
public double getNewCgpa() {
	return cgpa1;
}
}
