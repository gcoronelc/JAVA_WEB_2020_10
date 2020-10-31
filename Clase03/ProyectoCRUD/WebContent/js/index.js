

$(document).ready(function() {

	$("#divFormulario").hide();
	$("#divResultado").show();
	
	$("#btnNuevo").click(fnBtnNuevo);
	$("#btnGrabar").click(fnBtnGrabar);
	
	cargarLista();

});


function fnBtnNuevo(){
	$("#divFormulario").show();
	$("#divResultado").hide();
}

function fnBtnGrabar(){
	
	// Datos
	let datos = $("#frmDatos").serialize();
	console.log("Datos: " + datos);

	// Llama JSON
	$.post("Grabar", datos, function(obj) {
		
		if( obj.code == 1 ){
			cargarLista();
			$("#divFormulario").hide();
			$("#divResultado").show();
		} else  {
			alert("Se ha producido un error. " + obj.mensaje);
		}
		
	});
	
}

function cargarLista(){
	
	// Llama JSON
	$.post("GetAll",  function(lista) {

	
		// Limpiar cuerpo de la tabla
		$('#tablaResultado tbody').empty();
		
		// Agregar filas
		for( let i = 0; i < lista.length; i++ ){
			let fila = "<tr>";
			fila += "<td>" + lista[i].id + "</td>";
			fila += "<td>" + lista[i].nombre + "</td>";
			fila += "<td>" + lista[i].edad + "</td>";
			fila += "<td>Editar  Eliminar</td>";
			fila += "</tr>";
			$('#tablaResultado tbody').append( fila );
		}

		
	});
	
}