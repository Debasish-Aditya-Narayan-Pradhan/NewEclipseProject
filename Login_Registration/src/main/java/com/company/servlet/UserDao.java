package com.company.servlet;

import com.company.dao.User;

public interface UserDao {

	boolean isValidUser(String username, String password);
	boolean addUser(User user);
	boolean isValidEmail(String email, String pass);
	boolean UpdatePassword(String email,String pass);
	boolean isValidManager(String username,String password);

}
