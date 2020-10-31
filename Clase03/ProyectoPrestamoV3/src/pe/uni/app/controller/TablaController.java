package pe.uni.app.controller;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import pe.uni.app.dto.PrestamoDto;
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
		
		// Proceso
		TablaService service = new TablaService();
		PrestamoDto dto = service.procesar(capital, nriesgo, tiempo);
		
		// Generar JSON
		Gson gson = new Gson();
		String jsonString = gson.toJson(dto);
				
		// Respuesta
		//response.setContentType("text/plain;charset=UTF-8");
		response.setContentType("application/json");
		ServletOutputStream sout = response.getOutputStream();
		sout.print(jsonString);
		sout.flush();
		
	}
}
