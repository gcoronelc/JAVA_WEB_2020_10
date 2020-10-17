package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Gustavo Coronel
 */
@WebServlet(name = "HolaMundo3", urlPatterns = {"/Saludo3","/Edu3","/Gordito3","/Neymar3"})
public class HolaMundo3 extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.println("Hola Mundo3 - Post<br/>");
		out.println("Estamos en camino del éxito3!!!! - Post");
		out.flush();
	
	}
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String nombre = request.getParameter("nombre");
		
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.println("Hola Mundo3 - Get <br/>");
		out.println("Estamos en camino del éxito3!!!! - Get - " + nombre);
		out.flush();
	
	}

	
}
