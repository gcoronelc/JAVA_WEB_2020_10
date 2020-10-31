$(document).ready(function() {

	$("#btnSimuar").click(fnBtnSimular);

	fnFormularioValidar();

});

function fnBtnSimular() {
	
	// Validar
	if ( !$("#frmDatos").valid() ) {
		console.log("No esta pasando la validación");
		return;
	}

	// Datos
	let datos = $("#frmDatos").serialize();
	console.log("Datos: " + datos);

	// Llama JSON
	$.post("TablaController", datos, function(respuesta) {

		$("#divResultado").html(respuesta);

	});

}

function fnFormularioValidar(){
	
	$("#frmDatos").validate({
	    rules: {
	    	capital: {required: true,number:true}
	    },
	    messages: {
	      capital: {
	        required: "Este campo es obligatorio",
	        number:"Solo numeros"
	      }
	    }
	   });
	
}
