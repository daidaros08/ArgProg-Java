<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<% String flash = (String) request.getAttribute("flash"); %>
<% 
if (flash != null) {%>
<%= flash %>
<% } %>

<form action="login" method="post">
<label for="username"><input type="text" name="username" id="username" placeholder="Enter your username" /></label>
<br><br>
<label for="password"><input type="password" name="password" id="password" placeholder="Enter your password" /></label>
<br><br>
<input type="submit" value="Ingresar" />
</form>
</body>
</html>