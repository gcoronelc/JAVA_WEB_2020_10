<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link href="css.css" rel="stylesheet">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Prestamo</title>
</head>
<body>

	<div class="principal">
		<div class="encabezado"></div>
		<div class="menu"><jsp:include page="menu.jsp"></jsp:include></div>
		<div class="contenido">
			<div class="titulo">Realizar Prestamo</div>
			
			<table class="tablaDatos">
				<tr>
					<th>Mes</th>
					<th>Saldo Incial</th>
					<th>Amortización</th>
					<th>Interés</th>
					<th>Cuota</th>
					<th>Saldo Final</th>
				</tr>
				<fmt:setLocale value = "es_PE"/>
				
				<c:forEach items="${tabla}" var="tabla">
					<tr>
						<td>${tabla.mes}</td>
						<td><fmt:formatNumber type="currency" minFractionDigits="2" value="${tabla.saldoInicial}"/></td>
						<td><fmt:formatNumber type="currency" minFractionDigits="2" value="${tabla.amortizacion}"/></td>
						<td><fmt:formatNumber type="currency" minFractionDigits="2" value="${tabla.interes}"/></td>
						<td><fmt:formatNumber type="currency" minFractionDigits="2" value="${tabla.cuota}"/></td>
						<td><fmt:formatNumber type="currency" minFractionDigits="2" value="${tabla.saldoFinal}"/></td>
					</tr>
					
				</c:forEach>
			</table>
			
		</div>
	</div>

</body>
</html>