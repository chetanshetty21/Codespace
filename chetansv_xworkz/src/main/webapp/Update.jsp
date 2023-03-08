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



	<c:forEach items="${error}" var="e">
		<br>


		<span style="color: red;">${e.message}</span>
	</c:forEach>
	<div>
		<span style="color: green;">${message}</span>
	</div>

	<form action="Update" method="post">

		<div class="mb-3">
			<label for="formFile" class="form-label">Id</label> <input
				type="text" class="form-control" name="id" id="formFile"
				readonly="readonly" value="${dto.id}" />
		</div>

		<div class="mb-3">
			<label for="formFile" class="form-label">Name</label> <input
				type="text" class="form-control" name="name" id="formFile"
				required="required" value="${dto.name}" />
		</div>
		<div class="mb-3">
			<label for="formFile" class="form-label">material</label> <input
				type="text" class="form-control" name="material" id="formFile"
				required="required" value="${dto.material}" />
		</div>
		<div class="mb-3">
			<label for="formFile" class="form-label">modeOFpayemnt</label> <input
				type="text" class="form-control" name="modeOFpayemnt" id="formFile"
				required="required" value="${dto.modeOFpayemnt}" />
		</div>
		size <select class="form-select" aria-label="Default select example"
			name="size" required="required">
			<option selected value="${dto.size}">${dto.size}</option>
			<c:forEach items="${size}" var="items">
				<option value="${items}">${items}</option>
			</c:forEach>
		</select> color <select class="form-select" aria-label="Default select example"
			name="color" required="required">
			<option selected value="${dto.color}">${dto.color}</option>
			<c:forEach items="${color}" var="gif">
				<option value="${gif}">${gif}</option>
			</c:forEach>
		</select> <input type="submit" value="Update" />

	</form>
</body>


</html>