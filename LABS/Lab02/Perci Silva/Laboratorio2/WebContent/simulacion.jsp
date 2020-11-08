

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<meta charset="ISO-8859-1">
<jsp:include page="cabecera.jsp"></jsp:include>
</head>
<body>
	<c:if test="${tabla!= null}">
		<div class="container">

			<div class="card-body">
				<div class="card bg-success text-white">
					<div class="card-body">CUADRO DE CUOTAS MENSUALES </div>
				</div>
				<h4 class="card-title">DATOS DEL PRÉSTAMO</h4>
				<p class="card-text">
					Capital: S/ ${capital}<br> Tiempo: S/ ${tiempo} meses<br>
					Riesgo: ${riesgo}<br>
				</p>
				<h4 class="card-title">RESULTADO</h4>
				<p class="card-text">
					Interés: ${interes} <br> Amortización: S/ ${amor}<br>
					</p>
					
				<a href="consulta.jsp" class="card-link">Terminar</a>

			</div>
		</div>





		<div class="card mt-2">
			<div class="card-body">





				<table class="table table-striped">

					<thead class="bg-success">
						<tr>
							<th>MES</th>
							<th>SALDO INICIAL</th>
							<th>AMORT.</th>
							<th>INTERES</th>
							<th>CUOTA MES</th>
							<th>SALDO FINAL</th>
						</tr>

					</thead>
					<tbody>
						<c:forEach items="${tabla}" var="dto">
							<tr>
								<td>${dto.mes}</td>
								<td>S/ ${dto.capital}</td>
								<td>S/ ${dto.amr}</td>
								<td>S/ ${dto.interes}</td>
								<td>S/ ${dto.cuota}</td>
								<td>S/ ${dto.saldo}</td>
							</tr>
						</c:forEach>
					</tbody>

				</table>


			</div>
		</div>

	</c:if>

</body>
</html>