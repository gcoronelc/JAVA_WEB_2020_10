
$( document ).ready(function() {
  
	$("#btnDeposito").click(fnBtnDeposito);
	
	$("#btnReporte").click(fnBtnReporte);
	
});


function fnBtnDeposito() {
	
	$("#divWork").load("deposito.jsp");
	
}



function fnBtnReporte() {
	
	$("#divWork").load("reporte.jsp");
	
}

