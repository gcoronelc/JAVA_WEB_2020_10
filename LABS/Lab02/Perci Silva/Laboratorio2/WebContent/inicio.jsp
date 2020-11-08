


<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<!DOCTYPE html>
<html>
<head>
<jsp:include page="cabecera.jsp"></jsp:include>
<style>
* {
	margin: 0px;
	padding: 0px
}

html, body {
	width: 100%;
	height: 100%
} /*3.-codigo de reset*/
#contenedor {
	max-width: 1000px;
	height: auto;
	margin: auto;
	margin-top: 20px; overflow : hidden;
	background: #fff;
	overflow: hidden;
}

#titulo {
	color: green;
}

.consulta {
	color: blue;
	width:70px;
}
</style>
</head>
<body>
	<div id=contenedor>

		<c:if test="${cal!=null}">
				<h5 style="color:green">EUREABANK BANK</h5>
				<br>				
			<table>		
				<tr>
					<th colspan="1">DATOS DE LA CENTRA DE RIESGOS:</th>
					<th></th>
				</tr>
				<tr>
					<td>Apellido Paterno:</td>
					<td>${apeP}</td>
				</tr>
				<tr>
					<td>Apellido Materno:</td>
					<td>${apeM}</td>
				</tr>
				<tr>
					<td>Nombre:</td>
					<td>${nom}</td>
				</tr>

				<tr>
					<td>Documento de Identidad:</td>
					<td>${dni}</td>
				</tr>
				<tr></tr>

				<tr>
					<th colspan="2">CALIFICACIÓN CREDITICIA:</th>
					<th></th>
				</tr>

				<tr>
					<td>Calificación:</td>
					<td>${cal}</td>
				</tr>
			</table>


	

		<form action="BankController" method="post">
			<table style="width: 40%" class="table table-hover  .table-striped">
				<tr>
					<th colspan="1">
					<th></th>

				</tr>
				<tr>
					<td><label for="cap" class="consulta">Capital:</label></td>
					<td><input type="number" id="cap" name="capital" size="5"
						required></td>
				</tr>
				<tr>
					<td><label for="time" class="consulta">Periodo:</label></td>
					<td><select style="width: 170px" name="tiempo" id="time">
							<option value="" autofocus="autofocus"></option>
							<option value="6">6 meses</option>
							<option value="12">12 meses</option>
							<option value="18">18 meses</option>
							<option value="24">24 meses</option>

					</select> <br></td>
				</tr>
				<tr>
					<td><label for="cap" class="consulta">Riesgo:</label></td>
					<td><input style="color: green"type="number" id="cap" name="riesgo" size="3"
						required value="${cal}"></td>
				</tr>

			</table>

			<input class="btn btn-outline-primary" type="submit"
				value="consultar"> 
			
				<br>
				<br>
			<a href="consulta.jsp" class="card-link">regresar</a>


		</form>


	</c:if>


	</div>
</body>
</html>