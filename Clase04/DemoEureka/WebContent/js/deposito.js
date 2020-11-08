$(document).ready(function() {

	$("#btnProcesar").click(fnBtnProcesar);

});

function fnBtnProcesar() {

	let data = $("#form1").serialize();
	$.post("Deposito", data, function(respuesta) {

		if( respuesta.code == 1){
			alert("Proceso ok.");
		} else  {
			alert("Datos incorrectos.");
		}
	});

}


