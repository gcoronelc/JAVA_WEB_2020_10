<!DOCTYPE html>
<html>
<head>
<jsp:include page="plantilla/cabecera.jsp"></jsp:include>
</head>
<body>
	<div class="container">

		<h1>CONTACTOS: SOCIO DE NEGOCIO</h1>

		<div class="form-group row">
			<button type="button" class="btn btn-primary" id="btnNuevo">Nuevo</button>
			<button type="button" class="btn btn-primary" id="btnEditar">Editar</button>
			<button type="button" class="btn btn-primary" id="btnBorrar">Borrar</button>
			<button type="button" class="btn btn-primary" id="btnRegresar">Lista</button>
			<a href="index.jsp" class="btn btn-primary">Menu Principal</a>
		</div>


		<div class="card" id="divFormulario">
		<jsp:include page="plantilla/NuevoContacto.jsp"></jsp:include>
		</div>

		<div class="card" id="divFormularioEditar">
		<jsp:include page="plantilla/EditarContacto.jsp"></jsp:include>
		</div>

		<div class="card" id="divFormularioBorrar">
		 <jsp:include page="plantilla/BorrarContacto.jsp"></jsp:include>
		
		</div>

		<div class="card" id="divResultado">

			<jsp:include page="plantilla/Resultado.jsp"></jsp:include>
		</div>


	</div>






	<script
		src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>

	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/jquery-validate/1.19.2/jquery.validate.js"></script>

	<script src="js/socio.js"></script>

</body>
</html>