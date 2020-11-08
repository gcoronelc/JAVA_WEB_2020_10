
$(document).ready(function() {

	$("#divFormulario").hide();
	$("#divFormularioEditar").hide();
	$("#divFormularioBorrar").hide();
	$("#divResultado").show();

	$("#btnNuevo").click(fnBtnNuevo);
	$("#btnEditar").click(fnBtnEditar);
	$("#btnBorrar").click(fnBtnBorrar);
	$("#btnGrabar").click(fnBtnGrabar);

	$("#btnGrabarEditar").click(fnBtnGrabarEditar);
	$("#btnGrabarBorrar").click(fnBtnGrabarBorrar);
	$("#btnRegresar").click(fnBtnRegresar);

	cargarLista();

});


function fnBtnNuevo() {
	$("#divFormulario").show();
	$("#divResultado").hide();
	$("#divFormularioEditar").hide();
	$("#divFormularioBorrar").hide();
}

function fnBtnGrabar() {

	// Datos
	let datos = $("#frmDatos").serialize();
	console.log("Datos: " + datos);

	// Llama JSON
	$.post("Grabar2", datos, function(obj) {

		if (obj.code == 1) {
			cargarLista();
			$("#divFormulario").hide();
			$("#divResultado").show();
		} else {
			alert("Se ha producido un error. " + obj.mensaje);
		}

	});

}

function fnBtnEditar() {
	$("#divFormularioEditar").show();
	$("#divResultado").hide();
	$("#divFormulario").hide();
	$("#divFormularioBorrar").hide();
}

function fnBtnBorrar() {
	$("#divFormularioBorrar").show();
	$("#divResultado").hide();
	$("#divFormulario").hide();
	$("#divFormularioEditar").hide();
}

function fnBtnRegresar() {
	$("#divResultado").show();
	$("#divFormularioEditar").hide();
	$("#divFormulario").hide();
	$("#divFormularioBorrar").hide();
}

function fnBtnGrabarEditar() {

	// Datos
	let datos = $("#frmDatosEditar").serialize();
	console.log("Datos: " + datos);

	// Llama JSON
	$.post("Editar2", datos, function(obj) {

		if (obj.code == 1) {
			cargarLista();
			$("#divFormularioEditar").hide();
			$("#divResultado").show();
		} else {
			alert("Se ha producido un error. " + obj.mensaje);
		}

	});

}

function fnBtnGrabarBorrar() {

	// Datos
	let datos = $("#frmDatosBorrar").serialize();
	console.log("Datos: " + datos);

	// Llama JSON
	$.post("Borrar2", datos, function(obj) {

		if (obj.code == 1) {
			cargarLista();			 			
			$("#divFormularioBorrar").hide();
			$("#divResultado").show();
		} else {
			alert("Se ha producido un error. " + obj.mensaje);
		}

	});

}

function cargarLista() {

	// Llama JSON
	$.post("GetAll2", function(lista) {

		// Limpiar cuerpo de la tabla
		$('#tablaResultado tbody').empty();

		// Agregar filas
		for (let i = 0; i < lista.length; i++) {
			let fila = "<tr>";
			fila += "<td>" + lista[i].id + "</td>";
			fila += "<td>" + lista[i].nombre + "</td>";
			fila += "<td>" + lista[i].correo + "</td>";
			fila += "</tr>";
			$('#tablaResultado tbody').append(fila);
		}

	});

}
