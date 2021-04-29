package modelo;

import java.util.ArrayList;

public class MisEmpleados {

	private ArrayList<Empleados> misEmpleados = new ArrayList<Empleados>();;
	private ServicioDeEmail servicioEmail;
	private RegistroEmpleados registroEmpleados;

	public MisEmpleados(ServicioDeEmail servicioEmail, RegistroEmpleados registroEmpleados) {
		this.servicioEmail = servicioEmail;
		this.registroEmpleados = registroEmpleados;
		this.misEmpleados = this.registroEmpleados.obtenerEmpleados();

	}

	public void enviarSaludoDeCumpleaños() throws NuevoSmtpException {
		this.misEmpleados = this.registroEmpleados.obtenerEmpleados();
		for (Empleados empleados : misEmpleados) {
			if (empleados.cumpleAños())
				this.servicioEmail.enviarEmail(empleados.correoElectronico(), "Feliz Cumpleaños" + empleados.nombre(),
						"Te deseamos un muy feliz cumpleaños !!");
		}
	}

}
