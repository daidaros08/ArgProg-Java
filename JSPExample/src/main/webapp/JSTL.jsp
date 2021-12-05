<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
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
<% 
		int[] valores = {2,4,5};
%>

<% pageContext.setAttribute("valores",valores); %>

<jsp:useBean id="servicio" class="service.CuadradoService"></jsp:useBean>
<h1>JSTL</h1>
<table>


		<thead>
			<tr>
				<th>Valor</th>
				<th>Cuadrado</th>
				<th>¿Es Par?</th>
			</tr>
		</thead>
		<tbody>
		 <c:forEach items="${valores}" var="x" >
			<tr>
				<td>
				<c:out value="${x}"></c:out>
				</td>
				<td>
				<c:out value="${servicio.cuadrado(x)}"></c:out>
				</td>
				<td>
				<c:choose>
				<c:when test="${servicio.esPar(x)}">OBVEO</c:when>
				<c:otherwise>NOPE!</c:otherwise>
				</c:choose>
				
				</td>
			</tr>
			</c:forEach> 
			
		</tbody>
	</table>


<body>

</body>
</html>