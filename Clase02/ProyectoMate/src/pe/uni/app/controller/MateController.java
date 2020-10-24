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
@WebServlet({ "/McdMcm", "/Factorial", "/Promedio" })
public class MateController extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String path = request.getServletPath();
		switch (path) {
		case "/Factorial":
			factorial(request, response);
			break;
		case "/Promedio":
			promedio(request, response);
			break;
		case "/McdMcm":
			mcdMcm(request, response);
			break;
		}

	}

	private void mcdMcm(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub

	}

	private void promedio(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// Datos
		int nota1 = Integer.parseInt(request.getParameter("nota1"));
		int nota2 = Integer.parseInt(request.getParameter("nota2"));
		int nota3 = Integer.parseInt(request.getParameter("nota3"));
		int nota4 = Integer.parseInt(request.getParameter("nota4"));
		// Proceso
		MateService service = new MateService();
		int pr = service.promedio(nota1, nota2, nota3, nota4);
		// Reporte
		request.setAttribute("promedio", pr);
		// Forward
		RequestDispatcher rd = request.getRequestDispatcher("promedio.jsp");
		rd.forward(request, response);
	}

	protected void factorial(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
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
