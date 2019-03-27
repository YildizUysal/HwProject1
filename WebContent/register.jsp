<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Register</title>
</head>
<body>

	<h1>Register Page</h1>

	<ul>
		<li><a href="home.jsp">Home</a></li>
		<li><a href="login.jsp">Login</a></li>
		<li><a href="register.jsp">Register</a></li>
	</ul>

	<form action="./RegisterPage" method="POST">
		<table>
			<tr>
				<td>Name:</td>
				<td><input type="text" name="name" placeholder="Name" value="$(Register.name)"></td>
			</tr>
			<tr>
				<td>Surname:</td>
				<td><input type="text" name="surname" placeholder="Surname" value="$(Register.surname)"></td></tr>
			<tr>
				<td>Email:</td>
				<td><input type="text" name="email" placeholder="Email" value="$(Register.email)"></td>
			</tr>
			<tr>
				<td>User Name:</td>
				<td><input type="text" name="username" placeholder="Username" value="$(Register.username)"></td>
			</tr>
			<tr>
				<td>Password:</td>
				<td><input type="password" name="password" placeholder="Password" value="$(Register.password)"></td>
			</tr>
			<tr>
				<td colspan="2">
				<input type="Submit" name="operation" value="Kayıt Ol">
				</td>
			</tr>
		</table>
		
<!--
<ul>

			<li>Surname:<input type="text" name="surname"
				placeholder="Surname"></li>
			<li>BirthDate:<input type="text" name="birthDate"
				placeholder="Birth Date"></li>
			<li>BirthPlace:<input type="text" name="birthPlace"
				placeholder="Birth Place"></li>
			<li>Email:<input type="email" name="email" placeholder="Email"></li>
			<li>Phone:<input type="text" name="phone" placeholder="Phone"></li>
			<li>Gender:<input type="text" name="gender" placeholder="Gender"></li>
			<li>Graduation Degree:<input type="text" name="gradDeggre"
				placeholder="Graduation Degree"></li>
			<li>Address Line 1:<input type="text" name="address_1"
				placeholder="Address_1"></li>
			<li>Address Line 2:<input type="text" name="address_2"
				placeholder="Address_2"></li>
			<li>Country:<input type="text" name="country"
				placeholder="Country"></li>
			<li>State:<input type="text" name="state" placeholder="State"></li>
			<li>ZipCode:<input type="text" name="zipCode"
				placeholder="ZipCode"></li>
			<li>Username: <input type="text" name="username"
				placeholder="User Name"></li>
			<li>Password: <input type="text" name="password"
				placeholder="Password"></li>
			<li>Password Again: <input type="text" name="passwordAgain"
				placeholder="Password Again"></li>
			<li></li>
		</ul>

  -->
		
	</form>
</body>
</html>