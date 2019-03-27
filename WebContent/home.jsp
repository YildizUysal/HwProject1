<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Home</title>
</head>
<body>
<h1>Home Page</h1>
 

	<ul>
		<li><a href="home.jsp">Home</a></li>
		<li><a href="login.jsp">Login</a></li>
		<li><a href="register.jsp">Register</a></li>
	</ul>

	<form action="./RegisterPage" method="POST">
		<table>
			<tr>
				<td>Name:</td>
				<td><input type="text" name="name" placeholder="Name" value="${user.Name}"></td>
			</tr>
			<tr>
				<td>Surname:</td>
				<td><input type="text" name="surname" placeholder="Surname" value="${user.Surname}"></td></tr>
			<tr>
				<td>Email:</td>
				<td><input type="text" name="email" placeholder="Email" value="${user.Email}"></td>
			</tr>
			
		</table>
		

</body>
</html>