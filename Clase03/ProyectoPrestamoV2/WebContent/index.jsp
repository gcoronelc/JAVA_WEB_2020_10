<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css"
	integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO"
	crossorigin="anonymous">
<html>
<head>
</head>
<body>

	<div class="container">

		<h1>INSTITUCIÓN FINANCIERA EUREKABANK</h1>
		<h1>Simulador de cuotas - Préstamo Persona Natural</h1>

		<div class="card">
			<div class="card-header">INGRESAR DATOS A SIMULAR:</div>
			<div class="card-body">

				<form id="frmDatos">

					<div class="form-group row">
						<label for="capital" class="col-sm-2 col-form-label">Importe
							solicitado (Capital)</label>
						<div class="col-sm-10">
							<input type="text" class="form-control" name="capital" id="capital">
						</div>
					</div>
					<div class="form-group row">
						<label for="tiempo" class="col-sm-2 col-form-label">Tiempo
							en meses</label>
						<div class="col-sm-10">
							<select class="form-control" name="tiempo">
								<option value="6">6</option>
								<option value="12">12</option>
								<option value="18">18</option>
								<option value="24">24</option>
							</select>
						</div>
					</div>
					<div class="form-group row">
						<label for="nriesgo" class="col-sm-2 col-form-label">Nivel
							de Riesgo</label>
						<div class="col-sm-10">
							<select class="form-control" name="nriesgo">
								<option value="1">1 - 2.25%</option>
								<option value="2">2 - 3.14%</option>
								<option value="3">3 - 4.25%</option>
								<option value="4">4 - 6.12%</option>
							</select>
						</div>
					</div>

					<div class="form-group row">
						<button type="button" class="btn btn-primary" id="btnSimuar">Simular</button>
					</div>
				</form>

			</div>
		</div>

		<div class="mt-2" id="divResultado"></div>


	</div>

	<script
		src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
		
	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/jquery-validate/1.19.2/jquery.validate.js"></script>

	<script src="js/index.js"></script>

</body>
</html>