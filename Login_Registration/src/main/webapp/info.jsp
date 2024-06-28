<%@page import="com.company.dao.User"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <link rel="stylesheet" type="text/css" href="LoginStyle.css">
    <title>Fetch Data from MySQL</title>
</head>
<body>


<div class="container" style="background-color:white">
<center>
    <h1>Candidate's Data</h1>
    <table border="1" >
        <tr >
            <th style="padding:20px;">Name</th>
            <th>Email</th>
            <th>PhoneNo</th>
            <th>CGPA</th>
        </tr>
        
      

         
       <%
       
try {
	
	 
    Class.forName("com.mysql.jdbc.Driver");
    String sql = "SELECT * FROM user where CGPA > ?";
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db", "root", "lulu@2004");
 
    PreparedStatement pt = con.prepareStatement(sql);
    pt.setDouble(1, 0.0);
    ResultSet rs = pt.executeQuery();

    while (rs.next()) {
%>
        <tr>
            <td style="padding:15px;"><%= rs.getString("username") %></td>
            <td><%= rs.getString("email") %></td>
            <td><%= rs.getString("Phoneno") %></td>
            <td><%= rs.getString("CGPA") %></td>
        </tr>
<%
    }
    rs.close();
    pt.close();
    con.close();
} catch (ClassNotFoundException e) {
    out.println("Database driver not found: " + e.getMessage());
} catch (SQLException e) {
    out.println("SQL error: " + e.getMessage());
    e.printStackTrace();
} catch (Exception e) {
    out.println("An error occurred: " + e.getMessage());
    e.printStackTrace();
}
%>
    </table>
    </center>
    <br><br>
    <button style="width:250px;"><a href="ManagerInfo.jsp" style="color:white;">LogOut</a></button>
    </div>
</body>
</html>
