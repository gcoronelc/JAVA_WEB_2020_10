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
		String sriesgo="";
		if (nriesgo==1){ sriesgo = "2.25 %";}else if(nriesgo==2){ sriesgo = "3.14 %";}
		else if(nriesgo==3){ sriesgo = "4.25 %";}else if(nriesgo==4){ sriesgo = "6.12 %";}
		
		// Proceso
		TablaService service = new TablaService();
		TablaDto[] tabla = service.procesar(capital, nriesgo, tiempo);
		
		// Reporte
		request.setAttribute("tabla", tabla);
		request.setAttribute("capital", capital);
		request.setAttribute("nriesgo", nriesgo);
		request.setAttribute("sriesgo", sriesgo);
		request.setAttribute("tiempo", tiempo);
		
		// Forward
		RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
		rd.forward(request, response);	
	}
}
