<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home</title>
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
	        <span title='PRODUCT'>PRODUCT</span>
	      </a>
	    </li>
	    <li class='menu-item'>
	      <a class='three-d' href='registerdb.jsp'>
	        <span title='PC GUIDE'>PC GUIDE</span>
	      </a>
	    </li>
    	<li class='menu-item'>
	      <a class='three-d' href="ViewUserAction">
	        <span title='VIEW USER'>VIEW USER</span>
	      </a>
	    </li>
    	<li class='menu-item'>
	      <a class='three-d' href=''>
	        <span title='EDIT ACCOUNT'>EDIT ACCOUNT</span>
	      </a>
	    </li> 
	    <li class='menu-item' style="float: right;"> 
	    <a class='three-d' href="Logout">
	     	<span title='LOGOUT'>LOGOUT</span>
	      </a> 
	    </li>
	  </ul>
	</nav>
	<!-- user Login Session -->
	<p>
	<!-- if user already logged in, they will be userinfo bean in the session object check if that exist -->
	<c:if test="${not empty userinfo}">
		<p>
		<font color="white">Hi</font> <font color="white">${userinfo.fullName}!.</font>
		<font color="white">Welcome to BALTECH Website</font>
		</p>
	</c:if>
	
	<c:if test="${empty userinfo}">
		<small>
		You are not logged in.
		<a href="login.jsp">Login</a>
		</small>
	</c:if>
	
</body>
</html>