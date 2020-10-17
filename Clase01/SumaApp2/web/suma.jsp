<%-- 
    Document   : suma
    Created on : 17/10/2020, 01:12:19 PM
    Author     : Gustavo Coronel
--%>

<%

	// Datos
	int n1 = Integer.parseInt(request.getParameter("n1"));
	int n2 = Integer.parseInt(request.getParameter("n2"));
	// Proceso
	int suma = n1 + n2;

%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>SUMA</title>
		<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">

	</head>
	<body>
		<div class="container">
			<h1>SUMA</h1>
			<table class="table  table-striped">
				<thead>
					<tr>
						<th>PROPIEDAD</th>
						<th>VALOR</th>
					</tr>
				</thead>
				<tbody>
					<tr>
						<td>Número 1</td>
						<td><%= n1 %></td>
					</tr>
					<tr>
						<td>Número 2</td>
						<td><%= n2 %></td>
					</tr>
					<tr>
						<td>Suma</td>
						<td><%= suma %></td>
					</tr>
				</tbody>
			</table>
					<a href="index.html" class="btn btn-primary">Nueva operación</a>
		</div>

	</body>
</html>
