package serviciomail;

import libreria.Email;
import libreria.SmtpException;
import modelo.NuevoSmtpException;
import modelo.ServicioDeEmail;

public class CorreoEmail implements ServicioDeEmail {

	private Email miEmail;

	public void enviarEmail(String destinatario, String titulo, String mensaje) throws NuevoSmtpException {
		this.miEmail = new Email(destinatario, titulo, mensaje);
		try {
			this.miEmail.enviar();
		} catch (SmtpException e) {
			throw new NuevoSmtpException("No se pudo conectar con el servidor SMTP");
		}

	}

}
