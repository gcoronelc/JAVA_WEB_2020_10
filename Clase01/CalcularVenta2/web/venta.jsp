<%-- 
    Document   : suma
    Created on : 17/10/2020, 01:12:19 PM
    Author     : Gustavo Coronel
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>VENTA</title>
		<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">

	</head>
	<body>
		<div class="container">
			<h1>VENTA</h1>
			<table class="table  table-striped">
				<thead>
					<tr>
						<th>PROPIEDAD</th>
						<th>VALOR</th>
					</tr>
				</thead>
				<tbody>
					<tr>
						<td>Importe</td>
						<td><%= request.getAttribute("importe") %></td>
					</tr>
					<tr>
						<td>Impuesto</td>
						<td><%= request.getAttribute("impuesto") %></td>
					</tr>
					<tr>
						<td>Total</td>
						<td><%= request.getAttribute("total") %></td>
					</tr>
				</tbody>
			</table>
					<a href="index.html" class="btn btn-primary">Nueva operación</a>
		</div>

	</body>
</html>
