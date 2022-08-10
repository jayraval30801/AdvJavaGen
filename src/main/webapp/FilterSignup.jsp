<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="SignupServlet2">
			FirstName: <input type="text" name="firstName"><br> ${firstNameError}
			Email : <input type="text" name="email"><br>${emailError}
			Password : <input type="password" name="password"><br>${passwordError}
			<button type="submit">Submit</button>
	</form>
</body>
</html>