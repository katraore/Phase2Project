<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Learner's Academy</title>
</head>
<body>


<div class="maincontainer">

<div class="container">

<form action="LearnerAcademyServlet" method="get">
<h1 class="item">Teacher's Information</h1>

	
	<div class="item" >
	<select class="tb" name="teacher">
	<option value="1">Kassoum Traore</option>
	<option value="2">Hamady Ba</option>
	<option value="3">Nouhoum Diallo</option>
	<option value="4">Niame Ba</option>
	<option value="5">Sira Keita</option>
	
	</select></div>
	
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
	
	<div class="checkbox">
	<div class=""><input type="checkbox" name="subject" id="mt" value="1" />
	<label for="mt"><span>Mathematics</span></label></div>
	<div class="cb"><input type="checkbox" name="subject" id="lg" value="2" />
	<label for="lg"><span >Languages</span></label></div>
	<div class="cb"><input type="checkbox" name="subject" id="if" value="3"  />
	<label for="if"><span >Informatics</span></label></div>
	<div class="cb"><input type="checkbox" name="subject" id="bs" value="4" />
	<label for="bs"><span >Business</span></label></div>
	<div class="cb"><input type="checkbox" name="subject" id="sp" value="5"  />
	<label for="sp"><span >Sports</span></label></div>
	<div class="cb"><input type="checkbox" name="subject" id="ns" value="6" />
	<label for="ns"><span >Nursing</span></label></div>	

	</div>
	
	
	<div ><input type="submit" value="SUBMIT" class="btn"  /></div>
</form>
</div>


</div>


</body>
</html>