package pe.uni.simuladorprestamo.dto;

public class TablaDto {

	private int mes;
	private double saldoinicial;
	private double amortizacion;
	private double interes;
	private double cuota;
	private double saldofinal;
	
	public TablaDto(){
		
	}

	public TablaDto(int mes, double saldoinicial, double amortizacion, double interes, double cuota,
			double saldofinal) {
		super();
		this.mes = mes;
		this.saldoinicial = saldoinicial;
		this.amortizacion = amortizacion;
		this.interes = interes;
		this.cuota = cuota;
		this.saldofinal = saldofinal;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public double getSaldoinicial() {
		return saldoinicial;
	}

	public void setSaldoinicial(double saldoinicial) {
		this.saldoinicial = saldoinicial;
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

	public double getSaldofinal() {
		return saldofinal;
	}

	public void setSaldofinal(double saldofinal) {
		this.saldofinal = saldofinal;
	}
	
}
