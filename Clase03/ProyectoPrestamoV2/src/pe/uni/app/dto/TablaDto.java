package pe.uni.app.dto;

public class TablaDto {

	private int cuota;
	private double saldoInicial;
	private double amortizacion;
	private double interes;
	private double cuotaMes;
	private double saldoFinal;

	public TablaDto() {
	}

	public TablaDto(int cuota, double saldoInicial, double amortizacion, double interes, double cuotaMes, double saldoFinal) {
		super();
		this.cuota = cuota;
		this.saldoInicial = saldoInicial;
		this.amortizacion = amortizacion;
		this.interes = interes;
		this.cuotaMes = cuotaMes;
		this.saldoFinal = saldoFinal;
	}

	public int getCuota() {
		return cuota;
	}

	public void setCuota(int cuota) {
		this.cuota = cuota;
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
