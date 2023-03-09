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
			<a href="index.jsp"
				style="color: white; padding-left: 300px; font-size: x-large;">Home</a>
		</div>
		<div class="col p-3 my-3 bg-primary">
			<a href="AeroSearch.jsp"
				style="color: white; padding-left: 300px; font-size: x-large;">Aero Search</a>
		</div>
	</nav>
	<h1>Welcome to Aero Show 2023, Bengaluru</h1>
	<c:forEach items="${errors}" var="e">
		<span style="color: red;">${e.message} <br></span>
	</c:forEach>
	<form action="aeroplane" method="post">
		<pre>
			Company* : <input type="text" name="company" value="${dto.company}"/>
	
			Name* : <input type="text" name="name" value="${dto.name}"/>
	
			Cost* : <input type="text" name="cost" value="${dto.cost}"/>
			
			Type* : <select name="type" required="required">
						<option value="">Select</option>
						<c:forEach items="${type}" var="t">
							<option value="${t}">${t}</option>
						</c:forEach>
					</select>

			Country* : <select name="country" required="required">
							<option>Select</option>
							<c:forEach items="${country}" var="c">
								<option value="${c}">${c}</option>
							</c:forEach>
						</select>
					<input type="submit" value="Register"/>
		</pre>
	</form>
</body>
</html>