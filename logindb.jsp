<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
<link rel="stylesheet" type="text/css" href="css/login.css"/>
<link rel="stylesheet" type="text/css" href="css/menubar.css"/>
</head>
<body>	
	
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
	
	<div align="center">
	<!-- take session from loginAction -->
	<c:if test="${fail == true}"> 
		<h3><font color="white">Invalid Username/Password</font></h3>
	</c:if>
	
	<div align="center"></div><img src="image/loginimage.png" height="100px"></div>
	<form action="LoginAction" method="POST">
		<div class="login-form">
		  
		  <div class="field">
		  	<b>Username</b>
		    <input type="text" name="username">
		  </div>
		  
		  <div class="field with-btn">
		  	<b>Password</b>
		    <input type="password" name="password">
		  </div>
		  
		  <button name="login">Login</button>
		  
		  <p class="message">
		    Not Register yet? Sign Up Here -> <a href="registerdb.jsp">REGISTER</a>
		  </p>
		</div>
	</form>
	
	
	<!--<c:if test="${logginerror == 'yes'}">
	invalid username and password
	</c:if>-->
	<br>
</body>
</html>