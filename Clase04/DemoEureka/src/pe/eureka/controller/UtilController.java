package pe.eureka.controller;

import java.io.IOException;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import pe.eureka.dto.Mensaje;

public class UtilController {

	public static void enviar(HttpServletRequest request, HttpServletResponse response, Mensaje mensaje) throws IOException {
		// mensaje
		Gson gson = new Gson();
		String texto = gson.toJson(mensaje);
		// response.setContentType("text/plain;charset=UTF-8");
		response.setContentType("application/json");
		ServletOutputStream sout = response.getOutputStream();
		sout.print(texto);
		sout.flush();
	}

}
