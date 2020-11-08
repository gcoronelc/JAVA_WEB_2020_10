package pe.orozco.app.prueba;

import pe.orozco.app.service.EnviarCorreo;

public class Prueba01 {

	
	public static void main(String[] args) {
		
		
		EnviarCorreo enviarCorreo = new EnviarCorreo();
		int estado = enviarCorreo.enviar("nwongs@gmail.com", "Saludo", "Buenos días");
		System.out.println("estado: " + estado);
		
	}
}
