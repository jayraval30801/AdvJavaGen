<%@page import="java.sql.ResultSet"%>
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
	ResultSet rs = (ResultSet) request.getAttribute("rs");
	rs.next();
	%>
	<form action="UpdateStudentServlet">
		<input type="hidden" name="studentId"
			value="<%=rs.getInt("studentId")%>"> FirstName:<input
			type="text" name="firstName" value="<%=rs.getString("firstName")%>"><br>
		Email : <input type="email" name="email"
			value="<%=rs.getString("email")%>"><br> Password : <input
			type="password" name="password" value="<%=rs.getString("password")%>"><br>
		<input type="submit" value="Update">
	</form>
</body>
</html>