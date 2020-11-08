package pe.uni.app.service;

import pe.uni.app.dto.TablaDto;

public class TablaService {

	
	public TablaDto[] procesar(double capital, int tiempo, int riesgo){
		double factorI		= factorInteres(riesgo);
		double totInteres	= (capital * (factorI/100));
		double totAmortiza	= (capital/tiempo);
		double totCuotaMes	= (totAmortiza + totInteres);
		double SaldoFinal	= (capital - totAmortiza);
		TablaDto[] tabla	= new TablaDto[tiempo];
		double newSaldo		= 0;
		
		for(int i=1; i<= tiempo; i++){
			if (i == 1) {
				tabla[i-1] = new TablaDto(i, capital,  totAmortiza, totInteres, totCuotaMes, SaldoFinal, i, tiempo, i);
				 newSaldo =  (capital - totAmortiza);
			} else if (i != 1) {
				capital = newSaldo;
				SaldoFinal = (newSaldo - totAmortiza);
				totInteres = (capital * (factorI/100));
				totCuotaMes	= (totAmortiza + totInteres);
			tabla[i-1] = new TablaDto(i, capital,  totAmortiza, totInteres, totCuotaMes, SaldoFinal, i, tiempo, i);
			newSaldo =  (capital - totAmortiza);
			}
		}
		return tabla;
	}
	
	public double factorInteres(int riesgo){
		double factor = 0;		
        if (riesgo == 1 ) {
        	 factor = 2.25;
        } else if (riesgo == 2 ) {
        	 factor = 3.14;
        } else if (riesgo == 3) {
        	 factor = 4.25;
        } else if (riesgo == 4) {
        	 factor = 6.12;
        }
        return factor;
		
	}
	

}
