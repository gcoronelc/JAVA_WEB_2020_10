package pe.orozco.app.service;

import java.util.Properties;

import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import pe.orozco.app.dto.CorreoDto;

public class CorreoService {
	public void enviarcorreo(CorreoDto dto) {
		try {			
			// Propiedades de la conexión
			Properties props = new Properties();
			props.setProperty("mail.smtp.host", "smtp.gmail.com");
			props.setProperty("mail.smtp.starttls.enable", "true");
			props.setProperty("mail.smtp.port", "587");
			props.setProperty("mail.smtp.user", "remitente");
			props.setProperty("mail.smtp.auth", "true");

			// Preparamos la sesion
			Session session = Session.getDefaultInstance(props);

			// Construimos el mensaje
			MimeMessage message = new MimeMessage(session);
			// remitente
			message.setFrom(new InternetAddress("remitente"));
			// receptor
			message.addRecipient(Message.RecipientType.TO, new InternetAddress("receptor"));
			// asunto
			message.setSubject("Hola te acabo de agregar a mis contactos");
			// cuerpo
			message.setText("Cordiales saludos mi estimado(a) ");

			// Lo enviamos.
			Transport t = session.getTransport("smtp");
			t.connect("remitente", "contraseña");
			t.sendMessage(message, message.getAllRecipients());

			// Cierre.
			t.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
