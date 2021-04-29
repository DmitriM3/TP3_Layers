package modelo.test;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import bd.EnDiscoRegistroEmpleados;
import modelo.MisEmpleados;
import serviciomail.CorreoEmail;

class MisEmpleadosTest {

	private MisEmpleados misEmpleados;

	@Test
	void verificacionDeCumpleañosDeUnEmpleado() {
		// setup
		misEmpleados = new MisEmpleados(new CorreoEmail(), new EnDiscoRegistroEmpleados());
		boolean esSuCumpleaños = misEmpleados.cumpleAñosEmpleadoFila(0);
		// verificacion
		Assert.assertEquals(esSuCumpleaños, true);
	}

}
