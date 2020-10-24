package pe.uni.app.service;

import pe.uni.app.dto.TablaDto;

public class TablaService {

	public TablaDto[] procesar( int numTabla){
		TablaDto[] tabla = new TablaDto[12];
		for(int i=1; i<=12; i++){
			tabla[i-1] = new TablaDto(i, numTabla, i * numTabla);
		}
		return tabla;
	}
	
}
