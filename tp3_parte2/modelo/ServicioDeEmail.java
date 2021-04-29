package modelo;

public interface ServicioDeEmail {

	void enviarEmail(String destinatario, String titulo, String mensaje) throws NuevoSmtpException;

}
