<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>X-workz</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css">

</head>
<body>
	<nav style="background-color: black;">
		<ul>
			<li><img alt="icon"
				src="https://x-workz.in/static/media/Logo.cf195593dc1b3f921369.png"
				width="400" height="100"></li>
			<li><a href="index.jsp">Home</a></li>

		</ul>
	</nav>
	<h1 style="color: red;">Saved!!! The details of Bakery</h1>
	<h3>Name : ${bakeryName}</h3>
	<h3>Owner : ${bakeryOwnerName}</h3>
	<h3>Wife : ${bakeryOwnerWifeName}</h3>
	<h3>Married : ${bakeryOwnerOwnerMarried}</h3>
	<h3>Famous : ${bakeryFamousFor}</h3>
	<h3>Since : ${bakerySince}</h3>


</body>
</html>