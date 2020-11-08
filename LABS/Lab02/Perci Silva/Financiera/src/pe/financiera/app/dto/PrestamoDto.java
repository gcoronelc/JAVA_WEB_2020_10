package pe.financiera.app.dto;

public class PrestamoDto {
	private double equity;
	private int maturity;
	private String risk;
	private double interes;
	private double amz;
	private double saldo;
	private double cuota;
	private int mes;

	public PrestamoDto(int mes, double equity, int maturity, String risk, double interes, double amz, double cuota, double saldo) {
		super();
		this.equity = equity;
		this.maturity = maturity;
		this.risk = risk;
		this.interes = interes;
		this.amz = amz;
		this.saldo = saldo;
		this.cuota = cuota;
		this.mes = mes;
	}
	
	
	public PrestamoDto() {
		super();
	}


	public double getEquity() {
		return equity;
	}
	public void setEquity(double equity) {
		this.equity = equity;
	}
	public int getMaturity() {
		return maturity;
	}
	public void setMaturity(int maturity) {
		this.maturity = maturity;
	}
	public String getRisk() {
		return risk;
	}
	public void setRisk(String risk) {
		this.risk = risk;
	}
	public double getInteres() {
		return interes;
	}
	public void setInteres(double interes) {
		this.interes = interes;
	}
	public double getAmz() {
		return amz;
	}
	public void setAmz(double amz) {
		this.amz = amz;
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
	public int getMes() {
		return mes;
	}
	public void setMes(int mes) {
		this.mes = mes;
	}



	
}
