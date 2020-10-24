<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<jsp:include page="cabecera.jsp"></jsp:include>

</head>
<body>

	<jsp:include page="menu.jsp"></jsp:include>

	<div class="container">

		<h1>FACTORIAL</h1>

		<div class="card">
			<div class="card-header">DATOS</div>
			<div class="card-body">
			
				<form action="Factorial" method="post">
					<div class="form-group row">
						<label for="numero" class="col-sm-2 col-form-label">Número</label>
						<div class="col-sm-10">
							<input type="text" class="form-control"  	id="numero"  name="numero">
						</div>
					</div>
					<div class="form-group row">
						<button type="submit" class="btn btn-primary">Procesar</button>
					</div>
				</form>

			</div>
		</div>
		
		
		<% if(request.getAttribute("numero") != null) { %>
		
		<div class="card mt-2">
			<div class="card-header">RESULTADO</div>
			<div class="card-body">
			
				<form>
					<div class="form-group row">
						<label for="numero" class="col-sm-2 col-form-label">Número</label>
						<div class="col-sm-10">
							<input type="text" class="form-control"  	id="numero"  name="numero" value="<%= request.getAttribute("numero") %>" disabled="disabled">
						</div>
					</div>
					<div class="form-group row">
						<label for="factorial" class="col-sm-2 col-form-label">Factorial</label>
						<div class="col-sm-10">
							<input type="text" class="form-control"  	id="factorial"  name="factorial" value="<%= request.getAttribute("factorial") %>" disabled="disabled">
						</div>
					</div>
				</form>

			</div>
		</div>

		<% } %>

	</div>


</body>
</html>