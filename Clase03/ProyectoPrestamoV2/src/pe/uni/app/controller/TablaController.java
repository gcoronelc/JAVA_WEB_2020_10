package pe.uni.app.controller;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import pe.uni.app.dto.TablaDto;
import pe.uni.app.service.TablaService;

@WebServlet({ "/TablaController" })
public class TablaController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		// Datos
		double capital = Double.parseDouble(request.getParameter("capital"));
		int nriesgo = Integer.parseInt(request.getParameter("nriesgo"));
		int tiempo = Integer.parseInt(request.getParameter("tiempo"));
		
		// Proceso
		TablaService service = new TablaService();
		double amortizacion = service.calcularAmortizacion(capital, tiempo);
		double riesgo = service.calcularRiesgo(nriesgo);
		TablaDto[] tabla = service.procesar(capital, nriesgo, tiempo);
		
		// Reporte
		request.setAttribute("tabla", tabla);
		request.setAttribute("capital", capital);
		request.setAttribute("nriesgo", nriesgo);
		request.setAttribute("riesgo", riesgo);
		request.setAttribute("tiempo", tiempo);
		request.setAttribute("amortizacion", amortizacion);
		
		// Forward
		RequestDispatcher rd = request.getRequestDispatcher("resultado.jsp");
		rd.forward(request, response);	
	}
}
