<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>X-workz</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js" />
</head>
<body>

	<nav class="navbar navbar-dark bg-dark">
		<!-- Navbar content -->
		<div class="container-fluid">
			<img
				src="https://x-workz.in/static/media/Logo.cf195593dc1b3f921369.png"
				alt="" width="90" height="60" class="d-inline-block align-text-top">

			<a href="index.jsp">home</a>


		</div>

	</nav>
	<h5 style="color: red">${message}</h5>


	<form action="delete" method="post">

		Search by name<input type="text" name="name" /> <input type="submit"
			value="search" />
	</form>
	<table class="table table-bordered ">
		<tr class="table-primary">
			<th>id</th>
			<th>name</th>
			<th>material</th>
			<th>modeOFpayemnt</th>
			<th>size</th>
			<th>color</th>
			<th>Edit</th>

			<c:forEach items="${list}" var="s">
				<tr>
					<td>${s.id}</td>
					<td>${s.name}</td>
					<td>${s.material}</td>
					<td>${s.modeOFpayemnt}</td>
					<td>${s.size}</td>
					<td>${s.color}</td>

					<td><a href="delete?id=${t.id}">delete</a></td>
				</tr>
			</c:forEach>
	</table>
</body>
</html>











