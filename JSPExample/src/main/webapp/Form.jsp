<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<!DOCTYPE html>
<html>
<head>
<style>

</style>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<c:set var="datos" value="ROJO VERDE AZUL"></c:set>
<c:set var="colores" value="${fn:split(datos, ' ')}"></c:set>
<c:set var="todos" value="${fn:join(colores, ',')}"></c:set>


<body>
<h1>Salud-o-matic</h1>
<% String nombre =request.getParameter("nombre"); %>
<% String apellido =request.getParameter("apellido");%>


<h2>Bienvenido <%= nombre %> <%= apellido %></h2>

<form action="">
<label>Ponga su nombre asi lo saludamos
<br><input type="text" name="nombre" />
</label><br>
<label>Ingrese su apellido<br><input type="text" name="apellido" /></label>
<br>
<button type="submit"> Recibir Saludo</button>
</form>
</body>
</html>