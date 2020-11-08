package pe.uni.correo;

import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import pe.uni.datos.Datos;

public class Envio02 {

	private final Properties properties = new Properties();

	private String password;
	private Session session;

	private void init() {

		properties.put("mail.smtp.host", "smtp.gmail.com");
		properties.put("mail.smtp.starttls.enable", "true");
		properties.put("mail.smtp.port", 587);
		properties.put("mail.smtp.mail.sender", "joseluisorozcolaura@gmail.com");
		properties.put("mail.smtp.user", "joseluisorozcolaura");
		properties.put("mail.smtp.auth", "true");

		session = Session.getDefaultInstance(properties);
	}

	public void sendEmail() {

		init();
		try {
			MimeMessage message = new MimeMessage(session);
			message.setFrom(new InternetAddress((String) properties.get("mail.smtp.mail.sender")));
			message.addRecipient(Message.RecipientType.TO, new InternetAddress("egcc.uni@gmail.com"));
			message.setSubject("Prueba");
			message.setText("Texto");
			Transport t = session.getTransport("smtp");
			t.connect((String) properties.get("mail.smtp.user"), Datos.CLAVE);
			t.sendMessage(message, message.getAllRecipients());
			t.close();
		} catch (MessagingException me) {
			// Aqui se deberia o mostrar un mensaje de error o en lugar
			// de no hacer nada con la excepcion, lanzarla para que el modulo
			// superior la capture y avise al usuario con un popup, por ejemplo.
			System.err.println("Hay error.");
			me.printStackTrace();
			return;
		}

	}

	public static void main(String[] args) {
		
		Envio02 envio = new Envio02();
		envio.sendEmail();
		
	}

}
