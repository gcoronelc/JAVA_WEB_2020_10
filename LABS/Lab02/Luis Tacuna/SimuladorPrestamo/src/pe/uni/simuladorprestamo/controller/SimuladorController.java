package pe.uni.simuladorprestamo.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import pe.uni.simuladorprestamo.dto.TablaDto;
import pe.uni.simuladorprestamo.service.SimuladorService;

/**
 * Servlet implementation class SimuladorController
 */
@WebServlet("/SimuladorController")
public class SimuladorController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		// Dato
		
		int meses = Integer.parseInt(request.getParameter("mes"));
		int riesgo= Integer.parseInt(request.getParameter("riesgo"));
		double capital=Double.parseDouble(request.getParameter("capital"));
		// Proceso
		SimuladorService service = new SimuladorService();
		TablaDto[] tabla = service.procesar(meses, riesgo, capital);
		// Reporte
		request.setAttribute("tabla", tabla);
		request.setAttribute("capital", capital);
		// Forward
		RequestDispatcher rd = request.getRequestDispatcher("cronograma.jsp");
		rd.forward(request, response);
		
	}

}
