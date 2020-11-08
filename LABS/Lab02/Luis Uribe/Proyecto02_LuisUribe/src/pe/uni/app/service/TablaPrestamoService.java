package pe.uni.app.service;

import pe.uni.app.dto.TablaPrestamoDto;

public class TablaPrestamoService {
	
	public TablaPrestamoDto[] procesar(double saldoInicial, int tiempo, int riesgo){
		TablaPrestamoDto[] tabla = new TablaPrestamoDto[tiempo];
		double tasainteres = 0;
		switch(riesgo){
			case 1: tasainteres = 2.25; break;
			case 2: tasainteres = 3.14; break;
			case 3: tasainteres = 4.25; break;
			case 4: tasainteres = 6.12; break;
		}
		
		double amortizacion = saldoInicial / tiempo;
		
		for(int i = 1; i <= tiempo; i++){
			double interes = saldoInicial * tasainteres/100;
			double cuota = amortizacion + interes;
			double saldoFinal = saldoInicial - amortizacion;
			
			tabla[i-1] = new TablaPrestamoDto(i, saldoInicial, amortizacion, interes, cuota, saldoFinal);
					
			saldoInicial = saldoFinal;
		}
		
		return tabla;
	}

}
