package pe.com.weimont.app.service;

import pe.com.weimont.app.dto.TPrestDto;

public class TPrestService {
	public TPrestDto[] calcPrest(double capital, int meses, int riesgo){
		
		//var
		double interes=1;
		
		if(riesgo == 1){
			interes = 2.25/100;
		}else if(riesgo == 2){
			interes = 3.14/100;
		}else if(riesgo == 3){
			interes = 4.25/100;
		}else if(riesgo == 4){
			interes = 6.12/100;
		}else {
			
		}
		
		
		TPrestDto[] tabla = new TPrestDto[meses];
		
				double FormMes = 1; 
				double FormSaldoIn = capital; 
				double FormAmort =  capital/meses;
				double FormInteres =  interes*FormSaldoIn;
				double FormCuotaMes =  FormAmort + FormInteres;
				double FormSaldoFin = FormSaldoIn - FormAmort;
				
		
		tabla[0] = new TPrestDto(FormMes, FormSaldoIn, FormAmort, FormInteres, FormCuotaMes, FormSaldoFin);
		
		int i = 1;
		
		while(i < meses){
			
			FormMes = FormMes+1; 
			FormSaldoIn = FormSaldoFin; 
			//FormAmort =  FormAmort;
			FormInteres =  interes*FormSaldoIn;
			FormCuotaMes =  FormAmort + FormInteres;
			FormSaldoFin = FormSaldoIn - FormAmort;
			
			tabla[i] = new TPrestDto(FormMes, FormSaldoIn, FormAmort, FormInteres, FormCuotaMes, FormSaldoFin);
			
			i = i + 1;
		}
		
		//for(int i=1; i<meses; i++){
		//	
		//  FormMes = i+1; 
		//	FormSaldoIn = FormSaldoIn - FormSaldoFin; 
			//FormAmort =  FormAmort;
		//	FormInteres =  interes*FormSaldoIn;
		//	FormCuotaMes =  FormAmort + FormInteres;
		//	FormSaldoFin = FormSaldoIn - FormAmort;
			
		//	tabla[i] = new TPrestDto(FormMes, FormSaldoIn, FormAmort, FormInteres, FormCuotaMes, FormSaldoFin);
		//}
		
		return tabla;
	}
}
