<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="RegistrationServlet">
First Name :<input type="text" name="firstName" value=""><br>
Email : <input type="email" name="email" value=""><br>
Password : <input type="password" name="password"><br>
Gender: Male<input type="radio" name="gender" checked="checked" >
		Female<input type="radio" name="gender"><br>
City :<select name="city">
		<option value="-1">Select City</option>
		<option value="ahm">Ahmedabad</option>
		<option value="baroda">Baroda</option>
		<option value="surat">Surat</option>
	</select>	
		<br>
Hobby:Cricket<input type="checkbox" name="hobby">
		Swimming <input type="checkbox" name="hobby">
		Singing <input type="checkbox" name="hobby"><br>
		<br>
	<input type="submit" value="Signup">
</form>
</body>
</html>