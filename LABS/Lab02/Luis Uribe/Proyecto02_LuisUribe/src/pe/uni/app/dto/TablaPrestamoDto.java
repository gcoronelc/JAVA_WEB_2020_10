package pe.uni.app.dto;

public class TablaPrestamoDto {
	
	private int mes;
	private double saldoInicial;
	private double amortizacion;
	private double interes;
	private double cuota;
	private double saldoFinal;
	
	public TablaPrestamoDto(int mes, double saldoInicial, double amortizacion, double interes, double cuota,
			double saldoFinal) {
		super();
		this.mes = mes;
		this.saldoInicial = saldoInicial;
		this.amortizacion = amortizacion;
		this.interes = interes;
		this.cuota = cuota;
		this.saldoFinal = saldoFinal;
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
	public double getCuota() {
		return cuota;
	}
	public void setCuota(double cuota) {
		this.cuota = cuota;
	}
	public double getSaldoFinal() {
		return saldoFinal;
	}
	public void setSaldoFinal(double saldoFinal) {
		this.saldoFinal = saldoFinal;
	}
	
	
	

}
