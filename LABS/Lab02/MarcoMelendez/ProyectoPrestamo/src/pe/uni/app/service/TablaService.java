package pe.uni.app.service;

import pe.uni.app.dto.TablaDto;

public class TablaService {
	
	public TablaDto[] procesar(double capital, int nriesgo, int tiempo){
		
		double amortizacionImporte  = capital / tiempo;
		double saldo = capital;
		double riesgo=0;

		TablaDto[] tabla = new TablaDto[tiempo];
		
		if      (nriesgo==1){ riesgo = 2.25;
		}else if(nriesgo==2){ riesgo = 3.14;
		}else if(nriesgo==3){ riesgo = 4.25;
		}else if(nriesgo==4){ riesgo = 6.12;
		}
		
		for(int i=1; i<=tiempo; i++){
			tabla[i-1] = new TablaDto(i, saldo, amortizacionImporte, (saldo * riesgo)/100, amortizacionImporte + (saldo * riesgo)/100, saldo - amortizacionImporte);
			saldo = saldo - amortizacionImporte;
		}
		return tabla;
	}

}
