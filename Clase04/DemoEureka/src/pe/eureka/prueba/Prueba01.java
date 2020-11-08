package pe.eureka.prueba;

import pe.eureka.dto.UsuarioDto;
import pe.eureka.service.LogonService;

public class Prueba01 {

	public static void main(String[] args) {

		try {
			// Datos
			String usuario = "cromero";
			String clave = "chicho";
			// Proceso
			LogonService service = new LogonService();
			UsuarioDto dto = service.validar(usuario, clave);
			// Reporte
			if (dto == null) {
				System.out.println("Datos incorrectos.");
			} else {
				System.out.println("Hola: " + dto.getNombre());
			}
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}

	}
}
