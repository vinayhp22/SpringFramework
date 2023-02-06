<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>X-workz</title>
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" 
        rel="stylesheet" 
        integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" 
        crossorigin="anonymous">
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
          integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
           crossorigin="anonymous"></script>
</head>
<body>
<nav class="navbar navbar-dark bg-dark">
  <div class="container-fluid">
    <a class="navbar-brand" href="#">
      <img src="https://www.x-workz.in/static/media/Logo.cf195593dc1b3f921369.png" 
           alt="" width="90" height="48" class="d-inline-block align-text-top">
      
    </a>
    <a href="index.jsp">Home page</a>
  </div>
</nav>
<h1>Welcome to Casino</h1>
<form action="casino" method="post">
<pre>
     Name<input type ="text" name="name"/>
     Cruise<input type="text" name="cruise"/>
     Entry Fee<input type="number" name="entryFee"/>
     Free Food Yes: <input type="radio" name="freeFood" value="true"/>
               No : <input type="radio" name="freeFood" value="false"/>
     <input type="submit" value="Get the brand" class="btn-btn-primary"/>
     
</pre>
</form>
</body>
</html>