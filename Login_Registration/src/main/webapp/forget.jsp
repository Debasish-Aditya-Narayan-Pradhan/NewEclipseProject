<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" type="text/css" href="forgotPassword.css">
<title>Insert title here</title>
</head>
<body>
<div class="container">
<form action="Forgot" method="post" >
<label>Email</label>
<input type="email" id="Email" name="Email" placeholder="Enter your Email"required >
<br><br>
<label>Password</label>
<input type="text" id="password" name="password" placeholder="Enter your password" required>
<button type="submit">Forgot</button>
<p><a href="login.jsp">Login</a></p>

<% String error = request.getParameter("error");
            if (error != null && error.equals("1")) { %>
                <p style="color: red;">Invalid Email. Please try again.</p>
        <% } %>
        
        
        <% String rs = request.getParameter("forgot");
            if (rs != null && rs.equals("success")) { %>
                <p style="color: green;">Your Password is Successfully changed. Please Login.</p>
        <% } %>
</form>

</div>

</body>
</html>