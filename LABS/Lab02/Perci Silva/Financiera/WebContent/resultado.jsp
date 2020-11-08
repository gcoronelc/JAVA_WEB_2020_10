

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
								<td>S/ ${dto.equity}</td>
								<td>S/ ${dto.amz}</td>
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