package pe.eureka.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import pe.eureka.dto.Mensaje;
import pe.eureka.dto.UsuarioDto;
import pe.eureka.service.LogonService;

@WebServlet({ "/Ingresar", "/Salir" })
public class LogonController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String path = request.getServletPath();

		switch (path) {
		case "/Ingresar":
			ingreso(request, response);
			break;
		case "/Salir":
			salir(request, response);
			break;
		}
		
	}

	private void salir(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub

	}

	private void ingreso(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Mensaje mensaje = new Mensaje();
		mensaje.setCode(1);
		String destino = "main.jsp";
		try {
			// Datos
			String usuario = request.getParameter("usuario");
			String clave = request.getParameter("clave");
			// Proceso
			LogonService service = new LogonService();
			UsuarioDto dto = service.validar(usuario, clave);
			if( dto == null ){
				destino = "index.jsp";
				mensaje.setCode(-1);
				mensaje.setMessage("Datos incorrectos");
				mensaje.setError("Datos incorrectos");
			} else {
				HttpSession session = request.getSession();
				session.setAttribute("usuario", dto);
			}
		} catch (Exception e) {
			destino = "index.jsp";
			mensaje.setCode(-1);
			mensaje.setMessage("Error en el proceso");
			mensaje.setError(e.getMessage());
		}
		// Forward
		request.setAttribute("mensaje", mensaje);
		RequestDispatcher rd = request.getRequestDispatcher(destino);
		rd.forward(request, response);
	}

}
