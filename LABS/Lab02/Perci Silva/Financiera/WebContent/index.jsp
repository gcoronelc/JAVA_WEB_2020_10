


<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<!DOCTYPE html>
<html>
<head>
<jsp:include page="cabecera.jsp"></jsp:include>
</head>
<body>
	<form action="PrestamoController" method="post">
		<table style="width: 50%" class="table table-hover  .table-striped">
			<tr>
				<th colspan="2">EUREABANK BANK</th>
				<th></th>
				<th></th>
			</tr>
			<tr>
				<td><label for="cap">Capital:</label></td>
				<td><input type="number" id="cap" name="capital" size="7"
					required value="${dto.capital}"></td>
			</tr>
			<tr>
				<td><label for="time">Periodo:</label></td>
				<td><select style="width: 100px" name="tiempo" id="time">
						<option value="" autofocus="autofocus"></option>
						<option value="6">6 meses</option>
						<option value="12">12 meses</option>
						<option value="18">18 meses</option>
						<option value="24">24 meses</option>

				</select> <br></td>
			</tr>
			<tr>
				<td><label for="risk">Riesgo:</label></td>
				<td><select style="width: 100px" name="riesgo" id="risk">
						<option value="" autofocus="autofocus"></option>
						<option value="1">1</option>
						<option value="2">2</option>
						<option value="3">3</option>
						<option value="4">4</option>

				</select> <br></td>
			</tr>

		</table>

		<input class="btn btn-outline-primary" type="submit" value="consultar">


	</form>


	

</body>
</html>