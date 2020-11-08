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

import pe.orozco.app.dto.MensajeDto;
import pe.orozco.app.dto.ClientesDto;
import pe.orozco.app.service.ClientesService;

/**
 * Servlet implementation class ClientesController
 */
@WebServlet({ "/GetAll3", "/Grabar3", "/Editar3", "/Borrar3" })
public class ClientesController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String path = request.getServletPath();

		switch (path) {
		case "/GetAll3":
			getAll3(request, response);
			break;
		case "/Grabar3":
			grabar3(request, response);
			break;
		case "/Editar3":
			editar3(request, response);
			break;
		case "/Borrar3":
			borrar3(request, response);
			break;

		default:
			break;
		}
	}

	private void borrar3(HttpServletRequest request, HttpServletResponse response)  throws IOException {
		MensajeDto msg = new MensajeDto(1, "Proceso ok.");

		try {
			// Datos
			int id = Integer.parseInt(request.getParameter("id"));

			// Proceso

			ClientesService service = new ClientesService();
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
	

	private void editar3(HttpServletRequest request, HttpServletResponse response) throws IOException {
		MensajeDto msg = new MensajeDto(1, "Proceso ok.");

		try {
			// Datos
			int id = Integer.parseInt(request.getParameter("id"));
			String nombre = request.getParameter("nombre");
			String correo = request.getParameter("correo");

			// Proceso
			ClientesDto dto = new ClientesDto(id, nombre, correo);
			ClientesService service = new ClientesService();
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

	private void grabar3(HttpServletRequest request, HttpServletResponse response) throws IOException {
		MensajeDto msg = new MensajeDto(1, "Proceso ok.");

		try {
			// Datos
			int id = Integer.parseInt(request.getParameter("id"));
			String nombre = request.getParameter("nombre");
			String correo = request.getParameter("correo");

			// Proceso
			ClientesDto dto = new ClientesDto(id, nombre, correo);
			ClientesService service = new ClientesService();
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

	private void getAll3(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			ClientesService service = new ClientesService();
			List<ClientesDto> lista = service.getAll();

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
