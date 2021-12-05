<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<!DOCTYPE html>
<html>
<head>
<style>
td{
background-color:lightgray;
}
</style>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<c:set var="datos" value="ROJO VERDE AZUL"></c:set>
<c:set var="colores" value="${fn:split(datos, ' ')}"></c:set>
<c:set var="todos" value="${fn:join(colores, ',')}"></c:set>

<h1>JSTL: funciones</h1>
<h2>Esperado</h2>
<p>ROJO VERDE AZUL dividido es:</p>
<ul>
	<li>ROJO</li>
	<li>VERDE</li>
	<li>AZUL</li>
</ul>
<p>Nuevamente junto es:</p>
<p>ROJO,VERDE,AZUL</p>
<br><br>

<h2>Obtenido</h2>
<p><c:out value="${datos} dividido es:"> </c:out></p>
<ul>
<c:forEach items="${colores}" var="color">

	<li>
		<c:out value="${color}"></c:out>
	</li>

</c:forEach>
</ul>
<p>Nuevamente junto es:</p>
<p>
	<c:out value="${todos}"></c:out>
</p>



<body>

</body>
</html>