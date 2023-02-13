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
	<nav style="background-color: black;">
		<div class="container-fluid">
			<a> <img alt=""
				src="https://x-workz.in/static/media/Logo.cf195593dc1b3f921369.png"
				width="400" height="100" />
			</a> <a href="index.jsp">Home</a> </a> <a href="Egg.jsp">Egg</a>

		</div>
	</nav>
	<h1>Welcome to CM Page</h1>


	<form action="cmo" method="post">
		<pre>
	Hotel Name : <input type="text" name="name" />
	State: 	<select name="state">
						<option>Select</option>
						<option>KA</option>
						<option>TN</option>
						<option>Kerala</option>
						<option>TE</option>
						<option>AP</option>
						<option>MH</option>
						<option>GJ</option>
						<option>RJ</option>
						<option>Delhi</option>
					</select>
	Tenure : 	<select name="tenure">
					<option>Select</option>
					<option>1</option>
					<option>2</option>
					<option>3</option>
					<option>4</option>
					<option>5</option>
				</select>
	Party 	<select name="party">
					<option>Select</option>
					<option>INC</option>
					<option>BJP</option>
					<option>KJP</option>
					<option>APP</option>
					<option>RJD</option>
					<option>JDS</option>
				</select>
	Portfolios : <textarea rows="5" cols="40" name="portfolios"></textarea>
		<input type="submit" value="Save" class="btn btn-primary" />
	</pre>
	</form>
</body>
</html>