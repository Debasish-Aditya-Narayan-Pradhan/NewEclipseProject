<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" type="text/css" href="LoginStyle.css">
<title>Insert title here</title>
</head>
<body>
<div class="container">
<button ><a href="info.jsp" style="color: white;">See Candidated Information</a></button>

  <% String error = request.getParameter("error");
            if (error != null && error.equals("1")) { %>
                <p style="color: red;">Invalid username or password. Please try again.</p>
        <% } %>
        
  
</div>
</body>
</html>