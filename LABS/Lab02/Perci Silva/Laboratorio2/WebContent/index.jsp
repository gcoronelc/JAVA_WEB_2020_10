


<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css" href="estilos.css">
<jsp:include page="cabecera.jsp"></jsp:include>
</head>
<body>

		<div class="container">

			<header>
				<nav style="text:white;"class=" navbar navbar-expand-lg navbar-light ">
					<a class="navbar-brand" href="#">FINACIERA EUREABANK</a>
					<button class="navbar-toggler " type="button" data-toggle="collapse"
						data-target="#navbarSupportedContent"
						aria-controls="navbarSupportedContent" aria-expanded="false"
						aria-label="Toggle navigation">
						<span class="navbar-toggler-icon"></span>
					</button>

					<div class="collapse navbar-collapse" id="navbarSupportedContent">
						<ul class="navbar-nav mr-auto">
							<li class="nav-item active"><a class="nav-link nav-link active" href="#">INICIO
									<span class="sr-only">(current)</span>
							</a></li>
							<li class="nav-item"><a class="nav-link" href="#">QUIENES
									SOMOS</a></li>
							<li class="nav-item dropdown"><a
								class="nav-link dropdown-toggle" href="#" id="navbarDropdown"
								role="button" data-toggle="dropdown" aria-haspopup="true"
								aria-expanded="false"> PRODUCTOS </a>
								<div class="dropdown-menu" aria-labelledby="navbarDropdown">
									<a class="dropdown-item" href="#">PRESTAMO INMOBILIARIO</a> <a
										class="dropdown-item" href="#">PRESTAMO CARRO</a> <a
										class="dropdown-item" href="#">PRESTAMO MOTO</a> <a
										class="dropdown-item" href="consulta.jsp">PRESTAMO EFECTIVO</a>
									<div class="dropdown-divider"></div>
								</div></li>
						</ul>
						<form class="form-inline my-2 my-lg-0">
							<input class="form-control mr-sm-2" type="search"
								placeholder="Search" aria-label="Search">
							<button class="btn btn-outline-success my-2 my-sm-0"
								type="submit">Search</button>
						</form>
					</div>
				</nav>

			</header>

			<div id="banner">
				<img src="images/car.jpg">
			</div>

		</div>

	
</body>
</html>
