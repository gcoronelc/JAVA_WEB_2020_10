<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<!-- Bootstrap CSS -->
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css"
	integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO"
	crossorigin="anonymous">
<title>CRONOGRAMA SIMULACION</title>
</head>
<body>
<div class="container">
		<div class="card mt-2">
			<div class="card-header">CRONOGRAMA</div>
			<div class="card-body">
				<form>
					<div class="form-group row">
						<label for="capital" class="col-md-3  col-form-label bg-success text-white">Importe
						Prestado: S/ ${capital} </label>
						
					</div>
				</form>
				<table class="table table-striped">
					<thead class="bg-success text-white">
						<tr>
							<th>Mes</th>
							<th>Saldo Inicial</th>
							<th>Amortización</th>
							<th>Interes</th>
							<th>Cuota a Pagar</th>
							<th>Saldo Final</th>
						</tr>
					</thead>
					<tbody>
						<c:forEach items="${tabla}" var="dto">
							<tr>
								<td>${dto.mes}</td>
								<td>${dto.saldoinicial}</td>
								<td>${dto.amortizacion}</td>
								<td>${dto.interes}</td>
								<td>${dto.cuota}</td>
								<td>${dto.saldofinal}</td>
							</tr>
						</c:forEach>
					</tbody>

				</table>

			<a href="index.html" class="btn btn-outline-success">Nueva Simulación</a>
			</div>
		</div>

	</div>
</body>
</html>