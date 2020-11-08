package pe.orozco.app.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import pe.orozco.app.dto.PartnersDto;
import pe.orozco.app.dto.MensajeDto;
import pe.orozco.app.service.PartnersService;

/**
 * Servlet implementation class PartnersController
 */
@WebServlet({ "/GetAll4", "/Grabar4", "/Editar4", "/Borrar4" })
public class PartnersController extends HttpServlet {
	private static final long serialVersionUID = 1L;
   

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String path = request.getServletPath();

		switch (path) {
		case "/GetAll4":
			getAll4(request, response);
			break;
		case "/Grabar4":
			grabar4(request, response);
			break;
		case "/Editar4":
			editar4(request, response);
			break;
		case "/Borrar4":
			borrar4(request, response);
			break;

		default:
			break;
		}
	}

	private void borrar4(HttpServletRequest request, HttpServletResponse response)  throws IOException {
		MensajeDto msg = new MensajeDto(1, "Proceso ok.");

		try {
			// Datos
			int id = Integer.parseInt(request.getParameter("id"));

			// Proceso

			PartnersService service = new PartnersService();
			service.borrar(id);

		} catch (Exception e) {

			msg = new MensajeDto(-1, e.getMessage());

		}

		// Respuesta
		Gson gson = new Gson();
		String jsonString = gson.toJson(msg);
		// response.setContentType("text/plain;charset=UTF-8");
		response.setContentType("application/json");
		ServletOutputStream sout = response.getOutputStream();
		sout.print(jsonString);
		sout.flush();

	}
	

	private void editar4(HttpServletRequest request, HttpServletResponse response) throws IOException {
		MensajeDto msg = new MensajeDto(1, "Proceso ok.");

		try {
			// Datos
			int id = Integer.parseInt(request.getParameter("id"));
			String nombre = request.getParameter("nombre");
			String correo = request.getParameter("correo");

			// Proceso
			PartnersDto dto = new PartnersDto(id, nombre, correo);
			PartnersService service = new PartnersService();
			service.editar(dto);

		} catch (Exception e) {

			msg = new MensajeDto(-1, e.getMessage());

		}

		// Respuesta
		Gson gson = new Gson();
		String jsonString = gson.toJson(msg);
		// response.setContentType("text/plain;charset=UTF-8");
		response.setContentType("application/json");
		ServletOutputStream sout = response.getOutputStream();
		sout.print(jsonString);
		sout.flush();

	}

	private void grabar4(HttpServletRequest request, HttpServletResponse response) throws IOException {
		MensajeDto msg = new MensajeDto(1, "Proceso ok.");

		try {
			// Datos
			int id = Integer.parseInt(request.getParameter("id"));
			String nombre = request.getParameter("nombre");
			String correo = request.getParameter("correo");

			// Proceso
			PartnersDto dto = new PartnersDto(id, nombre, correo);
			PartnersService service = new PartnersService();
			service.grabar(dto);

		} catch (Exception e) {

			msg = new MensajeDto(-1, e.getMessage());

		}

		// Respuesta
		Gson gson = new Gson();
		String jsonString = gson.toJson(msg);
		// response.setContentType("text/plain;charset=UTF-8");
		response.setContentType("application/json");
		ServletOutputStream sout = response.getOutputStream();
		sout.print(jsonString);
		sout.flush();

	}

	private void getAll4(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			PartnersService service = new PartnersService();
			List<PartnersDto> lista = service.getAll();

			Gson gson = new Gson();
			String jsonString = gson.toJson(lista);

			// Respuesta
			// response.setContentType("text/plain;charset=UTF-8");
			response.setContentType("application/json");
			ServletOutputStream sout = response.getOutputStream();
			sout.print(jsonString);
			sout.flush();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
