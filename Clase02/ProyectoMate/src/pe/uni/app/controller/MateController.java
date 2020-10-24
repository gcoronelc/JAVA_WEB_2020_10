package pe.uni.app.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import pe.uni.app.service.MateService;

/**
 * Servlet implementation class MateController
 */
@WebServlet({ "/MateController", "/Factorial", "/Promedio" })
public class MateController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       


	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// Datos
		int numero = Integer.parseInt(request.getParameter("numero"));
		// Proceso
		MateService service = new MateService();
		long fact = service.factorial(numero);
		// Reporte
		request.setAttribute("numero", numero);
		request.setAttribute("factorial", fact);
		// Forward
		RequestDispatcher rd = request.getRequestDispatcher("factorial.jsp");
		rd.forward(request, response);
	}

}
