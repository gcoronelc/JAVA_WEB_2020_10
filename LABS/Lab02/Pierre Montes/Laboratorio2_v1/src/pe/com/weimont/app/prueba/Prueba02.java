package pe.com.weimont.app.prueba;

import pe.com.weimont.app.dto.TPrestDto;
import pe.com.weimont.app.service.TPrestService;

public class Prueba02 {
	public static void main(String[] args) {
		
		//var
		//double interes=0;
		
		//entrada
		double capital = 3600.0;
		int meses = 6;
		int riesgo = 4;
		
		
		//proceso
		TPrestService service = new TPrestService();
		TPrestDto[] tabla = service.calcPrest(capital, meses, riesgo);
		
		//salida
		for(TPrestDto dto : tabla){
			System.out.print(dto.getMes() + " - " + dto.getSaldoIn() + " - " + 
					dto.getAmort() + " - " + dto.getInteres() + " - " + dto.getCuotaMes() + " - " +
					dto.getSaldoFin() + "\n");
		}
	}
}
