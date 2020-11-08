package pe.uni.simuladorprestamo.service;

import pe.uni.simuladorprestamo.dto.TablaDto;

public class SimuladorService {

	public TablaDto[] procesar( int meses, int riesgo,double capital){
		TablaDto[] tabla = new TablaDto[meses];
		 
		double saldoini=0.00; 
		for(int i=1; i<=meses; i++){
			
			double interes=0.00;
			double amortizacion=capital/meses;
			double saldoinicial= capital-saldoini;
			switch (riesgo){
			case 1: interes=saldoinicial * 0.0225;
					break;
			case 2: interes=saldoinicial * 0.0314;
					break;
			case 3: interes=saldoinicial * 0.0425;
					break;
			case 4: interes=saldoinicial * 0.0612;
					break;
			}
			tabla[i-1] = new TablaDto(i, redondearNumero(saldoinicial,2), redondearNumero(amortizacion,2),redondearNumero(interes,2),
					redondearNumero(amortizacion+interes,2),redondearNumero(saldoinicial - amortizacion,2));
			saldoini= saldoini + amortizacion;
			
		}
		
		return tabla;
	}
	
	public static double redondearNumero(double numero, int digitos) {
        double resultado;
        resultado = numero * Math.pow(10, digitos);
        resultado = Math.round(resultado);
        resultado = resultado/Math.pow(10, digitos);
        return resultado;
    }
	
}
