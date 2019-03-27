
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<table border="1">
<td><a href="home.jsp">home</a></td>
<td><a href="login.jsp">login</a></td>
<td><a href="register.jsp">register</a></td>
</table>
<h3>Deneme List</h3>
<br>
<table border="1">
<thead>
<th>ID</th>
<th>Name</th>
<th>Surname</th>
</thead>
<tbody>
<c:forEach items="${requestScope.list}" var="user">
<tr>
<td><a href="./GetUsers?id=${user.ID}">${user.ID}</a></td>
<td>${user.Name}</td>
<td>${user.Surname}</td>
<td>${user.Email}</td>
</tr>
</c:forEach>

</tbody>
</table>
</body>
</html>