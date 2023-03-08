<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>X-workz</title>
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<title>X-Workz</title>
</head>
<body>

	<nav class="navbar navbar-expand-lg navbar-light bg-dark">
		<a class="navbar-brand" href="#"> <img
			src="https://x-workz.in/static/media/Logo.cf195593dc1b3f921369.png"
			width="85" height="50" alt="">
		</a> <a class="navbar-brand" href="#">Navbar</a> <a href="saree">saree</a>
		<!-- here form action is used to make places and gifts more dynamic  -->
		<a href="index.jsp">Home</a>
	</nav>
</head>

<h1>Saree Search Here...!</h1>

<h3>
	<span style="color: red;">${message}</span>
</h3>
<form action="search" method="get">
	Search By Id <input type="text" name="id" /> <input type="submit"
		value="search" class="btn btn-primary" />
</form>
<div>


	<h3 style="color: blue;">Search Results</h3>
	ID : ${dto.id }<br> Name : ${dto.name } <br> material :
	${dto.material } <br> modeOFpayemnt : ${dto.modeOFpayemnt } <br>
	size : ${dto.size } <br> Color : ${dto.color }
</div>
</body>
</html>

