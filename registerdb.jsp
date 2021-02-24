<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>REGISTER</title>
<link rel="stylesheet" type="text/css" href="css/register.css">
<link rel="stylesheet" type="text/css" href="css/menubar.css"/>
</head>
<body>
	<jsp:useBean id="userinfo" class="com.awesometodo.model.UserInfo" scope="request"/>
	
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
	
	<!-- IF REGISTER FAILED -->
	<c:if test="${requestScope.status == false}">
		<div align="center"><h1><font color="white">Register Failed<br>
		Username/Password already exist!</font></h1></div>
	</c:if>
	
	<div align="center">
	<div id="container">
		<h1>Register Form</h1>
		<form action="RegisterAction" method="post">
			<div class="row">
				<label for="fullName">Full Name:</label>
				<input type="text" placeholder="Your Name" required name="fullName">
			</div>
			<br>
			<div class="row">
				<label for="username">Username:</label>
				<input type="text" placeholder="Your Contact No" required name="username"> 
			</div>
			<br>
			<div class="row">
				<label for="email">Email:</label>
				<input type="email" placeholder="Email" required name="email">
			</div>
			<br>
			<div class="row">
				<label for="password">Password:</label>
				<input type="password" id="password" required placeholder="password" required name="password">
			</div>
			<br>
			<div class="row">
				<label for="address">Address:</label>
				<input type="text" placeholder="Your address " required name="address"> 
			</div>
			<button class="submit" name="submit">REGISTER</button>
			&nbsp;
		</form>
	</div>
	</div>
</body>
</html>