<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>View User</title>
</head>
<body>
	<jsp:useBean id="viewUser" class="java.util.ArrayList" scope="request"/>
	
	<div align="center">
		<table>
			<tr>
				<td>User Id</td>
				<td>Full Name</td>
				<td>UserName</td>
				<td>Email</td>
				<td>Password</td>
				<td>Address</td>
				<td>Money</td>
			</tr>
			<c:forEach var="v" items="${viewUser}">
			<tr>
				<td>
					${v.userId}
				</td>
				<td>
					${v.fullName}
				</td>
				<td>
					${v.username}
				</td>
				<td>
					${v.email}
				</td>
				<td>
					${v.password}
				</td>
				<td>
					${v.address}
				</td>
				<td>
					${v.money}
				</td>
			</tr>
			</c:forEach>
		</table>
	
	</div>
</body>
</html>