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
			ResultSet rs = (ResultSet)request.getAttribute("rs");
	%>
	<table border="1">
		<tr>
				<th>StudentId</th>
				<th>FirstName</th>
				<th>Email</th>
				<th>Password</th>
				<th>Action</th>
		</tr>
		<%
			while(rs.next())
			{
				int studentId =  rs.getInt("studentId");
				String firstName = rs.getString("firstName");
				String email = rs.getString("email");
				String password = rs.getString("password");
		%>
		<tr>
				<td><%=studentId%></td>
				<td><%=firstName%></td>
				<td><%=email%></td>
				<td><%=password%></td>
				<td><a href="DeleteStudentServlet?studentId=<%=studentId%>">Delete</a>
				<a href="EditStudentServlet?studentId=<%=studentId%>">Edit</a></td>			
		</tr>
		<%
				}
		%>
		
	</table>
</body>
</html>