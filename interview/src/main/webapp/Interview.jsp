<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>X-workz</title>
</head>
<body>
	<link
		href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
		rel="stylesheet"
		integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
		crossorigin="anonymous">
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
		crossorigin="anonymous"></script>
</head>
<body>
	<nav class="navbar navbar-light bg-dark">
		<div class="container-fluid">
			<a class="navbar-brand" href="#"> <img
				src="https://x-workz.in/static/media/Logo.cf195593dc1b3f921369.png"
				alt="" width="80" height="48" class="d-inline-block align-text-top">

			</a> <a href="index.jsp">home</a>
		</div>
	</nav>
	<h1>page to send interview details.</h1>
	<form action="attend" method="post">
		<div class="mb-3">
			<label for="exampleFormControlInput1" class="form-label">name</label>
			<input type="text" class="form-control" name="name"
				id="exampleFormControlInput1" placeholder="enter details of person">
		</div>
		<div>
			<select class="form-select" aria-label="Default select example"
				name="type">
				<option selected>select the company name</option>
				<option value="X-workz-raj">X-workz-raj</option>
				<option value="X-workz-btm">X-workz-btm</option>
				<option value="X-workz">X-workz</option>
			</select>
		</div>
		<div class="mb-3">
			<label for="exampleFormControlInput1" class="form-label">Role</label>
			<input type="text" class="form-control" name="role"
				id="exampleFormControlInput1" placeholder="enter role">
		</div>
		<div>
			<input type="submit" value="send" class="btn btn-dark">
		</div>

	</form>

</body>
</html>