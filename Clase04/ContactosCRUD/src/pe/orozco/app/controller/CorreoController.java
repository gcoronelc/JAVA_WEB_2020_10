package pe.orozco.app.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import pe.orozco.app.dto.CorreoDto;
import pe.orozco.app.dto.MensajeDto;
import pe.orozco.app.service.CorreoService;

/**
 * Servlet implementation class CorreoController
 */
@WebServlet({ "/Correo" })
public class CorreoController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String path = request.getServletPath();

		switch (path) {

		case "/Correo":
			correo(request, response);
			break;

		default:
			break;
		}
	}

	private void correo(HttpServletRequest request, HttpServletResponse response) throws IOException {
		MensajeDto msg = new MensajeDto(1, "Proceso ok.");
		try {
			// Datos
			String remitente = request.getParameter("remitente");
			String receptor = request.getParameter("receptor");
			String contraseña = request.getParameter("contraseña");

			// Proceso
			CorreoDto dto = new CorreoDto(remitente, receptor, contraseña);
			CorreoService service = new CorreoService();
			service.enviarcorreo(dto);

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

}