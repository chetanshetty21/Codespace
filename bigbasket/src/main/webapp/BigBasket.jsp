<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js" />
</head>
<body>
	<h1>Welcome</h1>

	<nav class="navbar navbar-dark bg-dark">
		<!-- Navbar content -->
		<div class="container-fluid">
			<img
				src="https://x-workz.in/static/media/Logo.cf195593dc1b3f921369.png"
				alt="" width="90" height="60" class="d-inline-block align-text-top">

			<a href="index.jsp">home</a>

		</div>

	</nav>
	<c:forEach items="${errors}" var="e">
		<span style="color: red;">${e.message }</span>
	</c:forEach>



	<form action="big" method="post">
	<pre>
		Name <input type="text" name="name" /> 
		PhoneNumber <input type="text" name="phoneNumber" /> 
		Email <input type="text" name="email" />
		PassWord <input type="text" name="passWord" />
		StoreLocation <input type="text" name="storeLocation" /> 
		NoofWorkers	<input type="text" name="noOfWorkers" /> 
		Cod yes:<input type="radio" value="true" name="cod" />
		no:<input type="radio" value="false" name="cod" /> 
		<br>
		delivery yes:<input type="radio" value="true" name="delivery" />
		   no:<input type="radio" value="false" name="delivery" /> Item<select name="items">
			<br>
			
			<option value="">SELECT</option>
			<c:forEach items="${items}" var="items">
				<option value="${items}">${items}</option>
			</c:forEach>
			</br>
			
		</select> Area<select name="areas">
			<option value="">SElECT</option>
			<c:forEach items="${areas}" var="areas">
				<option value="${areas}">${areas}</option>
			</c:forEach>
		</select> <input type="submit" value="order" class="btn btn-primary">
		</pre>
</body>
</html>