<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h2>DEPOSITO</h2>

<form id="form1">
		<div>
			<div>
				<label>Cuenta:</label> <input type="text" name="cuenta" />
			</div>
			<div>
				<label>Importe:</label> <input type="text" name="importe" />
			</div>
			<div>
				<input type="button"  id="btnProcesar" value="Procesar" />
			</div>
		</div>
	</form>
	
	
	<script src="js/deposito.js"></script>
</body>
</html>