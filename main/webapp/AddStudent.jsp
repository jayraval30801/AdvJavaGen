<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Student</title>
</head>
<body>

	<form action="AddStudentServlet">
			FirstName:<input type="text" name="firstName">
			Email : <input type="email" name="email">
			Password : <input type="password" name="password">
			<input type="submit" value="signup">
	</form>
</body>
</html>