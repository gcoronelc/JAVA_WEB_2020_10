package pe.uni.app.dto;

public class PrestamoDto {

	private double capital;
	private int nriesgo;
	private double riesgo;
	private int tiempo;
	private double amortizacion;
	private TablaDto[] tabla;

	public PrestamoDto() {
	}

	public double getCapital() {
		return capital;
	}

	public void setCapital(double capital) {
		this.capital = capital;
	}

	public int getNriesgo() {
		return nriesgo;
	}

	public void setNriesgo(int nriesgo) {
		this.nriesgo = nriesgo;
	}

	public double getRiesgo() {
		return riesgo;
	}

	public void setRiesgo(double riesgo) {
		this.riesgo = riesgo;
	}

	public int getTiempo() {
		return tiempo;
	}

	public void setTiempo(int tiempo) {
		this.tiempo = tiempo;
	}

	public double getAmortizacion() {
		return amortizacion;
	}

	public void setAmortizacion(double amortizacion) {
		this.amortizacion = amortizacion;
	}

	public TablaDto[] getTabla() {
		return tabla;
	}

	public void setTabla(TablaDto[] tabla) {
		this.tabla = tabla;
	}


}
