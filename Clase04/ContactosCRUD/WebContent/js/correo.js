
$(document).ready(function() {


	$("#btnEnviar").click(fnBtnEnviar);



});

function fnBtnEnviar() {
	// Datos
	let datos = $("#frmDatos").serialize();
	console.log("Datos: " + datos);

	// Llama JSON
	$.post("Correo", datos, function(obj) {

		if (obj.code == 1) {
			alert("Mensaje Enviado con Exito" + datos);
		} else {
			alert("Se ha producido un error. " + obj.mensaje);
		}

	});
}



