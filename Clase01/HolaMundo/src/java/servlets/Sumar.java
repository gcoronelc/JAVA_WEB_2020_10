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
@WebServlet(name = "Sumar", urlPatterns = {"/Sumar"})
public class Sumar extends HttpServlet {

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		// Parametros
		int n1 = Integer.parseInt(request.getParameter("n1"));
		int n2 = Integer.parseInt(request.getParameter("n2"));
		// Proceso
		int suma = n1 + n2;
		// Reporte
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<head>");
		out.println("<title>SUMAR</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1>RESPUESTA A LA SUMA</h1>");
		out.println("<p>Número 1: " + n1 + "</p>");
		out.println("<p>Número 2: " + n1 + "</p>");
		out.println("<p>Suma: " + suma + "</p>");
		out.println("</body>");
		out.println("</html>");
		out.flush();

	}

}
