<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="css/menubar.css"/>
</head>
<body style="background-color:#333;">

	<!-- Menu Bar -->
	<nav class='navigation main-navigation'>
	  <ul class='menu main-menu'>
	  
   		 <li class='menu-item'>
	    <div class="banner">
		<img src="image/baltechimg.png" height="150px" width="180px">
		</div>
	    </li>
	    
	    <li class='menu-item'>
	      <a class='three-d' href='logindb.jsp'>
	        <span title='Login'>Login</span>
	      </a>
	    </li>
	    <li class='menu-item'>
	      <a class='three-d' href='registerdb.jsp'>
	        <span title='Register'>Register</span>
	      </a>
	    </li>
	  </ul>
	</nav>

	<br/><br/><br/>
	<div align="center">
	
	<jsp:useBean id="userinfo" class="com.awesometodo.model.UserInfo" scope="request"/>
	
	<c:if test="${requestScope.status == false}">
		<h1>register failed</h1>
	</c:if>
	
	<c:if test="${requestScope.status == true }">
		<h1><font color="white">Register Succesfull</font></h1>
		<table style="background-color:white;">
			<tr>
				<td>Name:</td>
				<td><c:out value="${userinfo.fullName}"/></td>
			</tr>
			<tr>
				<td>Email:</td>
				<td><c:out value="${userinfo.email}"/></td>
			</tr>
			<tr>
				<td>Username:</td>
				<td><c:out value="${userinfo.username}"/></td>
			</tr>
			<tr>
				<td>Password:</td>
				<td>Hidden</td>
			</tr>
			<tr>
				<td>address:</td>
				<td><c:out value="${userinfo.address}"/></td>
			</tr>
			<tr>
				<td>Current Money:</td>
				<td><c:out value="${userinfo.money}"/></td>
			</tr>	
		</table>
	<br/>
	<div align="center">
	Go to login <a href="logindb.jsp"><font color="white">here</font></a>
	</div>
	</c:if>
</div>
</body>
</html>