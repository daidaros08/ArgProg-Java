<html>
<style>
td{
background-color:lightgray;
}
</style>
<body>
<h1>Prueba de JSP!!</h1>
<div>
<p>Ponemos la fecha actual:</p>
<p>
Hoy es <%= new java.util.Date() %>
</p>
</div>
<br>
<br>
<p>
Los pasos que segui para hacer correr este server son:
</p>
<ul>
<li>Creación del proyecto</li>
<li>Edicion del pom.xml</li>
<li>Edicion web.xml</li>
<li>Meter mano a web.jsp</li>
<li>Configurar el server y ejecutar</li>
</ul>
<br><br>
<div>
<h2>Expresiones</h2>
<p>Hola mundo en mayusculas</p>

<p><%= "hola mundo".toUpperCase() %></p>
</div>
<br><br>

<h2>Scriplets</h2>

<h3>Esperado</h3>
<ul>
<li>item 01</li>
<li>item 02</li>
<li>item 03</li>
</ul>

<h3>Obtenido con Scriptlets</h3>
<ul>
<% 
for (int i=1; i<=3; i++) {
	%>
	<li> <% out.println("item 0"+i); %></li>
	
	<% 
	}
	%>	

</ul>
<p><% int a = 11; %></p>
<p><% 
if (a>10)
	out.print("es mayor");
%></p>


<br><br>

<h2>Declaraciones</h2>
<h3>Esperado</h3>

	<table>
	<%! 
	int cuadrado (int x) {return x*x;}
	%>
		<thead>
			<tr>
				<th>Valor</th>
				<th>Cuadrado</th>
			</tr>
		</thead>
		<tbody>
			<tr>
				<td>2</td>
				<td>4</td>
			</tr>
			<tr>
				<td>4</td>
				<td>16</td>
			</tr>
			<tr>
				<td>5</td>
				<td>25</td>
			</tr>
		</tbody>
	</table>

<br>
<br>
<h3>Obtenido</h3>

	<table>
		<thead>
			<tr>
				<th>Valor</th>
				<th>Cuadrado</th>
			</tr>
		</thead>
		<tbody>
		<% 
		int[] valores = {2,4,5};
		
		for (int x:valores){
		
		%>
			<tr>
				<td><%= x %></td>
				<td><%= cuadrado(x) %></td>
			</tr>
		
		<% 
		}
		%>
			
		</tbody>
	</table>


</body>
</html>
