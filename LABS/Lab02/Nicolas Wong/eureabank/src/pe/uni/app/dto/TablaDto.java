package pe.uni.app.dto;

public class TablaDto {

	private double capital;
	private int tiempo;
	private int riesgo;
	private int nroMes;
	private double saldoIni;
	private double amortizac;
	private double interes;
	private double cuotaMes;
	private double saldoFin;
	
	public TablaDto() {
	}

	public TablaDto(int tiempo, double capital, double amortizac, double interes, double cuotaMes,  double saldoFin, int riesgo, int nroMes, double saldoIni
			 ) {
		super();
		this.capital = capital;
		this.tiempo = tiempo;
		this.riesgo = riesgo;
		this.nroMes = nroMes;
		this.saldoIni = saldoIni;
		this.amortizac = amortizac;
		this.interes = interes;
		this.cuotaMes = cuotaMes;
		this.saldoFin = saldoFin;
	}

	public double getCapital() {
		return capital;
	}

	public void setCapital(double capital) {
		this.capital = capital;
	}

	public int getTiempo() {
		return tiempo;
	}

	public void setTiempo(int tiempo) {
		this.tiempo = tiempo;
	}

	public int getRiesgo() {
		return riesgo;
	}

	public void setRiesgo(int riesgo) {
		this.riesgo = riesgo;
	}

	public int getNroMes() {
		return nroMes;
	}

	public void setNroMes(int nroMes) {
		this.nroMes = nroMes;
	}

	public double getSaldoIni() {
		return saldoIni;
	}

	public void setSaldoIni(double saldoIni) {
		this.saldoIni = saldoIni;
	}

	public double getAmortizac() {
		return amortizac;
	}

	public void setAmortizac(double amortizac) {
		this.amortizac = amortizac;
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
