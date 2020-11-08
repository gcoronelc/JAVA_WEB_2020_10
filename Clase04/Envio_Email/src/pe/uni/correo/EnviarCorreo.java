package pe.uni.correo;

import java.util.Properties;

import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import pe.uni.datos.Datos;

/**
 * Ejemplo de envio de correo simple con JavaMail
 *
 * @author Chuidiang
 *
 */
public class EnviarCorreo {
	/**
	 * main de prueba
	 * 
	 * @param args
	 *            Se ignoran.
	 */
	public static void main(String[] args) {
		
		try
        {
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
            //remitente
            message.setFrom(new InternetAddress("joseluisorozcolaura@gmail.com"));
            //receptor
            message.addRecipient(
                Message.RecipientType.TO,
                new InternetAddress("egcc.uni@gmail.com"));
            //asunto
            message.setSubject("Hola te acabo de agregar a mis contactos");
            //cuerpo	
            message.setText(
                "Cordiales saludos mi estimado(a) " );

            
            // Lo enviamos. solicita remitente y contraseña
            Transport t = session.getTransport("smtp");
            t.connect("joseluisorozcolaura@gmail.com", Datos.CLAVE);
            t.sendMessage(message, message.getAllRecipients());

            // Cierre.
            t.close();
            System.out.println("Todo ok.");
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
	}
}
