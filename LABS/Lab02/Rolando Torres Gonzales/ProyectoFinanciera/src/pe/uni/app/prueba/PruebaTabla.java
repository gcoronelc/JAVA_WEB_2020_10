package pe.uni.app.prueba;

import pe.uni.app.dto.TablaDto;
import pe.uni.app.service.TablaService;

public class PruebaTabla {
	
	public static void main(String[] args) {
		double saldoInicial=1200.00;
		int mes=6;
		int riesgo=3;
		
		TablaService service1 = new TablaService(); 
		TablaDto[] tabla = service1.ProcesarTabla(saldoInicial, mes, riesgo);
		
		for(TablaDto dto: tabla)
		{
			System.out.println(dto.getMes() +" === "+dto.getSaldoInicial()+" === "+dto.getAmortizacion()+" === "+dto.getInteres()+" === "
			+dto.getCuotaMes()+" === "+dto.getSaldoFinal());
		}
		
	}

}
