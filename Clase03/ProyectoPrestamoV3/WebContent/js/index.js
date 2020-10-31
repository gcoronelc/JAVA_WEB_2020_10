$(document).ready(function() {

	$("#divResultado").hide();
	
	$("#btnSimuar").click(fnBtnSimular);
	$("#btnNuevo").click(fnBtnNuevo);

	fnFormularioValidar();

});

function fnBtnNuevo(){
	$("#divFormulario").show();
	$("#divResultado").hide();
}

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
	$.post("TablaController", datos, function(obj) {

		$("#vcapital").html(obj.capital);
		$("#vamortizacion").html(obj.amortizacion);
		$("#vnriesgo").html(obj.nriesgo);
		$("#vriesgo").html(obj.riesgo);
		$("#vtiempo").html(obj.tiempo);
		
		// Limpiar cuerpo de la tabla
		$('#tablaResultado tbody').empty();
		
		// Agregar filas
		for( let i = 0; i < obj.tabla.length; i++ ){
			let fila = "<tr>";
			fila += "<td>" + obj.tabla[i].cuota + "</td>";
			fila += "<td>" + obj.tabla[i].saldoInicial + "</td>";
			fila += "<td>" + obj.tabla[i].amortizacion + "</td>";
			fila += "<td>" + obj.tabla[i].interes + "</td>";
			fila += "<td>" + obj.tabla[i].cuotaMes + "</td>";
			fila += "<td>" + obj.tabla[i].saldoFinal + "</td>";
			fila += "</tr>";
			$('#tablaResultado tbody').append( fila );
		}

		$("#divFormulario").hide();
		$("#divResultado").show();

		
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
