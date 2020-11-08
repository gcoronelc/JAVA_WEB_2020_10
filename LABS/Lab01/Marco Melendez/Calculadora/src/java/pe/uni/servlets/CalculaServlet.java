package pe.uni.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import pe.uni.service.CalculaService;

@WebServlet(name = "CalculaServlet", urlPatterns = {"/CalculaServlet"})
public class CalculaServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //Parametros
        double n1 = Double.parseDouble(request.getParameter("n1"));
        double n2 = Double.parseDouble(request.getParameter("n2"));
        //Proceso
        CalculaService service = new CalculaService();
        double suma           = service.calcSuma(n1, n2);
        double resta          = service.calcResta(n1, n2);
        double multiplicacion = service.calcMultiplicacion(n1, n2);
        double division       = service.calcDivision(n1, n2);
        double resto          = service.calcResto(n1, n2);
        //Enviar datos a JSP
        request.setAttribute("suma", suma);
        request.setAttribute("resta", resta);
        request.setAttribute("multiplicacion", multiplicacion);
        request.setAttribute("division", division);
        request.setAttribute("resto", resto);
        request.setAttribute("n1", n1);
        request.setAttribute("n2", n2);
        
        //Forward: envia los datos a la página
        RequestDispatcher rd = request.getRequestDispatcher("calcula.jsp");
        rd.forward(request, response);

    }


}
