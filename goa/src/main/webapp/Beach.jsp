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
	<h1>page to send Beach details.</h1>
	<form action="beach" method="get">
		<div class="mb-3">
			<label for="exampleFormControlInput1" class="form-label">Name</label>
			<input type="text" class="form-control" name="name"
				id="exampleFormControlInput1" placeholder="enter the name">
		</div>
		<div class="mb-3">
			<label for="exampleFormControlInput1" class="form-label">Location</label>
			<input type="text" class="form-control" name="location"
				id="exampleFormControlInput1" placeholder="enter the location">
		</div>
Clean 
		
		<div class="form-check">			
		<div></div>
		 
			<input class="form-check-input" type="radio" 	id="flexRadioDefault1"
				name="clean " > 
				<label class="form-check-label" value="true"
				for="flexRadioDefault1">    Yes </label>
		</div>
		<div class="form-check"> 
		
			<input class="form-check-input" type="radio" name="flexRadioDefault" 
				id="clean" unchecked>   
				<label class="form-check-label" value="false"
				for="flexRadioDefault2">    NO </label>
		</div>
		<pre></pre>Games
		<div class="form-check">		
		
		 
			<input class="form-check-input" type="radio" 	id="flexRadioDefault1"
				name="games" > 
				<label class="form-check-label" value="true"
				for="flexRadioDefault1">    Yes </label>
		</div>
		<div class="form-check"> 
		
			<input class="form-check-input" type="radio" name="flexRadioDefault" 
				id="games" unchecked> 
				<label class="form-check-label" value="false"
				for="flexRadioDefault2">    NO </label>
		</div>


		<div>
			<input type="submit" value="enter for register" class="btn btn-dark">
		</div>





	</form>
</html>