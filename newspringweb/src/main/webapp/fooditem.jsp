<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>X-workz</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous" />
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
	crossorigin="anonymous"></script>
</head>
<body>

	<!--  -->
	<nav class="navbar navbar-dark bg-dark">
		<div class="container-fluid">
			<a class="navbar-brand" href="#"> <img
				src="https://x-workz.in/static/media/Logo.cf195593dc1b3f921369.png"
				alt="" width="90" height="48" class="d-inline-block align-text-top">
			</a> <a href="Index.jsp">Home</a>
		</div>
	</nav>

	<!-- form -->
	<form action="give" method="post">
		<div class="mb-3">
			<label for="foodItemName" class="form-label">Food item Name :
			</label> <input type="text" class="form-control" id="foodItemName"
				placeholder="Enter the name" name="name">
		</div>

		<div class="input-group mb-3">
			<label class="input-group-text" for="inputGroupSelect">Food
				Item Type</label> <select class="form-select" id="inputGroupSelect"
				name="type">
				<option selected>Choose...</option>
				<option value="Veg">Veg</option>
				<option value="Non-Veg">Non-Veg</option>
				<option value="Both">Both</option>
			</select>
		</div>

		<label for="customRange1" class="form-label">Quantity</label> <input
			type="range" class="form-range" min="1" max="5" id="customRange1"
			name="quantity">

		<div class="mb-3">
			<label for="foodItemPrice" class="form-label">Food item Price
				: </label> <input type="number" class="form-control" id="foodItemPrice"
				placeholder="Enter the Price" name="price">
		</div>

		<button type="submit" class="btn btn-dark">Send</button>
	</form>
</body>
</html>