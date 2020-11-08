package pe.uni.app.prueba;

import pe.uni.app.dto.TablaDto;
import pe.uni.app.service.TablaService;

public class Prueba01 {
	
	public static void main(String[] args) {
		// Dato
		double capital = 3600;
		int nriesgo = 4;
		int tiempo = 6;
		
		// Proceso
		TablaService service = new TablaService();
		TablaDto[] tabla = service.procesar(capital, nriesgo, tiempo);
		// Reporte
		for (TablaDto dto : tabla) {
			System.out.println(dto.getCuota() + " - " + dto.getSaldoInicial() + " - " + dto.getAmortizacion() + " - " + dto.getInteres() + " - " + dto.getCuotaMes() + " - " + dto.getSaldoFinal());
		}
		
	}

	
}
