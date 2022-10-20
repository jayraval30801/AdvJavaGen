<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h2>My Cart</h2>
	<%-- <%
		if(productId == 1)
		{
			out.print("Iphone 11 45000");
		}
		else if(productId == 2)
		{
			out.print("Legion 540 55000");
		}
		else if(productId == 3)
		{
			out.print("Microwave Oven 35000");
		}
	%> --%>
	
	<%
		ArrayList<Integer> cart  = (ArrayList<Integer>)session.getAttribute("cart");
	%>
	<%
			int iphone  = 0;
			int oven = 0;
			int legion = 0;
			for(Integer productId : cart)
			{
				if(productId == 1)
				{
					iphone ++;
					
				}else if(productId == 2)
				{
					legion++;
					
				}else if(productId == 3)
				{
					oven ++;
				}
			}
			
			if(iphone!=0)
			{
				out.print("Iphone 11 &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+iphone+"&nbsp;&nbsp;&nbsp;45000&nbsp;"+(45000*iphone)+"<br>");
			}
			if(legion!=0)
			{
				out.print("Legion 540 &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+legion+"&nbsp;&nbsp;&nbsp;45000&nbsp;"+(55000*legion)+"<br>");
			}
			if(oven!=0)
			{
				out.print("Oven &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+oven+"&nbsp;&nbsp;&nbsp;35000&nbsp;"+(35000*oven)+"<br>");
			}
			
		
	%>
</body>
</html>













