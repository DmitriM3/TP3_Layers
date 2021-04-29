package modelo;

import java.time.LocalDate;

public class Empleados {

	private String apellido;
	private String nombre;
	private FechaNacimiento fechaNac;
	private String correoElectronico;

	public Empleados(String apellido, String nombre, String fechaNacimiento, String correoElectronico) {
		this.apellido = apellido;
		this.nombre = nombre;
		this.fechaNac = new FechaNacimiento(fechaNacimiento);
		this.correoElectronico = correoElectronico;
	}

	public String correoElectronico() {
		return this.correoElectronico;
	}

	public boolean cumpleAños() {
		boolean cumple = false;
		LocalDate hoy = LocalDate.now();
		if (hoy.getDayOfMonth() == Integer.parseInt(fechaNac.dia())
				&& hoy.getMonthValue() == Integer.parseInt(fechaNac.mes())) {
			cumple = true;
		}
		return cumple;

	}

	public String nombre() {
		return this.nombre;
	}

}
