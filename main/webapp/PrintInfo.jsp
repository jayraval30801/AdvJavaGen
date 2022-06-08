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
	String firstName  = (String)request.getAttribute("firstName");
	String email = (String)request.getAttribute("email");
	String password  = (String)	request.getAttribute("password");
	%>
First Name: <%=firstName%>
Email : <%=email %>
Password : <%=password %>
</body>
</html>