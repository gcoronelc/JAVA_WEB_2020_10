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

/**
 * Servlet implementation class TablaController
 */
@WebServlet("/TablaController")
public class TablaController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// Dato
		int numero = Integer.parseInt(request.getParameter("numero"));
		// Proceso
		TablaService service = new TablaService();
		TablaDto[] tabla = service.procesar(numero);
		// Reporte
		request.setAttribute("tabla", tabla);
		// Forward
		RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
		rd.forward(request, response);
	}

}
