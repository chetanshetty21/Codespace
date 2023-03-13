<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
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
</head>
<h1>Saree Search Here...!</h1>
<h3>
	<span style="color: red;">${message}</span>
</h3>
<form action="searchtwoproperties" method="post">
	Search By Any Name <input type="text" name="name"  />
	Search By Any color <input type="text" name="color" /><input
		type="submit" value="search" class="btn btn-primary" />
</form>
<div>
	<table class="table table-bordered ">
		<tr class="table-primary">
			<th>id</th>
			<th>name</th>
			<th>material</th>
			<th>modeOFpayemnt</th>
			<th>size</th>
			<th>color</th>
		</tr>
		<c:forEach items="${list}" var="s">
			<tr>
				<td>${s.id}</td>
				<td>${s.name}</td>
				<td>${s.material}</td>
				<td>${s.modeOFpayemnt}</td>
				<td>${s.size}</td>
				<td>${s.color}</td>
			</tr>
		</c:forEach>
	</table>
</div>
</body>

</html>







