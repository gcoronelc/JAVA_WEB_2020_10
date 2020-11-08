package pe.eureka.prueba;

import java.util.List;
import java.util.Map;

import pe.eureka.service.EurekaService;

public class Prueba03 {

	public static void main(String[] args) {
		try {
			EurekaService service = new EurekaService();
			List<Map<String,?>> lista = service.getMovimientos("00100001");
			for(Map<String,?> r: lista){
				String nro = r.get("MOVINUMERO").toString();
				String descripcion = r.get("TIPONOMBRE").toString();
				String importe = r.get("MOVIIMPORTE").toString();
				System.out.println(nro + " - " + descripcion + " - " + importe);
			}
			System.out.println("Proceso ok.");
		} catch (Exception e) {
			System.err.println(e.getMessage());
		} 		
	}

}
