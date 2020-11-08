<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<!-- Bootstrap CSS -->
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css"
	integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO"
	crossorigin="anonymous">
<title>TABLA</title>
</head>
<body>

<div class="container">

		<h1>CUADRO DE CUOTAS MENSUALES</h1>

		<div class="card">
			<div class="card-header">DATOS</div>
			<div class="card-body">
			
				<form action="TablaController" method="post">
					<div class="form-group row">
					
					<!-- 	<label for="numero" class="col-sm-2 col-form-label">Número</label>
					//	<div class="col-sm-10">
					//		<input type="text" class="form-control"  	id="numero"  name="numero">
					//	</div> -->
						
						<label for="capital" class="col-sm-2 col-form-label">Capital</label>
						<div class="col-sm-10">
							<input type="text" class="form-control"  	id="capital"  name="capital">
						</div>
						
						<label for="tiempo" class="col-sm-2 col-form-label">Tiempo</label>
						<div class="col-sm-10">
							<input type="text" class="form-control"  	id="tiempo"  name="tiempo">
						</div>
						
						<label for="riesgo" class="col-sm-2 col-form-label">Riesgo</label>
						<div class="col-sm-10">
							<input type="text" class="form-control"  	id="riesgo"  name="riesgo">
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
				 <thead>
				    <tr>
				      <th>MES</th>
				      <th>SALDO INICIAL</th>
				      <th>AMORTIZACION</th>
				      <th>INTERES</th>
				      <th>CUOTA MES</th>
				      <th>SALDO FINAL</th>
				    </tr>
				  </thead>			

				<tbody>
					<c:forEach items="${tabla}" var="dto">
						<tr>
						
							<td>${dto.tiempo}</td>
							<td>${dto.capital}</td>
							<td>${dto.amortizac}</td>
							<td>${dto.interes}</td>
							<td>${dto.cuotaMes}</td>
							<td>${dto.saldoFin}</td>
						</tr>						
					</c:forEach>
		
				</tbody>

			
			
			</table>

			</div>
		</div>


	</div>
</body>
</html>