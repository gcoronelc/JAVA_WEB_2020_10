package pe.uni.app.prueba;

import pe.uni.app.service.MateService;

public class Prueba01 {

	public static void main(String[] args) {
		// Datos
		int n = 5;
		// Proceso
		MateService service = new MateService();
		long fact = service.factorial(n);
		// Reporte
		System.out.println("Factorial: " + fact);
	}
	
}
