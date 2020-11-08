package pe.uni.app.service;

import pe.uni.app.dto.TablaDto;

public class TablaService {

	public TablaDto[] ProcesarTabla(double saldoInicial, int mes, int riesgo) {
		TablaDto[] tabla = new TablaDto[mes];
		double InteresMensual = NivelRiesgo(riesgo);
		
		double INTERES = (saldoInicial * (InteresMensual / 100));
		double AMORTIZACION = (saldoInicial / mes);
		double CUOTAMES = (AMORTIZACION + INTERES);
		double SALDOFINAL = (saldoInicial - AMORTIZACION);		
		double SaldoActual = 0;

		for (int i = 1; i <= mes; i++) {
			if (i == 1) {
				tabla[i - 1] = new TablaDto(i, saldoInicial, AMORTIZACION, INTERES,CUOTAMES , SALDOFINAL, i + i);
				SaldoActual = (saldoInicial - AMORTIZACION);
			} else if (i != 1) {
				saldoInicial = SaldoActual;
				SALDOFINAL = (SaldoActual - AMORTIZACION);
				INTERES = (saldoInicial * (InteresMensual / 100));
				CUOTAMES = (AMORTIZACION + INTERES);
				tabla[i - 1] = new TablaDto(i, saldoInicial, AMORTIZACION, INTERES, CUOTAMES, SALDOFINAL, i + i);
				SaldoActual = (saldoInicial - AMORTIZACION);
			}
		}
		return tabla;
	}

	private double NivelRiesgo(int riesgo) {		
		double iMensual = 0;
		if (riesgo == 1) {
			iMensual = 2.25;
		} else if (riesgo == 2) {
			iMensual = 3.14;
		} else if (riesgo == 3) {
			iMensual = 4.25;
		} else if (riesgo == 4) {
			iMensual = 6.12;
		}
		return iMensual;
	}

}
