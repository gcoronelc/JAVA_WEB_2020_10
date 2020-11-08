package pe.eureka.prueba;

import pe.eureka.dto.UsuarioDto;
import pe.eureka.service.EurekaService;
import pe.eureka.service.LogonService;

public class Prueba02 {

	public static void main(String[] args) {

		try {
			// Datos
			String cuenta = "00100001";
			String empleado = "0004";
			double importe = 200;
			// Proceso
			EurekaService service = new EurekaService();
			service.registrarDeposito(cuenta, importe, empleado);
			// Reporte
				System.out.println("Proceso ok.");
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}

	}
}
