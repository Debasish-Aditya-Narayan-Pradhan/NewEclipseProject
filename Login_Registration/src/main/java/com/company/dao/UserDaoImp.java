package com.company.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.company.servlet.UserDao;
import com.company.util.DBUtil;
import com.mysql.cj.jdbc.exceptions.PacketTooBigException;

public  class UserDaoImp implements UserDao {

	@Override
	public boolean isValidUser(String username, String password) {
		String query = "SELECT * FROM user WHERE username = ? AND password = ?";
   	 try (Connection connection = DBUtil.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(query)) {

           preparedStatement.setString(1, username);
           preparedStatement.setString(2, password);

           ResultSet resultSet = preparedStatement.executeQuery();
           System.out.println("Query has been running:)");
           return resultSet.next();
           
       } catch (SQLException e) {
           e.printStackTrace();
           return false;
       }
	}

	@Override
	public boolean addUser(User user) {
		// TODO Auto-generated method stub
		String query = "INSERT INTO user (username, email,password,CGPA,PhoneNo) VALUES (?,?,?,?,?)";
		try (Connection connection = DBUtil.getConnection();
	            PreparedStatement preparedStatement = connection.prepareStatement(query)) {

	           preparedStatement.setString(1, user.getUsername());
	           preparedStatement.setString(2, user.getEmail());
	           preparedStatement.setString(3, user.getPassword());
	           preparedStatement.setDouble(4, user.getCgpa());
	           preparedStatement.setString(5, user.getPhone());
	       

	           int row = preparedStatement.executeUpdate();
	           System.out.println("User Apna Add Holiya :):)");
	           return row >0;
	           
	           
	       }catch(SQLException e)
		{
	    	   e.printStackTrace();
	    	   return false;
		}
		
	}
	
	public boolean isValidEmail(String email, String password) {
		String query = "SELECT * FROM user WHERE email = ?";
   	 try (Connection connection = DBUtil.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(query)) {

           preparedStatement.setString(1, email);
           ResultSet resultSet = preparedStatement.executeQuery();
           System.out.println("Query has been running:)");
           return resultSet.next();
           
       } catch (SQLException e) {
           e.printStackTrace();
           return false;
       }
	}

	public boolean UpdatePassword(String email,String pass) 
	{
		String sql = "update user set password =? where email=?";
		try(Connection con=DBUtil.getConnection();
			PreparedStatement pt = con.prepareStatement(sql)	)
		{
			pt.setString(1, pass);
			pt.setString(2, email);
			int t = pt.executeUpdate();
			System.out.println("Updation is jari:)");
			if( t > 0)
			{
				return true;
			}
			else
			{
				return false;
			}
		}catch(SQLException e)
		{
			e.printStackTrace();
			return false;
		}
		
		
	}

	@Override
	public boolean isValidManager(String username, String password) {
		String sql = "select Name from manager where Name = ? and password = ?";
		try(Connection con = DBUtil.getConnection();
			PreparedStatement pt = con.prepareStatement(sql)	)
		{
			pt.setString(1, username);
			pt.setString(2, password);
			ResultSet rs=pt.executeQuery();
			System.out.println("Manager is Processing");
			return rs.next();
		}catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
	}

}
