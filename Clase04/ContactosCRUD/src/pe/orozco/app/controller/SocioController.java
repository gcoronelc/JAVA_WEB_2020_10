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

import pe.orozco.app.dto.SocioDto;
import pe.orozco.app.dto.MensajeDto;
import pe.orozco.app.service.SocioService;

/**
 * Servlet implementation class SocioController
 */
@WebServlet({ "/GetAll2", "/Grabar2", "/Editar2", "/Borrar2" })
public class SocioController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String path = request.getServletPath();

		switch (path) {
		case "/GetAll2":
			getAll2(request, response);
			break;
		case "/Grabar2":
			grabar2(request, response);
			break;
		case "/Editar2":
			editar2(request, response);
			break;
		case "/Borrar2":
			borrar2(request, response);
			break;

		default:
			break;
		}
	}

	private void borrar2(HttpServletRequest request, HttpServletResponse response) throws IOException {
		MensajeDto msg = new MensajeDto(1, "Proceso ok.");

		try {
			// Datos
			int id = Integer.parseInt(request.getParameter("id"));

			// Proceso

			SocioService service = new SocioService();
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

	private void editar2(HttpServletRequest request, HttpServletResponse response) throws IOException {
		MensajeDto msg = new MensajeDto(1, "Proceso ok.");

		try {
			// Datos
			int id = Integer.parseInt(request.getParameter("id"));
			String nombre = request.getParameter("nombre");
			String correo = request.getParameter("correo");

			// Proceso
			SocioDto dto = new SocioDto(id, nombre, correo);
			SocioService service = new SocioService();
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

	private void grabar2(HttpServletRequest request, HttpServletResponse response) throws IOException {
		MensajeDto msg = new MensajeDto(1, "Proceso ok.");

		try {
			// Datos
			int id = Integer.parseInt(request.getParameter("id"));
			String nombre = request.getParameter("nombre");
			String correo = request.getParameter("correo");

			// Proceso
			SocioDto dto = new SocioDto(id, nombre, correo);
			SocioService service = new SocioService();
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

	private void getAll2(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {
			SocioService service = new SocioService();
			List<SocioDto> lista = service.getAll();

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
