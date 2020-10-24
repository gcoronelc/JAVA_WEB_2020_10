package pe.uni.app.prueba;

import pe.uni.app.dto.TablaDto;
import pe.uni.app.service.TablaService;

public class Prueba01 {
	
	public static void main(String[] args) {
		// Dato
		int numTabla = 7;
		// Proceso
		TablaService service = new TablaService();
		TablaDto[] tabla = service.procesar(numTabla);
		// Reporte
		for (TablaDto dto : tabla) {
			System.out.println(dto.getNum1() + " x " + dto.getNum2() + " = " + dto.getProd());
		}
	}

}
