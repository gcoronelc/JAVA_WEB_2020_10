<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<div class="card">

	<div class="card-header">CRONOGRAMA SIMULADO</div>

	<div class="card-body">

		<table class="table table-striped">
			<tbody>
				<tr>
					<td>Capital</td>
					<td>${capital}</td>
				</tr>
				<tr>
					<td>Meses</td>
					<td>${tiempo}</td>
				</tr>
				<tr>
					<td>Nivel de Riesgo</td>
					<td>${nriesgo}</td>
				</tr>
				<tr>
					<td>Interés mensual</td>
					<td>${riesgo}</td>
				</tr>
				<tr>
					<td>Amortización</td>
					<td>${amortizacion}</td>
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

