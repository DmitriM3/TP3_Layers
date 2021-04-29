package modelo.test;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import bd.EnDiscoRegistroEmpleados;
import modelo.MisEmpleados;
import serviciomail.CorreoEmail;

class MisEmpleadosTest {

	private MisEmpleados misEmpleados;

	@Test
	void verificacionDeCumplea�osDeUnEmpleado() {
		// setup
		misEmpleados = new MisEmpleados(new CorreoEmail(), new EnDiscoRegistroEmpleados());
		boolean esSuCumplea�os = misEmpleados.cumpleA�osEmpleadoFila(0);
		// verificacion
		Assert.assertEquals(esSuCumplea�os, true);
	}

}
