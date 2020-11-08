package pe.perci.app.service;


import pe.perci.app.dto.DeudaDto;

public class DeudaService {
	
	DeudaDto objDto = new DeudaDto();

	public DeudaDto procesar(String dni) {
		if(dni.equalsIgnoreCase("7777")) {
			objDto.setApeP("Slim");
			objDto.setApeM("Helú");
			objDto.setNombre("Carlos");
			objDto.setDni(dni);
			objDto.setCal("4");
			
			objDto.getApeP();
			objDto.getApeM();
			objDto.getNombre();
			objDto.getDni();
			objDto.getCal();	
			
		}else {
			objDto.setApeP("Preston");
			objDto.setApeM("Jorgensen");
			objDto.setNombre("Jeff");
			objDto.setDni(dni);
			objDto.setCal("3");
			
			objDto.getApeP();
			objDto.getApeM();
			objDto.getNombre();
			objDto.getDni();
			objDto.getCal();
				
			
		}
		return objDto;		
	
	}
}
