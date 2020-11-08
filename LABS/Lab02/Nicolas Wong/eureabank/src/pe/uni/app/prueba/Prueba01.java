package pe.uni.app.prueba;

import pe.uni.app.dto.TablaDto;
import pe.uni.app.service.TablaService;

public class Prueba01 {
	
	public static void main(String[] args){
		//Dato
		//int numTabla = 6;
		double capital = 1200;
		double interes = 4.25;
		double amortizacion = 200.00;
		int tiempo = 6;
		int riesgo = 4;
		//Proceso  
		TablaService service = new TablaService();
		TablaDto[] tabla = service.procesar( capital, tiempo, riesgo);
		//Reporte
		for(TablaDto dto: tabla){
			System.out.println( dto.getCapital()+ " - " + amortizacion+ "  " + (dto.getCapital() * interes)/100 +"  "+ (amortizacion + (dto.getCapital() * interes)/100) + "  " + (dto.getCapital() - dto.getAmortizac()));
		}
	}

}
