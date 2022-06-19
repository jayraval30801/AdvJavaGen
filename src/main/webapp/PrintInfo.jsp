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
	String city = (String) request.getAttribute("city");
	String hobby[] = (String[]) request.getAttribute("hobby");
	%>
First Name: <%=firstName%>
<br>Email : <%=email %>
<br>Password : <%=password %>
<br>City : <%=city%>
	
<br>Hobby : <%=hobby[0]%>
</body>
</html>