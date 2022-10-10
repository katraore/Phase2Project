<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Learner's Academy</title>
</head>
<body>
<div class="container1">

<form action="LearnerAcademyServlet2" method="get">
<h1 class="item">Student's Information</h1>
	<div class="item" ><input type="text" placeholder="Roll Number" class="tb" name="rollno" /></div>
	<div class="item" ><input type="text" placeholder="Name" class="tb"  name="name" /></div>
	<div class="item" >
	<select class="tb" name="classes2">
	<option value="1">Algebra</option>
	<option value="2">Biology</option>
	<option value="3">Chemestry</option>
	<option value="4">Data Science</option>
	<option value="5">English</option>
	<option value="6">French</option>
	<option value="7">Java</option>
	
	</select></div>
	<div ><input type="submit" value="SUBMIT" class="btn"  /></div>
	<div class="Data"><a href="ReadData">Read Data Entries</a></div>
</form>
</div>
</body>
</html>