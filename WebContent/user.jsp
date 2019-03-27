<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>User</title>
</head>
<body>

	<h1>User Page</h1>
	<%
		if (session == null) {
			request.getSession(false);
	%>
	<a href="home.jsp"> Home</a>
	<a href="login.jsp"> Login</a>
	<%
		} else {
			// Already created.
	%>

	<ul>
		<li><a href="home.jsp">Home</a></li>
	</ul>

	<%
		String username = request.getParameter("username");

			out.println("Name: " + username);
	%>

	<%
		}
	%>
	<br>
	<br>
	<h3>Listele bebek</h3>
	<table border="1">
		<thead><th>ID</th>
		<th>Name</th>
		<th>Surname</th>
		<th>Email</th>
		</thead>
		<c:forEach items="$(requestScope.list)" var="user">
			<tr>
				<td><a href="./Details?id=$(user.ID)">$(user.ID)</a></td>
				<td>$(user.name)</td>
				<td>$(user.surname)</td>
				<td>$(user.email)</td>
			</tr>
		</c:forEach>
	</table>

	<script>
		
	</script>

</body>
</html>