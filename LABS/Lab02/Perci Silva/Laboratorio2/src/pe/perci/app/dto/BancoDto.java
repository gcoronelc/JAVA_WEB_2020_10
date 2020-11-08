package pe.perci.app.dto;

public class BancoDto {
	private double capital;
	private int periodo;
	private String riesgo;
	private double interes;
	private double amr;
	private double saldo;
	private double cuota;
	private int mes;
	


	


	public BancoDto(int mes,double capital, int periodo, String riesgo, double interes, double amr,double cuota, double saldo
			) {
		super();
		this.mes = mes;
		this.capital = capital;
		this.periodo = periodo;
		this.riesgo = riesgo;
		this.interes = interes;
		this.amr = amr;	
		this.cuota = cuota;
		this.saldo = saldo;
		
	}


	public int getMes() {
		return mes;
	}


	public void setMes(int mes) {
		this.mes = mes;
	}


	public double getInteres() {
		return interes;
	}

	public void setInteres(double interes) {
		this.interes = interes;
	}

	public double getAmr() {
		return amr;
	}

	public void setAmr(double amr) {
		this.amr = amr;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public double getCuota() {
		return cuota;
	}

	public void setCuota(double cuota) {
		this.cuota = cuota;
	}

	public BancoDto() {
		super();
	}

	public double getCapital() {
		return capital;
	}

	public void setCapital(double capital) {
		this.capital = capital;
	}

	public int getPeriodo() {
		return periodo;
	}

	public void setPeriodo(int periodo) {
		this.periodo = periodo;
	}

	public String getRiesgo() {
		return riesgo;
	}

	public void setRiesgo(String riesgo) {
		this.riesgo = riesgo;
	}

	
}
