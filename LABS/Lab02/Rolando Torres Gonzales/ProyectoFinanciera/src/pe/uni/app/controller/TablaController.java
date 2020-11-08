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
		// TODO Auto-generated method stub
		double saldoInicial = Double.parseDouble(request.getParameter("capital"));
		int mes = Integer.parseInt(request.getParameter("tiempo"));
		int riesgo = Integer.parseInt(request.getParameter("riesgo"));
		
		TablaService service= new TablaService();
		TablaDto[] tabla= service.ProcesarTabla(saldoInicial, mes, riesgo);
		
		request.setAttribute("tabla", tabla);
		
		RequestDispatcher rd= request.getRequestDispatcher("index.jsp");
		rd.forward(request, response);
		
	}

}
