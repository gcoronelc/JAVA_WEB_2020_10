<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css"
	integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO"
	crossorigin="anonymous">
<html>
<head>
</head>
<body>

	<div class="container">
		<h1>INSTITUCIÓN FINANCIERA EUREKABANK</h1>
		<h1>Simulador de cuotas - Préstamo Persona Natural</h1>

		<div class="card">
			<div class="card-header">INGRESAR DATOS A SIMULAR:</div>
			<div class="card-body">

				<form action="TablaController" method="post">
					<div class="form-group row">
						<label for="capital" class="col-sm-2 col-form-label">Importe
							solicitado (Capital)</label>
						<div class="col-sm-10">
							<input type="text" class="form-control" name="capital">
						</div>
					</div>
					<div class="form-group row">
						<label for="tiempo" class="col-sm-2 col-form-label">Tiempo
							en meses</label>
						<div class="col-sm-10">
							<input type="text" class="form-control" name="tiempo">
						</div>
					</div>
					<div class="form-group row">
						<label for="nriesgo" class="col-sm-2 col-form-label">Nivel
							de Riesgo x Interés (1=2.25%, 2=3.14%, 3=4.25%, 4=6.12%)</label>
						<div class="col-sm-10">
							<input type="text" class="form-control" name="nriesgo">
						</div>
					</div>

					<div class="form-group row">
						<button type="submit" class="btn btn-primary">Simular</button>
					</div>
				</form>

			</div>
		</div>


		<% if (request.getAttribute("capital") != null) { %>

		<div class="card mt-2">
			<div class="card-header">CRONOGRAMA SIMULADO</div>
			<div class="card-body">


				<table class="table table-striped">
					<thead class="thead-light">
						<tr>
							<th>Capital</th>
							<th>Meses</th>
							<th>Nivel de Riesgo</th>
							<th>Interés mensual</th>
						</tr>
					</thead>

					<tbody>
						<tr>
							<td><%= request.getAttribute("capital") %></td>
							<td><%= request.getAttribute("tiempo") %></td>
							<td><%= request.getAttribute("nriesgo") %></td>
							<td><%= request.getAttribute("sriesgo") %></td>
						</tr>
					</tbody>

				</table>

				<table class="table table-striped">
					<thead class="thead-light">
						<tr>
							<th>Mes</th>
							<th>Saldo Inicial</th>
							<th>Amortizacion</th>
							<th>Interés</th>
							<th>Cuota Mes</th>
							<th>Saldo Final</th>
						</tr>
					</thead>

					<tbody>
						<c:forEach items="${tabla}" var="dto">
							<tr>
								<td>${dto.cuota}</td>
								<td>${dto.saldoInicial}</td>
								<td>${dto.amortizacion}</td>
								<td>${dto.interes}</td>
								<td>${dto.cuotaMes}</td>
								<td>${dto.saldoFinal}</td>
							</tr>
						</c:forEach>
					</tbody>

				</table>
			</div>
		</div>

		<% } %>

	</div>

</body>
</html>