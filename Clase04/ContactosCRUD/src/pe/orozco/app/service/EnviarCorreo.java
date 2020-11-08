package pe.orozco.app.service;

import java.util.Properties;

import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class EnviarCorreo {

	public EnviarCorreo() {
		
	}
	
	public int enviar(String destino, String titulo, String mensaje) {
		int estado = 1;
		try {
			// Propiedades de la conexión
			Properties props = new Properties();
			props.setProperty("mail.smtp.host", "smtp.gmail.com");
			props.setProperty("mail.smtp.starttls.enable", "true");
			props.setProperty("mail.smtp.port", "25");
			props.setProperty("mail.smtp.user", "joseluisorozcolaura@gmail.com");
			props.setProperty("mail.smtp.auth", "true");

			// Preparamos la sesion
			Session session = Session.getDefaultInstance(props);

			// Construimos el mensaje
			MimeMessage message = new MimeMessage(session);
			// remitente
			message.setFrom(new InternetAddress("joseluisorozcolaura@gmail.com"));
			// receptor
			message.addRecipient(Message.RecipientType.TO, new InternetAddress(destino));
			// asunto
			message.setSubject(titulo);
			// cuerpo
			message.setText(mensaje);

			// Lo enviamos. solicita remitente y contraseña
			Transport t = session.getTransport("smtp");
			t.connect("joseluisorozcolaura@gmail.com", Datos.CLAVE);
			t.sendMessage(message, message.getAllRecipients());

			// Cierre.
			t.close();
		} catch (Exception e) {
			e.printStackTrace();
			estado = -1;
		}
		return estado;
	}
}
