<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<!-- jsp = java servlet page 
	//java scriptlet page
	 -->
	<form action="NumberServlet">
		No1.<input type="number" value="number1" name="number1"><br>
		<input type="submit" value="Submit">	
	</form>
	${ans}
</body>
</html>