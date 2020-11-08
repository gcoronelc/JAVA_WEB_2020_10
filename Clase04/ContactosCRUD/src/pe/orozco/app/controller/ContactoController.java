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

import pe.orozco.app.dto.ContactoDto;
import pe.orozco.app.dto.MensajeDto;
import pe.orozco.app.service.ContactoService;

/**
 * Servlet implementation class ContactoController
 */
@WebServlet({ "/GetAll", "/Grabar", "/Editar", "/Borrar" })
public class ContactoController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String path = request.getServletPath();

		switch (path) {
		case "/GetAll":
			getAll(request, response);
			break;
		case "/Grabar":
			grabar(request, response);
			break;
		case "/Editar":
			editar(request, response);
			break;
		case "/Borrar":
			borrar(request, response);
			break;

		default:
			break;
		}

	}

	private void borrar(HttpServletRequest request, HttpServletResponse response)  throws IOException {
		MensajeDto msg = new MensajeDto(1, "Proceso ok.");

		try {
			// Datos
			int id = Integer.parseInt(request.getParameter("id"));

			// Proceso

			ContactoService service = new ContactoService();
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
	

	private void editar(HttpServletRequest request, HttpServletResponse response) throws IOException {
		MensajeDto msg = new MensajeDto(1, "Proceso ok.");

		try {
			// Datos
			int id = Integer.parseInt(request.getParameter("id"));
			String nombre = request.getParameter("nombre");
			String correo = request.getParameter("correo");

			// Proceso
			ContactoDto dto = new ContactoDto(id, nombre, correo);
			ContactoService service = new ContactoService();
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

	private void grabar(HttpServletRequest request, HttpServletResponse response) throws IOException {
		MensajeDto msg = new MensajeDto(1, "Proceso ok.");

		try {
			// Datos
			int id = Integer.parseInt(request.getParameter("id"));
			String nombre = request.getParameter("nombre");
			String correo = request.getParameter("correo");

			// Proceso
			ContactoDto dto = new ContactoDto(id, nombre, correo);
			ContactoService service = new ContactoService();
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

	private void getAll(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			ContactoService service = new ContactoService();
			List<ContactoDto> lista = service.getAll();

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
