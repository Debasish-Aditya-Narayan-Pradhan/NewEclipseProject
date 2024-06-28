<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" type="text/css" href="LoginStyle.css">
<title>Insert title here</title>
</head>
<body>
<form action="manager" method="post">
<div class="container">
<label>Username</label>
<input type="text" id="username" name="username" required>
<br><br>
<label>Password</label>
<input type="text" id="password" name="password" required>
<button type="submit">Login</button>
<p><a href="Manager.html">Back</a></p>

<% String error = request.getParameter("error");
            if (error != null && error.equals("1")) { %>
                <p style="color: red;">Invalid username or password. Please try again.</p>
        <% } %>
        
        <%-- Display error message if Register Successful --%>
        <% String rs = request.getParameter("candidtate");
            if (rs != null && rs.equals("success")) { %>
                <p style="color: green;">You logged in  Successful. Please Login.</p>
        <% } %>
</div>
</form>
</body>
</html>