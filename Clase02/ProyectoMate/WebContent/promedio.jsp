<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<jsp:include page="cabecera.jsp"></jsp:include>

</head>
<body>

<jsp:include page="menu.jsp"></jsp:include>

<div class="container">

		<h1>PROMEDIO</h1>

		<div class="card">
			<div class="card-header">DATOS</div>
			<div class="card-body">
			
				<form action="Promedio" method="post">
					<div class="form-group row">
						<label for="nota1" class="col-sm-2 col-form-label">Nota 1</label>
						<div class="col-sm-10">
							<input type="text" class="form-control"   name="nota1">
						</div>
					</div>
					<div class="form-group row">
						<label for="nota2" class="col-sm-2 col-form-label">Nota 2</label>
						<div class="col-sm-10">
							<input type="text" class="form-control"   name="nota2">
						</div>
					</div>
					<div class="form-group row">
						<label for="nota3" class="col-sm-2 col-form-label">Nota 3</label>
						<div class="col-sm-10">
							<input type="text" class="form-control"   name="nota3">
						</div>
					</div>
					<div class="form-group row">
						<label for="nota4" class="col-sm-2 col-form-label">Nota 4</label>
						<div class="col-sm-10">
							<input type="text" class="form-control"   name="nota4">
						</div>
					</div>
					<div class="form-group row">
						<button type="submit" class="btn btn-primary">Procesar</button>
					</div>
				</form>

			</div>
		</div>
		
		<c:if test="${requestScope.promedio != null }">
			<div class="card mt-2">
				<div class="card-header">RESULTADO</div>
				<div class="card-body">
				
					<form>
						<div class="form-group row">
							<label for="numero" class="col-sm-2 col-form-label">Promedio</label>
							<div class="col-sm-10">
								<input type="text" class="form-control"  name="numero" value="${requestScope.promedio }" disabled="disabled">
							</div>
						</div>
					</form>
	
				</div>
			</div>
		</c:if>
		

	</div>

</body>
</html>