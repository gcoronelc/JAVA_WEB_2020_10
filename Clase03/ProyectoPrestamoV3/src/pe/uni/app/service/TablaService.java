package pe.uni.app.service;

import pe.uni.app.dto.PrestamoDto;
import pe.uni.app.dto.TablaDto;

public class TablaService {

	public PrestamoDto procesar(double capital, int nriesgo, int tiempo) {

		// Variables
		double amortizacionImporte;
		double saldo;
		double riesgo;
		TablaDto[] tabla = new TablaDto[tiempo];

		// Proceso
		amortizacionImporte = calcularAmortizacion(capital, tiempo);
		saldo = capital;
		riesgo = calcularRiesgo(nriesgo);
		for (int i = 1; i <= tiempo; i++) {
			double interes = (saldo * riesgo) / 100;
			double valorCuota = amortizacionImporte +interes;
			double saldoFinal = saldo - amortizacionImporte;
			tabla[i - 1] = new TablaDto(i, saldo, amortizacionImporte, interes,valorCuota, saldoFinal);
			saldo = saldoFinal;
		}
		
		// Reporte
		PrestamoDto dto = new PrestamoDto();
		dto.setAmortizacion(amortizacionImporte);
		dto.setCapital(capital);
		dto.setNriesgo(nriesgo);
		dto.setRiesgo(riesgo);
		dto.setTabla(tabla);
		dto.setTiempo(tiempo);
		
		return dto;
	}

	public double calcularRiesgo(int nriesgo) {
		double riesgo = 0.0;
		if (nriesgo == 1) {
			riesgo = 2.25;
		} else if (nriesgo == 2) {
			riesgo = 3.14;
		} else if (nriesgo == 3) {
			riesgo = 4.25;
		} else if (nriesgo == 4) {
			riesgo = 6.12;
		}
		return riesgo;
	}

	public double calcularAmortizacion(double capital, int tiempo) {
		double amortizacion = capital / tiempo;
		return amortizacion;
	}

}
