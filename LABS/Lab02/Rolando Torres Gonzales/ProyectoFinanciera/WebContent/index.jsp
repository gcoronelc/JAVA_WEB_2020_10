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
<title>EUREABANK</title>
</head>
<body>

	<div class="container">

		<h1>FINANCIERA "EUREABANK"</h1>

		<div class="card">
			<div class="card-header">DATOS</div>
			<div class="card-body">

				<form action="TablaController" method="post">
					<div class="form-group row">
						<label for="numero" class="col-sm-2 col-form-label">Capital</label>
						<div class="col-sm-10">
							<input type="text" class="form-control" id="capital" name="capital">
						</div>
					</div>

					<div class="form-group row">
						<label for="tiempo" class="col-sm-2 col-form-label">Tiempo</label>
						<div class="col-sm-10">
							<select id="tiempo" name="tiempo" class="form-control">
								<option>6</option>
								<option>12</option>
								<option>18</option>
								<option>24</option>
							</select>
						</div>
					</div>

					<div class="form-group row">
						<label for="riesgo" class="col-sm-2 col-form-label">Riesgo</label>
						<div class="col-sm-10">

							<select id="riesgo" name="riesgo" class="form-control">
								<option>1</option>
								<option>2</option>
								<option>3</option>
								<option>4</option>
							</select>
						</div>
					</div>

					<div class="form-group row">
						<button type="submit" class="btn btn-primary">Procesar</button>
					</div>
				</form>

			</div>
		</div>


		<div class="card mt-2">
			<div class="card-header">RESULTADO</div>
			<div class="card-body">

				<table class="table table-striped">
					<tbody>
						<tr>
							<td>Mes</td>
							<td>Saldo Inicial</td>
							<td>Amortizacion</td>
							<td>Interes</td>
							<td>Cuota Mes</td>
							<td>Saldo Final</td>
						</tr>
						<c:forEach items="${tabla}" var="dto">
							<tr>

								<td>${dto.mes}</td>
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




	</div>

</body>
</html>