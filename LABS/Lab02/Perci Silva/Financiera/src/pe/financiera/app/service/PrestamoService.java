package pe.financiera.app.service;



import java.text.DecimalFormat;

import pe.financiera.app.dto.PrestamoDto;

public class PrestamoService {
	DecimalFormat df = new DecimalFormat("#.00");  
	double interes, amz, cuota, saldo;
   PrestamoDto objDto=new PrestamoDto();
	public PrestamoDto[] procesar(double capital, int periodo, String riesgo) {
		//amortización constante
		amz = calcularAmr(capital, periodo);	
		
		

		PrestamoDto[] row = new PrestamoDto[periodo];
		for (int i = 1; i <= periodo; i++) {
			interes = calcularInteres(riesgo, capital);
			cuota=calcularCuota(amz, interes);		
			saldo = calcularSaldo(capital, amz);
			row[i - 1] = new PrestamoDto(i, capital, periodo, riesgo, interes, amz, cuota, saldo);
			capital = Double.valueOf(df.format(capital-amz));;			
		}
		return row;
	}

	  public String interesP(String riesgo) {
		  String i=null;
		  switch (riesgo) {
			case "1":
				i = "2.25%";
				break;
			case "2":
				i = "3.14%";
				break;
			case "3":
				i = "4.25%";
				break;
			case "4":
				i = "6.12%";
				break;
			}
			return i;
		  
	  }  
	
	public double calcularInteres(String riesgo, double capital) {
		switch (riesgo) {
		case "1":
			interes = capital *0.0225;
			break;
		case "2":
			interes = capital *0.0314;
			break;
		case "3":
			interes = capital * 0.0425;
			break;
		case "4":
			interes = capital * 0.0612;
			break;
		}
		return Double.valueOf(df.format(interes));
	}

	public double calcularAmr(double capital, int periodo) {
		amz = capital / periodo;
		return Double.valueOf(df.format(amz));
	}

	public double calcularCuota(double amr, double interes) {
		cuota = amr + interes;
		return Double.valueOf(df.format(cuota));
	}

	public double calcularSaldo(double capital, double amr) {
		saldo = capital - amr;
		return Double.valueOf(df.format(saldo));
	}
	
	public int getMes() {
		return objDto.getMes();
	}

}
