<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<h2>REPORTE</h2>

	<form id="form1">
		<div>
			<div>
				<label>Cuenta:</label> <input type="text" name="cuenta" />
				<input type="button" id="btnProcesar" value="Procesar" />
			</div>
		</div>
	</form>
	
	<div id="divReporte">
	
	</div>


	<script>
	
		$(document).ready(function() {
			$("#btnProcesar").click(fnBtnProcesar);

		});
		
		function fnBtnProcesar() {
			var data = $("#form1").serialize();
		    var urlRepo = "RepoMovimientos?" + data;
		    var html = "<object width='100%' height='600' data='" + urlRepo + "'></object>";
		    $("#divReporte").html(html);
		}
		
	</script>



</body>
</html>