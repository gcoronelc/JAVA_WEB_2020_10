package pe.uni.app.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import pe.uni.app.dto.TablaPrestamoDto;
import pe.uni.app.service.TablaPrestamoService;

/**
 * Servlet implementation class TablaPrestamoServlet
 */
@WebServlet({"/TablaPrestamoServlet", "/Prestamo"})
public class TablaPrestamoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	TablaPrestamoService service = new TablaPrestamoService();
       
    
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		if(request.getServletPath().equalsIgnoreCase("/Prestamo")){
			prestamo(request, response);
		}
		
	}


	private void prestamo(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		double saldoInicial = Double.parseDouble(request.getParameter("monto"));
		int tiempo = Integer.parseInt(request.getParameter("cantCuotas"));
		int riesgo = Integer.parseInt(request.getParameter("riesgo"));
		
		TablaPrestamoDto[] tabla = service.procesar(saldoInicial, tiempo, riesgo);
		
		request.setAttribute("tabla", tabla);
		
		request.getRequestDispatcher("resultado.jsp").forward(request, response);
		
	}

	
}
