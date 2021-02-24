<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Awesome To-Do List</title>
</head>
<body>
<h1>Welcome To Awesome To-Do List</h1>
<p>
	<!-- if user already logged in, they will be userinfo bean in the session object check if that exist -->
	<c:if test="${not empty userinfo}">
		<p>
		Hi ${userinfo.fullName}!.
		Hope you have a productive day today :-)
		</p>
		
		<small>
		You logged in as ${userinfo.username}.
		</small>
		<form action="Logout" method="POST"> 
			<input type="submit" value="logout">
		</form>
	</c:if>
	<c:if test="${empty userinfo}">
		<small>
		You are not logged in.
		<a href="login.jsp">Login</a>
		</small>
	</c:if>
</body>
</html>