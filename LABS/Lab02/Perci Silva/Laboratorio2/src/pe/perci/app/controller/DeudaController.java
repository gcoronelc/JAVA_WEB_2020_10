package pe.perci.app.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import pe.perci.app.dto.DeudaDto;
import pe.perci.app.service.DeudaService;


/**
 * Servlet implementation class DeudaController
 */
@WebServlet("/DeudaController")
public class DeudaController extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public DeudaController() {
        super();
        
    }

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String dni = request.getParameter("doc");
		// Proceso
		
				DeudaDto objDto=new DeudaDto();
				DeudaService objS=new DeudaService();
						
				// Reporte				     
				objDto=objS.procesar(dni);				
				
				request.setAttribute("apeP", objDto.getApeP());
				request.setAttribute("apeM", objDto.getApeM());
				request.setAttribute("nom", objDto.getNombre());
				request.setAttribute("dni", objDto.getDni());
				request.setAttribute("cal", objDto.getCal());
			
				RequestDispatcher rd = request.getRequestDispatcher("inicio.jsp");
			
				rd.forward(request, response);
	}

    
}