<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link href="css.css" rel="stylesheet">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Calcular Prestamo</title>
</head>
<body>

	<div class="principal">
		<div class="encabezado"></div>
		<div class="menu"><jsp:include page="menu.jsp"></jsp:include></div>
		<div class="contenido">
			<div class="titulo">Realizar Prestamo</div>
			
			<form action="Prestamo" method="POST">
				<table class="tablaFrm">
					<tr>
						<td><label>Monto a Prestar S/.</label></td>
						<td><input type="text" name="monto" required></td>
					</tr>
					<tr>
						<td><label>Cantidad de Cuotas</label></td>
						<td>
							<select name="cantCuotas">
								<option value="6">6 meses</option>
								<option value="12">12 meses</option>
								<option value="18">18 meses</option>
								<option value="24">24 meses</option>
							</select>
						</td>
					</tr>
					<tr>
						<td><label>Nivel de Riesgo</label></td>
						<td>
							<select name="riesgo">
								<option>1</option>
								<option>2</option>
								<option>3</option>
								<option>4</option>
							</select>
						</td>
					</tr>
					<tr>
						<td></td>
						<td><button type="submit">Calcular</button></td>
					</tr>
				</table>
			</form>
			
		</div>
	</div>


</body>
</html>