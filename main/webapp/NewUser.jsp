<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
	
<body>

	<%
		String cityValue = (String)request.getAttribute("cityValue");
		String hobbyValue = (String)request.getAttribute("hobbyValue");
	%>
<form action="RegistrationServlet">
First Name :<input type="text" name="firstName" value="${firstNameValue}">${firstNameError}<br>
Email : <input type="email" name="email" value="${emailValue}">${emailError}<br>
Password : <input type="password" name="password"><br>
Gender: Male<input type="radio" name="gender" checked="checked" value="male"/>
		Female<input type="radio" name="gender" value="female"><br>
City :<select name="city">
		<option value="-1">Select City</option>
		<option value="ahm" <%=cityValue !=null  && cityValue.equals("ahm") ? "selected" : "" %>>Ahmedabad</option>
		<option value="baroda"  <%=cityValue !=null  && cityValue.equals("baroda") ? "selected" : "" %>>Baroda</option>
		<option value="surat" <%=cityValue !=null  && cityValue.equals("surat") ? "selected" : "" %>>Surat</option>
	</select>	${cityError}
		<br>
Hobby:Cricket<input type="checkbox" name="hobby" value="ckt" <%=hobbyValue != null && hobbyValue.contains("ckt") ? "checked" : ""%>>
		Swimming <input type="checkbox" name="hobby"  value="swim" <%=hobbyValue != null && hobbyValue.contains("swim") ? "checked" : ""%>>
		Singing <input type="checkbox" name="hobby"  value="singing" <%=hobbyValue != null && hobbyValue.contains("singing") ? "checked" : ""%>>
		<br>
		${hobbyError}
		<br>
	<input type="submit" value="Signup">
</form>
</body>
</html>