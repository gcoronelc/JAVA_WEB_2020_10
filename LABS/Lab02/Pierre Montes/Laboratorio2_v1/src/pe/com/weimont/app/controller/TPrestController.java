package pe.com.weimont.app.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import pe.com.weimont.app.dto.TPrestDto;
import pe.com.weimont.app.service.TPrestService;

/**
 * Servlet implementation class TPrestController
 */
@WebServlet("/TPrestController")
public class TPrestController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//entrada
		double capital = Double.parseDouble(request.getParameter("capital"));
		int meses = Integer.parseInt(request.getParameter("meses"));
		int riesgo = Integer.parseInt(request.getParameter("riesgo"));
		
		//proceso
		TPrestService service = new TPrestService();
		TPrestDto[] tabla = service.calcPrest(capital, meses, riesgo);
		
		//salida
		request.setAttribute("tabla", tabla);
		
		//forward
		RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
		rd.forward(request, response);
	}

}
