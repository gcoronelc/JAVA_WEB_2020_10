package pe.perci.app.controller;

import java.io.IOException;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import pe.perci.app.dto.BancoDto;
import pe.perci.app.service.BancoService;


@WebServlet("/BankController")
public class BancoController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public BancoController() {
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
		BancoService objS=new BancoService();
		BancoDto[] tabla=objS.procesar(capital,tiempo,riesgo);
		
		// Reporte
		request.setAttribute("tabla", tabla);
		request.setAttribute("mes", objS.getMes());		
		request.setAttribute("capital", capital);
		request.setAttribute("tiempo", tiempo);
		request.setAttribute("riesgo", riesgo);
		request.setAttribute("interes", objS.interesP(riesgo));
		request.setAttribute("amor", objS.calcularAmr(capital, tiempo));
		// Forward
		RequestDispatcher rd = request.getRequestDispatcher("simulacion.jsp");
	
		rd.forward(request, response);
		
	}
	
	
	

}
