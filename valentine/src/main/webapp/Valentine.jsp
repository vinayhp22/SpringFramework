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
			</a> <a href="index.jsp">Home</a>
			
		</div>
	</nav>
	<h1>Welcome to Valentine data saving</h1>
	
	<c:forEach items="${errors}" var="e">
		<span style="color: red;">${e.message}<br></span>
	</c:forEach>
	
	<form action="valentine" method="post">
	<pre>
	Name : <input type="text" name="name"/>
	Valentine Name : <input type="text" name ="valentineName"/>
	Places : <select name="places">
				<option value="">SELECT</option>
				<c:forEach items="${places}" var="p">
					<option value="${p}">${p}</option>
				</c:forEach>
			</select>
	Gifts :	<select name="gifts">
				<option value="">SELECT</option>
				<c:forEach items="${gifts}" var="g">
					<option value="${g}">${g}</option>
				</c:forEach>
			</select>
	<input type="submit" value="Save"/>
	</pre>
	</form>
</body>
</html>