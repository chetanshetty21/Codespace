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
	<h1>page to send Casino details.</h1>
	<form action="casino" method="get">
		<div class="mb-3">
			<label for="exampleFormControlInput1" class="form-label">Name</label>
			<input type="text" class="form-control" name="name" 
				id="exampleFormControlInput1" placeholder="enter the name">
		</div>
		<div class="mb-3">
			<label for="exampleFormControlInput1" class="form-label">Cruise</label>
			<input type="text" class="form-control" name="cruise"
				id="exampleFormControlInput1" placeholder="enter the cruise">
		</div>

		<div class="input-group mb-3">
			<span class="input-group-text">Rupees </span> <span
				class="input-group-text">0.00</span> <input type="text"name="entryFee"
				class="form-control" aria-label="enter the entry fee">
		</div>Freefood
		<div class="form-check">			 
		<div></div>
		 
			<input class="form-check-input" type="radio"	id="flexRadioDefault1"
				name="freefood" > 
				<label class="form-check-label"  value="true"
				for="flexRadioDefault1">    Yes </label>
		</div>
		<div class="form-check"> 
		
			<input class="form-check-input" type="radio" name="freedfood" 
				id="flexRadioDefault2"> 
				<label class="form-check-label" value="false"
				for="flexRadioDefault2">    NO </label>
		</div>
		<pre></pre>FreeAlcohol
		<div class="form-check">			
		<div></div>
		 
			<input class="form-check-input" type="radio" 	id="flexRadioDefault1"
				name="freeAlcohol" > 
				<label class="form-check-label" value="true"
				for="flexRadioDefault1">    Yes </label>
		</div>
		<div class="form-check"> 
		
			<input class="form-check-input" type="radio" name="flexRadioDefault" 
				id="freeAlcohol" > 
				<label class="form-check-label" value="false"
				for="flexRadioDefault2">    NO </label>
		</div>


		<div>
			<input type="submit" value="Send" class="btn btn-dark">
		</div>





	</form>
</html>