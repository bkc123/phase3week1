<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>welcome page</title>
</head>
<body>
	<div align="center">
		<%= "<h1>Welcome!</h1>" %>
		<form action="WelcomeController" method="post">
			  access time:  new Date() 
		</form>
	</div>
	<form action="usersearch.jsp">
		<input type="submit" name="click" value="Search">
	</form>

</body>
</html>