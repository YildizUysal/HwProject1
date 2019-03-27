<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Login</title>
</head>
<body>

<h1>Login Page</h1>
<form action="LoginPage" method="post">
    Username: <input type="text" name="username" placeholder="User Name"><br>
    Password: <input type="text" name="password" placeholder="Password"><br>
    <input type="submit" value="Submit">
</form>


<ul>
<li><a href="home.jsp">Home</a></li>
<li><a href="login.jsp">Login</a></li>
<li><a href="register.jsp">Register</a></li>
</ul>
</body>
</html>