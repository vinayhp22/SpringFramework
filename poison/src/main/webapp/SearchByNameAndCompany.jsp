<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>X-workz || Poison</title>

<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css"
	integrity="sha384-xOolHFLEh07PJGoPkLv1IbcEPTNtaed2xpHsD9ESMhqIYd0nLMwNLD69Npy4HI+N"
	crossorigin="anonymous">
</head>
<body>
	<nav style="background-color: black;" class="row">
		<div class="container col">
			<a href="index.jsp"> <img alt="x-workz logo"
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
			<a href="list" style="color: white; font-size: x-large;">Database
				List</a><br>
		</div>
		<div class="col p-3 my-3 bg-primary">
			<a href="SearchByNameAndCompany.jsp" style="color: white; font-size: x-large;">SearchByNameAndCompany</a><br>
		</div>
	</nav>
	<h1>Poison Search</h1>
	<c:forEach items="${messages}" var="m">
		<span style="color: red;">${m} <br></span>
	</c:forEach>
	<span style="color: red;">${message}</span>
	<form action="searchByNameAndCompany">
		Search By Company : <input type="text" name="company"
			required="required"/> and 
			Name : <input type="text" name="name"
			required="required"/>
			<input type="submit" value="Search" />
	</form>
	<div class="container">
		<table style="width: 100%;" class="table table-striped">
			<thead>
				<tr>
					<th>Id :</th>
					<th>Company:</th>
					<th>Name:</th>
					<th>Cost:</th>
					<th>Type:</th>
					<th>Country:</th>
					<th>Update</th>
					<th>Delete</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${list}" var="t">
					<tr>
						<td>${t.id}</td>
						<td>${t.company}</td>
						<td>${t.name}</td>
						<td>${t.cost}</td>
						<td>${t.type}</td>
						<td>${t.country}</td>
						<td><a href="update?id=${t.id}" style="color: red;">Edit</a></td>
						<td><a href="delete?id=${t.id}" style="color: red;">Delete</a></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
	<div>
		<marquee>
			<img width="20%" alt=""
				src="https://media3.giphy.com/media/v1.Y2lkPTc5MGI3NjExNjdjMzU2MWIxYjFmMWI1NDhiMmIxYjllODM4OTI4MTAwNzQ5ODJmYiZjdD1n/WTpEQkonGUK5rAhzB6/giphy.gif">
		</marquee>
	</div>
</body>
</html>