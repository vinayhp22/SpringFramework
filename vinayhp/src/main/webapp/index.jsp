<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>X-workz</title>
</head>
<body>
	<h1>Displaying Details of Vinay</h1>
	<form action="email">
		<h2>Email : ${email}</h2>
		<input type="submit" value="click here for my email" />
	</form>

	<form action="number">
		<h2>Mobile : ${number}</h2>
		<input type="submit" value="click here for my mobile number" />
	</form>

	<form action="aadhar">
		<h2>Aadhar : ${aadhar}</h2>
		<input type="submit" value="click here for my mobile number" />
	</form>

	<form action="age">
		<h2>Age : ${age}</h2>
		<input type="submit" value="click here for my age" />
	</form>

	<form action="dob">
		<h2>DOB and Time : ${dob}</h2>
		<input type="submit" value="Click here for my dob with time" />
	</form>

	<form action="salary">
		<h2>Desired Salary : ${salary}</h2>
		<input type="submit" value="Click here for my desired Salary" />
	</form>

	<form action="friends">
		<h2>Best Friends :</h2>
		<ul>
			<c:forEach items="${friends}" var="friends">
				<li>${friends}</li>
			</c:forEach>
		</ul>
		<input type="submit" value="Click here for my Best Friends" />
	</form>

	<form action="skillset">
		<h1>Skill Set :</h1>
		<ul>
			<c:forEach items="${skillset}" var="skillset">
				<li>${skillset}</li>
			</c:forEach>
		</ul>
		<input type="submit" value="Click here for my skillset"/>
	</form>

	<form action="education">
		<h2>Education Details :</h2>
		<h3>primarySchool : ${education.primarySchool}</h3>
		<h3>higherPrimarySchool : ${education.higherPrimarySchool}</h3>
		<h3>highSchool : ${education.highSchool}</h3>
		<h3>puCollege : ${education.puCollege}</h3>
		<h3>graduationCollege : ${education.graduationCollege}</h3>
		<h3>sslcPercentage : ${education.sslcPercentage}</h3>
		<h3>pucPercentage : ${education.pucPercentage}</h3>
		<h3>degreeCGPA : ${education.degreeCGPA}</h3>
		<h3>noOfBacklogs : ${education.noOfBacklogs}</h3>
		<h3>degreeYearback : ${education.degreeYearback}</h3>
		<input type="submit" value="Click here for my education Details" />
	</form>

	<form action="family">
		<h2>Family Details :</h2>
		<h3>maneDevru : ${family.maneDevru}</h3>
		<h3>fatherName : ${family.fatherName}</h3>
		<h3>motherName : ${family.motherName}</h3>
		<h3>sisterName : ${family.sisterName}</h3>
		<h3>uncleName : ${family.uncleName}</h3>
		<h3>noOfchildrens : ${family.noOfchildrens}</h3>
		<h3>noOfElders : ${family.noOfElders}</h3>
		<h3>mostEducated : ${family.mostEducated}</h3>
		<h3>mostElder : ${family.mostElder}</h3>
		<h3>villageName : ${family.villageName}</h3>
		<input type="submit" value="Click here for my Family Details" />
	</form>

	<form action="mobile">
		<h2>Mobile Details :</h2>
		<h3>companyName : ${mobile.companyName}</h3>
		<h3>modelName : ${mobile.modelName}</h3>
		<h3>processor : ${mobile.processor}</h3>
		<h3>storageInGB : ${mobile.storageInGB}</h3>
		<h3>ramInGB : ${mobile.ramInGB}</h3>
		<h3>androidVersion : ${mobile.androidVersion}</h3>
		<h3>mostUsedApp : ${mobile.mostUsedApp}</h3>
		<h3>sim : ${mobile.sim}</h3>
		<h3>noOfSimSlots : ${mobile.noOfSimSlots}</h3>
		<h3>mobileNumber : ${mobile.mobileNumber}</h3>
		<input type="submit" value="Click here for my Mobile Details" />
	</form>

	<form action="beverage">
		<h2>Beverage Details :</h2>
		<h3>name : ${beverage.name}</h3>
		<h3>price : ${beverage.price}</h3>
		<h3>quantityInML : ${beverage.quantityInML}</h3>
		<h3>shopName : ${beverage.shopName}</h3>
		<h3>shopLocation : ${beverage.shopLocation}</h3>
		<h3>shopOwner : ${beverage.shopOwner}</h3>
		<h3>shopNumber : ${beverage.shopNumber}</h3>
		<h3>fssaiCertified : ${beverage.fssaiCertified}</h3>
		<h3>noOfServers : ${beverage.noOfServers}</h3>
		<h3>upiID : ${beverage.upiID}</h3>
		<input type="submit" value="Click here for beverage Details" />
	</form>
</body>
</html>