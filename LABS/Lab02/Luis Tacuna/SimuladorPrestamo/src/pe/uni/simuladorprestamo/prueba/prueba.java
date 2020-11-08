package pe.uni.simuladorprestamo.prueba;

import pe.uni.simuladorprestamo.dto.TablaDto;
import pe.uni.simuladorprestamo.service.SimuladorService;

public class prueba {

	public static void main(String[] args) {
		// Dato
		int mes = 12;
		int riesgo= 2;
		double capital=2500;
		// Proceso
		SimuladorService service = new SimuladorService();
		TablaDto[] tabla = service.procesar(mes, riesgo, capital);
		// Reporte
		for (TablaDto dto : tabla) {
			System.out.println(dto.getMes() + " | " + dto.getSaldoinicial() + " | " + dto.getAmortizacion() + " | " + dto.getInteres() + " | " +
						dto.getCuota() + " | " + dto.getSaldofinal());
		}
	}
	
}
