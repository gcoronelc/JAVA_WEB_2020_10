package pe.uni.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import pe.uni.service.VentaService;

/**
 *
 * @author Gustavo Coronel
 */
@WebServlet(name = "VentaServlet", urlPatterns = {"/VentaServlet"})
public class VentaServlet extends HttpServlet {

	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.err.println("El servlet si funciona.");
		
		// Parametros
		double precio = Double.parseDouble(request.getParameter("precio"));
		int cant = Integer.parseInt(request.getParameter("cantidad"));
		// Proceso
		VentaService service = new VentaService();
		double total = service.calcTotalVenta(precio, cant);
		double importe = service.calcImporte(total);
		double impuesto = service.calcImpuesto(total, importe);
		// Enviar datos al JSP
		request.setAttribute("importe", importe);
		request.setAttribute("impuesto", impuesto);
		request.setAttribute("total", total);
		RequestDispatcher rd = request.getRequestDispatcher("venta.jsp");
		rd.forward(request, response);
		
	}
	
}
