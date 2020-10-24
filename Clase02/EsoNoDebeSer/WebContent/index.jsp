<%

// Variables
int n1 = 0, n2 = 0, suma = 0;
// Datos
if( request.getParameter("btnProcesar") != null){
	n1 = Integer.parseInt(request.getParameter("n1"));
	n2 = Integer.parseInt(request.getParameter("n2"));
	suma = n1 + n2;
}

%>



<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<h1>SUMA</h1>

	<form>

		<div>
			<label>Número 1:</label> <input type="text" name="n1"  value="<%=n1%>"/>
		</div>

		<div>
			<label>Número 1:</label> <input type="text" name="n2"  value="<%=n2%>"/>
		</div>
		
		<div>
			<label>Suma:</label> <input type="text" name="suma"  value="<%=suma%>" disabled="disabled"/>
		</div>

		<div>
			<input type="submit" name="btnProcesar"  value="Procesar" />
		</div>

	</form>

</body>
</html>