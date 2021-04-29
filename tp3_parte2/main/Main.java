package main;

import bd.EnDiscoRegistroEmpleados;
import modelo.MisEmpleados;
import modelo.NuevoSmtpException;
import serviciomail.CorreoEmail;

public class Main {

	public static void main(String[] args) {
		MisEmpleados misEmpleados = new MisEmpleados(new CorreoEmail(), new EnDiscoRegistroEmpleados());
		try {
			misEmpleados.enviarSaludoDeCumpleaños();
		} catch (NuevoSmtpException e) {
			throw new RuntimeException(e);
		}

	}

}
