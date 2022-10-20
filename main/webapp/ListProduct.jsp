<%@page import="com.bean.ProductBean"%>
<%@page import="java.sql.ResultSet"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
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
				<th>ProductId</th>
				<th>ProductName</th>
				<th>Price</th>
				<th>Quantity</th>
				<th>Action</th>
		</tr>
		<%
			while(rs.next())
			{
				int productId =  rs.getInt("productId");
				String productName = rs.getString("productName");
				int price = rs.getInt("price");
				int qty = rs.getInt("qty");
		%>
		<tr>
				<td><%=productId%></td>
				<td><%=productName%></td>	
				<td><%=price%></td>
				<td><%=qty%></td>
				<td><a href="DeleteProductServlet?productId=<%=productId%>">Delete</a>
				<a href="EditProductServlet?productId=<%=productId%>">Edit</a></td>					
		</tr>
		<%
				}
		%>
	</table>
</body>
</html>