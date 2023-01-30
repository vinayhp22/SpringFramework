<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Vinay Software Solutions</title>
</head>
<body>
	<h1>Welcome to my world</h1>
	<h2>Sending the details of your favorite person</h2>
	<form action="vicky" method="post">
		<pre>
			First Name: <input type="text" name="fname" />
			Last Name: <input type="text" name="lname" />
			Gender: Male <input type="radio" name="gender" value="male"/>
			 		Female <input type="radio" name="gender" value="female"/>
			Reason: <input type="textarea" name="reason" />
			Address: <input type="textarea" name="address" />
			<input type="submit" value="Send"/>
		</pre>
	</form>
</body>
</html>