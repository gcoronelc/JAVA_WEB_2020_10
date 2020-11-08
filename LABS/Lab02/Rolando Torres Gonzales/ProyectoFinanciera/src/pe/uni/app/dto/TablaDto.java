package pe.uni.app.dto;

public class TablaDto {
	private int riesgo;
	private int mes;
	private double saldoInicial;
	private double amortizacion;
	private double interes;
	private double cuotaMes;
	private double saldoFinal;
	
	public TablaDto() {
	
	}

	public TablaDto(int mes, double saldoInicial, double amortizacion, double interes, double cuotaMes,	double saldoFinal, int riesgo) {
		super();
		this.riesgo = riesgo;
		this.mes = mes;
		this.saldoInicial = saldoInicial;
		this.amortizacion = amortizacion;
		this.interes = interes;
		this.cuotaMes = cuotaMes;
		this.saldoFinal = saldoFinal;
	}

	public int getRiesgo() {
		return riesgo;
	}

	public void setRiesgo(int riesgo) {
		this.riesgo = riesgo;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public double getSaldoInicial() {
		return saldoInicial;
	}

	public void setSaldoInicial(double saldoInicial) {
		this.saldoInicial = saldoInicial;
	}

	public double getAmortizacion() {
		return amortizacion;
	}

	public void setAmortizacion(double amortizacion) {
		this.amortizacion = amortizacion;
	}

	public double getInteres() {
		return interes;
	}

	public void setInteres(double interes) {
		this.interes = interes;
	}

	public double getCuotaMes() {
		return cuotaMes;
	}

	public void setCuotaMes(double cuotaMes) {
		this.cuotaMes = cuotaMes;
	}

	public double getSaldoFinal() {
		return saldoFinal;
	}

	public void setSaldoFinal(double saldoFinal) {
		this.saldoFinal = saldoFinal;
	}
	
	
	
	
	
	

}
