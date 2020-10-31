package pe.uni.app.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import pe.uni.app.dto.AmigoDto;
import pe.uni.app.dto.MensajeDto;
import pe.uni.app.service.AmigoService;

/**
 * Servlet implementation class AmigoController
 */
@WebServlet({ "/GetAll", "/GetId", "/Grabar"})
public class AmigoController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String path = request.getServletPath();
		
		switch (path) {
		case "/GetAll":
			getAll(request, response);
			break;
		case "/Grabar":
			grabar(request, response);
			break;

		default:
			break;
		}
		
	}

	
	private void grabar(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		MensajeDto msg = new MensajeDto(1, "Proceso ok.");
		
		try {
			// Datos
			int id = Integer.parseInt( request.getParameter("id") );
			String nombre = request.getParameter("nombre");
			int edad = Integer.parseInt( request.getParameter("edad") );
			
			// Proceso
			AmigoDto dto = new AmigoDto(id, nombre, edad);
			AmigoService service = new AmigoService();
			service.grabar(dto);
			
		} catch (Exception e) {
			
			msg = new MensajeDto(-1, e.getMessage() );
			
		}
		
		// Respuesta
		Gson gson = new Gson();
		String jsonString = gson.toJson(msg);
		//response.setContentType("text/plain;charset=UTF-8");
		response.setContentType("application/json");
		ServletOutputStream sout = response.getOutputStream();
		sout.print(jsonString);
		sout.flush();

		
	}


	public void getAll(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try {
			AmigoService service = new AmigoService();
			List<AmigoDto> lista = service.getAll();
			
			Gson gson = new Gson();
			String jsonString = gson.toJson(lista);

			
			// Respuesta
			//response.setContentType("text/plain;charset=UTF-8");
			response.setContentType("application/json");
			ServletOutputStream sout = response.getOutputStream();
			sout.print(jsonString);
			sout.flush();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
	
}
