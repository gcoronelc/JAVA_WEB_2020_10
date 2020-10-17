package pe.uni.service;

/**
 * @author Eric Gustavo Coronel Castillo
 * @blog www.desarrollasoftware.com
 * @email gcoronelc@gmail.com
 * @youtube www.youtube.com/c/DesarrollaSoftware
 * @facebook www.facebook.com/groups/desarrollasoftware/
 */
public class VentaService {
	
	public double calcTotalVenta(double precio, int cant){
		return (precio * cant);
	}
	
	public double calcImporte(double total){
		return (total / 1.18);
	}

	public double calcImpuesto(double total, double importe){
		return (total - importe);
	}
	
}
