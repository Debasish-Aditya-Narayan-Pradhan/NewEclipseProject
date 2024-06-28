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
<div class="container" >
        <h1>Register</h1>
        <form action="RegisterServlet" method="post"> <!-- Change method to "post" -->
            <label for="username">Username:</label>
            <input type="text" id="username" name="username" required><br>
            <label for="password">Email:</label>
            <input type="email" id="email" name="email" required><br>
            <label for="password">PhoneNumber:</label>
            <input type="text" id="phone" name="phone" required><br>
            <label for="password">CGPA:</label>
            <input type="text" id="cgpa" name="cgpa" required><br>
            <label for="password">Password:</label>
            <input type="password" id="password" name="password" required><br>
            <button type="submit">Register</button>
        </form>

        <p><a href="Index.html">Back to Home</a></p>
        </div>
</body>
</html>