<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
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

			<a href="#"> <img
				src="https://x-workz.in/static/media/Logo.cf195593dc1b3f921369.png"
				alt="" width="80" height="48" class="d-inline-block align-text-top">
			</a>
		</div>

	</nav>



	<form action="bottle ">
		<h6>Display EMAILID :${emailId}</h6>
		<input type="submit" value="show emailId" />
	</form>


	<form action="water ">
		<h6>Display MobileNo :${ MobileNo}</h6>
		<input type="submit" " value="show MobileNo" />
	</form>


	<form action="doc ">
		<h6>Display Aadhar :${ Aadhar}</h6>
		<input type="submit" " value="show Aadhar" />
	</form>

	<form action="yhasu ">
		<h6>Display Age :${ Age}</h6>
		<input type="submit" " value="show yhasu" />
	</form>

	<form action="varsha ">
		<h6>Display DOB :${ DOB}</h6>
		<input type="submit" " value="show DOB" />
	</form>


	<form action="friend">
		<h6>Display friend :</h6>
		<input type="submit" value="show friend" />
		<ul>
			<c:forEach items="${friends}" var="item1">
				<li>${item1}</li>
			</c:forEach>
		</ul>

	</form>

	<form action="place">
		<h6>Display place :</h6>
		<input type="submit" value="show place" />
		<ul>
			<c:forEach items="${ places}" var="item2">
				<li>${item2}</li>
			</c:forEach>
		</ul>

	</form>
	<form action="skill">
		<h6>Display skill :</h6>
		<input type="submit" value="show skill" />
		<ul>
			<c:forEach items="${skills}" var="item3">
				<li>${item3}</li>
			</c:forEach>
		</ul>

	</form>
	<form action="phone ">
		<h6>Display MobileDTO :${ mobile}</h6>
		<input type="submit" value="show mobile" />
		<lable>MobileDTO:${ mobile.getMobileName()}</lable>
		<lable>MobileDTO:${ mobile.getMobilePrice()}</lable>
		<lable>MobileDTO:${ mobile.getNoOfMobile()}</lable>
		<lable>MobileDTO:${ mobile.getMobileId()}</lable>
		<lable>MobileDTO:${ mobile.getMobileShopName()}</lable>
		<lable>MobileDTO:${ mobile.getMobileShopPH()}</lable>
		<lable>MobileDTO:${ mobile.getOwnerName()}</lable>
		<lable>MobileDTO:${ mobile.getNoOfEmployee()}</lable>
		<lable>MobileDTO:${ mobile.getMobileGSTNo()}</lable>
		<lable>MobileDTO:${ mobile.getMobileShopLocation()}</lable>

	</form>

	</form>
	<form action="masala ">
		<h6>Display ChatDTO :${ spicy}</h6>
		<input type="submit" value="show mobile" />
		<lable>ChatDTO:${ spicy.getChatNameleName()}</lable>
		<lable>ChatDTO:${ spicy.getChatPrice()}</lable>
		<lable>ChatDTO:${ spicy.getNoOfPlates()}</lable>
		<lable>ChatDTO:${ spicy.getOwnerName()}</lable>
		<lable>ChatDTO:${ spicy.getsetId()}</lable>
		<lable>ChatDTO:${ spicy.getChatShopName()}</lable>
		<lable>ChatDTO:${ spicy.getChatShopPH()}</lable>
		<lable>ChatDTO:${ spicy.getNoOfEmployee()}</lable>
		<lable>ChatDTO:${ spicy.getChatGSTNo()}</lable>
		<lable>ChatDTO:${ spicy.getChatShopLocation()}</lable>

	</form>
	</form>
	<form action="kutuma">
		<h6>Display FamilyDTO :${ bandha}</h6>
		<input type="submit" value="show mobile" />
		<lable>FamilyDTO:${ bandha.getFamilyName()}</lable>
		<lable>FamilyDTO:${ bandha.getNoOfperson()}</lable>
		<lable>FamilyDTO:${ bandha.getFamilyType()}</lable>
		<lable>FamilyDTO:${ bandha.getFamilyHeadName()}</lable>
		<lable>FamilyDTO:${ bandha.getFamilyHomeName()}</lable>
		<lable>FamilyDTO:${ bandha.getFamilyBusinessName()}</lable>
		<lable>FamilyDTO:${ bandha.getFamilyDoctorName()}</lable>
		<lable>FamilyDTO:${ bandha.getFamilyHomeLocated()}</lable>
		<lable>FamilyDTO:${ bandha.getFamilyNoOfCar()}</lable>
		<lable>FamilyDTO:${ bandha.getFamilyNoOfBike()}</lable>

	</form>
</form>
	<form action="beverage">
		<h6>Display BeverageDTO :${ juice}</h6>
		<input type="submit" value="show mobile" />
		<lable>BeverageDTO:${ juice.getBeverageName()}</lable>
		<lable>BeverageDTO:${ juice.getNoOfbeverage()}</lable>
		<lable>BeverageDTO:${ juice.getBeveragePrice()}</lable>
		<lable>BeverageDTO:${ juice.getOwnerName()}</lable>
		<lable>BeverageDTO:${ juice.getBeverageId()}</lable>
		<lable>BeverageDTO:${ juice.getBeverageShopName()}</lable>
		<lable>BeverageDTO:${ juice.getBeverageShopPH()}</lable>
		<lable>BeverageDTO:${ juice.getBeverageShopLocation()}</lable>
		
	</form>
	<form action="education">
		<h6>Display EducationDTO :${ data}</h6>
		<input type="submit" value="show mobile" />
		<lable>EducationDTO:${ data.getName()}</lable>
		<lable>EducationDTO:${ data.getSchoolName()}</lable>
		<lable>EducationDTO:${ data.getCollageName()}</lable>
		<lable>EducationDTO:${ data.getDegreeCollageName()}</lable>
		<lable>EducationDTO:${ data.getTenthMark()}</lable>
		<lable>EducationDTO:${ data.getPuMarks()}</lable>
		<lable>EducationDTO:${ data.getBEMarks()}</lable>
		<lable>EducationDTO:${ data.getSchoolPassedOut()}</lable>
		<lable>EducationDTO:${ data.getCollagePassedOut()}</lable>
		<lable>EducationDTO:${ data.getDegreePassedOut()}</lable>

	</form>




</body>
</html>