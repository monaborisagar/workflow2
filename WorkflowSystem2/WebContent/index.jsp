<%@ page language="java" contentType="text/html; charset=ISO-8859-1"

    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="ActionController" method="post">
	<table>
	<tr>
		<td>Student Fname:</td>
		<td><input type="text" name="fname"></td>
	 </tr>
	 <tr>
		<td>Student Lname:</td>
		<td><input type="text" name="lname"></td>
	 </tr>
	  <tr>
		<td>Course Name1:</td>
		<td><input type="text" name="cname1"></td>
	 </tr>
	 <tr>
		<td>Course Name2:</td>
		<td><input type="text" name="cname2"></td>
	 </tr>
	 <tr>
		<td>Course Name3:</td>
		<td><input type="text" name="cname3"></td>
	 </tr>
	 <tr>
	 <td></td>
	 <td><input type="submit" name="action" value="Insert"></td>
	 </tr>
	</table>
</form>
</body>
</html>