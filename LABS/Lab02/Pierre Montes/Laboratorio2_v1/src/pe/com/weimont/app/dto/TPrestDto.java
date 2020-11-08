package pe.com.weimont.app.dto;

public class TPrestDto {
	private double mes;
	private double saldoIn;
	private double amort;
	private double interes;
	private double cuotaMes;
	private double saldoFin;
	
	public TPrestDto(){
	}

	public TPrestDto(double mes, double saldoIn, double amort, double interes, double cuotaMes, double saldoFin) {
		super();
		this.mes = mes;
		this.saldoIn = saldoIn;
		this.amort = amort;
		this.interes = interes;
		this.cuotaMes = cuotaMes;
		this.saldoFin = saldoFin;
	}

	public double getMes() {
		return mes;
	}

	public void setMes(double mes) {
		this.mes = mes;
	}

	public double getSaldoIn() {
		return saldoIn;
	}

	public void setSaldoIn(double saldoIn) {
		this.saldoIn = saldoIn;
	}

	public double getAmort() {
		return amort;
	}

	public void setAmort(double amort) {
		this.amort = amort;
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

	public double getSaldoFin() {
		return saldoFin;
	}

	public void setSaldoFin(double saldoFin) {
		this.saldoFin = saldoFin;
	}
	
	
	
	
}
