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
<nav style="background-color: black;"  >
		<img alt="" src="https://x-workz.in/static/media/Logo.cf195593dc1b3f921369.png" width="400" height="100">
</nav>
	<h1 style="color: red;">Save details of Bakery</h1>
	<form action="bakerySuccess">
		<h2>
			<pre> 
				Bakery Name : <input type="text" name="bakeryName" />
				Bakery Owner Name : <input type="text" name="bakeryOwnerName" />
				Bakery Owner WifeName : <input type="text" name="bakeryOwnerWifeName" />
				Bakery Owner Married : 
						Married   <input type="radio" value="yes"
						name="bakeryOwnerOwnerMarried"/>
						UnMarried <input type="radio" value="no"
						name="bakeryOwnerOwnerMarried"/>
				Bakery Famous For : 
				<textarea rows="5" cols="25" name="bakeryFamousFor"></textarea>
				Bakery Since : <input type="text" name="bakerySince" />
				<input type="submit" value="Save" style="color: red; background-color: blue;" />
			</pre>
		</h2>
	</form>
</body>
</html>