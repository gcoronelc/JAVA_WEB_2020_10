package pe.financiera.app.controller;

import java.io.IOException;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import pe.financiera.app.dto.PrestamoDto;
import pe.financiera.app.service.PrestamoService;


@WebServlet("/PrestamoController")
public class PrestamoController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public PrestamoController() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// Datos
		double capital = Double.parseDouble(request.getParameter("capital"));
		int tiempo = Integer.parseInt(request.getParameter("tiempo"));
		String riesgo = request.getParameter("riesgo");
		
		// Proceso
		PrestamoService objS=new PrestamoService();
		PrestamoDto[] tabla=objS.procesar(capital,tiempo,riesgo);
		
		
		// Reporte
		request.setAttribute("tabla", tabla);
		
		// Forward
		RequestDispatcher rd = request.getRequestDispatcher("resultado.jsp");
		rd.forward(request, response);
	}

}
