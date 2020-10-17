package pe.uni.servlets;

import java.io.IOException;
import java.io.PrintWriter;
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
		// Parametros
		double precio = Double.parseDouble(request.getParameter("precio"));
		int cant = Integer.parseInt(request.getParameter("cantidad"));
		// Proceso
		VentaService service = new VentaService();
		double total = service.calcTotalVenta(precio, cant);
		double importe = service.calcImporte(total);
		double impuesto = service.calcImpuesto(total, importe);
		// Reporte
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<head>");
		out.println("<title>CALCULAR VENTA</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1>REPORTE DE VENTA</h1>");
		out.println("<p>Importe: " + importe + "</p>");
		out.println("<p>Impuesto: " + impuesto + "</p>");
		out.println("<p>Total: " + total + "</p>");
		out.println("<p><a href='index.html'>Nueva venta</a></p>");
		out.println("</body>");
		out.println("</html>");
		out.flush();

	}
}
