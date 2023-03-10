<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>X-workz ||Poison</title>

<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css"
	integrity="sha384-xOolHFLEh07PJGoPkLv1IbcEPTNtaed2xpHsD9ESMhqIYd0nLMwNLD69Npy4HI+N"
	crossorigin="anonymous">
</head>
<body>
	<nav style="background-color: black;" class="row">
		<div class="container col">
			<a href="index.jsp"> <img alt="WHO logo"
				src="https://www.who.int/images/default-source/fallback/header-logos/h-logo-blue.svg?sfvrsn=aaed4f35_18"
				width="400" height="100" />
			</a>
		</div>
		<div class="col p-3 my-3 bg-primary">
			<a href="poisonindia" style="color: white; font-size: x-large;">Poison
				Register</a>
		</div>
		<div class="col p-3 my-3 bg-primary">
			<a href="PoisonSearch.jsp" style="color: white; font-size: x-large;">Poison
				Search</a><br>
		</div>
		<div class="col p-3 my-3 bg-primary">
			<a href="SearchByCompany.jsp"
				style="color: white; font-size: x-large;">SearchByCompany</a><br>
		</div>
		<div class="col p-3 my-3 bg-primary">
			<a href="list"
				style="color: white;  font-size: x-large;">Database List</a><br>
		</div>
	</nav>
	<h1>Successfully registered to Poison Registry of Govt</h1>
	<h3>Below is the details for your reference</h3>
	<h1>

		<span style="">The Searched results are: </span><br> <span
			style="color: blue;">Company: </span>${dto.getCompany()} <br> <span
			style="color: blue;">Name: </span>${dto.getName()} <br> <span
			style="color: blue;">Cost: </span>${dto.getCost()} <br> <span
			style="color: blue;">Type: </span>${dto.getType()} <br> <span
			style="color: blue;">Country: </span>${dto.getCountry()}


	</h1>
	
		<div>
		<marquee>
			<img width="20%" alt="" src="https://media3.giphy.com/media/v1.Y2lkPTc5MGI3NjExNjdjMzU2MWIxYjFmMWI1NDhiMmIxYjllODM4OTI4MTAwNzQ5ODJmYiZjdD1n/WTpEQkonGUK5rAhzB6/giphy.gif">
		</marquee>
	</div>


</body>
</html>