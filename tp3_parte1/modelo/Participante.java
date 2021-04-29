package ar.unrn.tp3.modelo;

public class Participante {

	private String nombre;
	private String telefono;
	private String region;

	public Participante(String nombre, String telefono, String region) throws DataEmptyException, GenericDataException {

		if (esDatoVacio(nombre))
			throw new DataEmptyException("Nombre");
		if (esDatoVacio(telefono))
			throw new DataEmptyException("Telefono");
		if (!validarTelefono(telefono)) {
			throw new GenericDataException("El teléfono debe ingresarse de la siguiente forma: NNNN-NNNNNN");
		}
		if (!region.equals("China") && !region.equals("US") && !region.equals("Europa")) {
			throw new GenericDataException("Region desconocida. Las conocidas son: China, US, Europa");
		}
		this.nombre = nombre;
		this.telefono = telefono;
		this.region = region;
	}

	private boolean esDatoVacio(String dato) {
		return dato.equals("");
	}

	private boolean validarTelefono(String telefono) {
		String regex = "\\d{4}-\\d{6}";
		return telefono.matches(regex);
	}

	public String nombre() {
		return this.nombre;
	}

	public String telefono() {
		return this.telefono;
	}

	public String region() {
		return this.region;
	}
}
