<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>X-workz</title>

<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css"
	integrity="sha384-xOolHFLEh07PJGoPkLv1IbcEPTNtaed2xpHsD9ESMhqIYd0nLMwNLD69Npy4HI+N"
	crossorigin="anonymous">
</head>
<body>
	<nav style="background-color: black;" class="row">
		<div class="container col">
			<a href="index.jsp"> <img alt="x-workz logo"
				src="https://x-workz.in/static/media/Logo.cf195593dc1b3f921369.png"
				width="400" height="100" />
			</a>
		</div>
		<div class="col p-3 my-3 bg-primary">
			<a href="index.jsp" style="color: white; padding-left: 300px; font-size: x-large;">Home</a>
		</div>
	</nav>
	<h1>Enter the details to order</h1>
	<c:forEach items="${errors}" var="e">
		<span style="color: red;">${e.message}<br></span>
	</c:forEach>

	<c:forEach items="${passwordViolations}" var="pV">
		<span style="color: green;">${pV.message} <br></span>
	</c:forEach>

	<form action="bigbasket" method="post">
		<pre>
		Item* : <select name="item" required="required">
					<option value="">SELECT</option>
					<c:forEach items="${item}" var="i">
						<option value="${i}">${i}</option>
					</c:forEach>
				</select>
		Discount In Percentage : <input type="number" name="discountInPers"
				value="${dto.discountInPers}" />
		Quantity* : <input type="number" name="quantity"
				value="${dto.quantity}" required="required"/>
	  	Mfd Date* : <input type="date" name="mfdDate" value="${dto.mfdDate}" required="required"/>
	   	Expiry Date* : <input type="date" name="expiryDate"
				value="${dto.expiryDate}" required="required"/>
	   	Customer Name* : <input type="text" name="custName"
				value="${dto.custName}" required="required"/>
	   	Mobile Number* : <input type="number" name="mobileNumber"
				value="${dto.mobileNumber}" required="required"/>
	   	Email* : <input type="email" name="email" value="${dto.email}" required="required"/>
	   	Password* : <input type="password" name="password"
				value="${dto.password}" required="required" />
	  	Area* : <select name="area" required="required">
					<option value="">SELECT</option>
					<c:forEach items="${area}" var="a">
						<option value="${a}">${a}</option>
					</c:forEach>
				</select>
		<input type="submit" value="Order" />
		</pre>
	</form>
</body>
</html>