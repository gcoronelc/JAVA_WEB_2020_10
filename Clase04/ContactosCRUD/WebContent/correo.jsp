<!DOCTYPE html>
<html>
<head>
<jsp:include page="plantilla/cabecera.jsp"></jsp:include>
</head>
<body>
	<div class="container">

		<h1>ENVIAR UN CORREO</h1>
		
		<div class="form-group row">
			<a href="index.jsp" class="btn btn-primary">Menu Principal</a>
		</div>
		
		<div class="card" id="divFormulario">
		<jsp:include page="plantilla/NuevoCorreo.jsp"></jsp:include>
			
		</div>


	</div>

	<script
		src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>

	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/jquery-validate/1.19.2/jquery.validate.js"></script>

	<script src="js/correo.js"></script>

</body>
</html>