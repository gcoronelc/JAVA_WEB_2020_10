


<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<!DOCTYPE html>
<html>
<head>
<jsp:include page="cabecera.jsp"></jsp:include>

</head>
<body>

	<div class="container">
		<form action="DeudaController" method="post">
			<table style="width: 50%" class="table table-hover  .table-striped">
				<tr>
					<th colspan="2" style="color: green">EUREABANK BANK</th>
					<th></th>
					<th></th>
				</tr>
				<tr>
					<td><label for="doc">Ingrese su DNI:</label></td>
					<td><input type="text" id="doc" name="doc" size="8" required></td>
				</tr>
			</table>

			<input class="btn btn-outline-primary" type="submit"
				value="consultar"> 
				
		</form>
		<br>
		<a href="index.jsp"
				class="card-link" style="color:blue">Salir</a>
		
			
	</div>



</body>

</html>