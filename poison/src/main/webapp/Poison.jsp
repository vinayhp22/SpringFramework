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
	<h1>Welcome to Welcome to Poison products by Govt of India</h1>
	<c:forEach items="${errors}" var="e">
		<span style="color: red;">${e.message} <br></span>
	</c:forEach>
	<form action="poisonindia" method="post">
		<pre>
			<h4>
			Company* : <input type="text" name="company" value="${dto.company}" />
	
			Product Name* : <input type="text" name="name" value="${dto.name}" />
	
			Cost* : <input type="text" name="cost" value="${dto.cost}" />
			<!-- Using javascript - retention of value --> 
			Type* : <select name="type" required="required" id="mySelect">
						<option value="">SELECT</option>
						<c:forEach items="${type}" var="t">
							<option value="${t}">${t}</option>
						</c:forEach>
					</select>
			<!-- Using jsp tags - retention of value -->
			Country* : <select name="country" required="required" id="mySelect">
							<option value="">SELECT</option>
							<c:forEach items="${country}" var="c">
								<option value="${c}" ${c == dto.country ? 'selected' : ''}>${c}</option>
							</c:forEach>
						</select>
		<!-- Using JSP tags - retention of value  	
		Type* : <select name="type" required="required" id="mySelect">
					  <option value="">SELECT</option>
					  <c:forEach items="${type}" var="t">
					    <c:choose>
					      <c:when test="${t == dto.type}">
					        <option value="${t}" selected>${t}</option>
					      </c:when>
					      <c:otherwise>
					        <option value="${t}">${t}</option>
					      </c:otherwise>
					    </c:choose>
					  </c:forEach>
					</select>

			 -->	
				<input type="submit" value="Register" onclick="myFunction()" />
	</h4>
	</pre>
	</form>
	<div>
		<marquee>
			<img width="20%" alt=""
				src="https://media3.giphy.com/media/v1.Y2lkPTc5MGI3NjExNjdjMzU2MWIxYjFmMWI1NDhiMmIxYjllODM4OTI4MTAwNzQ5ODJmYiZjdD1n/WTpEQkonGUK5rAhzB6/giphy.gif">
		</marquee>
	</div>
					<script>
					console.log("${dto.type}");
					  var savedValue = "${dto.type}"; // replace with your saved value
					  var selectElement = document.getElementById("mySelect");
					  var options = selectElement.options;
					  for (var i = 0; i < options.length; i++) {
					    if (options[i].value === savedValue) {
					      options[i].selected = true;
					      break;
					    }
					  }
					</script>
</body>
</html>