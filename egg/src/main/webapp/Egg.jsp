<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>X-workz</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"rel="stylesheet"integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"crossorigin="anonymous">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js"/>
</head>
<body>
<nav class="navbar navbar-dark bg-dark">
  <!-- Navbar content -->
  <div class="container-fluid">
    <a class="navbar-brand" href="#">
       </a>
    <a   href="index.jsp">Home</a>
    
  </div>
  
  </nav>
  <h1>welcome to egg application</h1>
  <form action="fresh" method="post">
  <pre>
  Hotel Name<input type="text" name="hotelName"/>
  Egg Dish Name<select name="dishName">
<option>Select Dish</option>
<option>Omlet</option>
<option>Egg Rice</option>
<option>Half-Boil</option>
<option>Egg Burge</option>
<option>Egg puff</option>
<option>Egg masala</option>
<option>Egg Bonda</option>
<option>Egg chilli</option>
<option>Egg Maggie</option>
<option>Egg Dosa</option>  
  </select>
  Egg Type<select name="type">
  <option>Select</option>
  <option>Nati</option>
  <option>Farm</option>
  <option>Boiler</option>
  <option>Duck</option>
  <option>Ostrich</option>
  <option>Dinosaurs</option>
  </select>
  Price<input type="text" name="price"/>
  Quantity<select name="quantity">
 <option>Select</option>
 <option>1</option>
 <option>2</option>
 <option>3</option>
 <option>4</option>
 <option>5</option>
  </select>
  Take Away yes:<input type="radio" value="true" name="takeAway"/>no:<input type="radio" value="false" name="takeAway"/>
  <input type="submit" value="order" class="btn btn-primary">
  </pre>
  </form>
</body>
</html>