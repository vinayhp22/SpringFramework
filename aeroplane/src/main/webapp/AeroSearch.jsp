<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>X-workz || AeroIndia-2023</title>

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
	<h1>AeroIndia Search</h1>
	<h3><span style="color: red;">${message}</span> </h3>
	<form action="search">
		Search By Id : <input type="text" name="id" required="required"/>
		<input type="submit" value="Search"/>
	</form>
	<h1>
		<span style="">The Searched results are: </span><br>
		<span style="color: blue;">Company: </span>${dto.getCompany()} <br>
		<span style="color: blue;">Name: </span>${dto.getName()} <br>
		<span style="color: blue;">Cost: </span>${dto.getCost()} <br>
		<span style="color: blue;">Type: </span>${dto.getType()} <br>
		<span style="color: blue;">Country: </span>${dto.getCountry()}
	</h1>
</body>
</html>