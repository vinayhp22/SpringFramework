<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>X-workz || Aero-2023</title>

<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css"
	integrity="sha384-xOolHFLEh07PJGoPkLv1IbcEPTNtaed2xpHsD9ESMhqIYd0nLMwNLD69Npy4HI+N"
	crossorigin="anonymous">
</head>
<body>
	<nav style="background-color: black;" class="row">
		<div class="container col">
			<a href="index.jsp"> <img alt="x-workz logo"
				src="https://www.aeroindia.gov.in/front/updated_assets/aeroIndia_logo.png"
				width="400" height="100" />
			</a>
		</div>
		<div class="col p-3 my-3 bg-primary">
			<a href="aeroplane"
				style="color: white; padding-left: 300px; font-size: x-large;">Aero Show</a>
		</div>
			<div class="col p-3 my-3 bg-primary">
			<a href="index.jsp"
				style="color: white; padding-left: 300px; font-size: x-large;">Home</a>
		</div>
	</nav>
	<h1>Successfully registered to Aero Show 2023, Bengaluru</h1>
	<h3>Below is the details for your reference</h3>
	<h1>
	
	 	Company: ${dto.getCompany()}
	 	<br>
		Name: ${dto.getName()} <br>
		Cost: ${dto.getCost()} <br>
		Type: ${dto.getType()} <br>
		Country: ${dto.getCountry()}
		
		
	</h1>
	

</body>
</html>