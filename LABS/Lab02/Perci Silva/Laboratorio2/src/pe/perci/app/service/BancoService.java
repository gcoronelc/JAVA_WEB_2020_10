package pe.perci.app.service;



import java.text.DecimalFormat;

import pe.perci.app.dto.BancoDto;

public class BancoService {
	DecimalFormat df = new DecimalFormat("#.00");  
	BancoDto objDto = new BancoDto();
	double interes, amr, cuota, saldo;

	public BancoDto[] procesar(double capital, int periodo, String riesgo) {
		//amortización constante
		amr = calcularAmr(capital, periodo);	
		
		

		BancoDto[] registro = new BancoDto[periodo];
		for (int i = 1; i <= periodo; i++) {
			interes = calcularInteres(riesgo, capital);
			cuota=calcularCuota(amr, interes);		
			saldo = calcularSaldo(capital, amr);
			registro[i - 1] = new BancoDto(i, capital, periodo, riesgo, interes, amr, cuota, saldo);
			capital = Double.valueOf(df.format(capital-amr));;			
		}
		return registro;
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
		amr = capital / periodo;
		return Double.valueOf(df.format(amr));
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
