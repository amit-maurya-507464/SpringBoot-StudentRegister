<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Register</title>
</head>
<body style = "background-color: #ff751a">
	
	<form action="addStudent">
	
		<h3><u>Add new Student : </u></h3>
		Roll no : <input type="text" name="rollno"><br><br>
		Name    : <input type="text" name="sname"> <br><br>
		Course  : <input type="text" name="cource"> <br><br>
		
		<input type="Submit"><br><br><br>
	</form>
	
	<form action="findStudent">
	
		<h3><u>Find by Roll No.</u></h3>
		Roll no : <input type="text" name="rollno"><br><br>
		<input type="Submit">
	
	</form>
	
</body>
</html>