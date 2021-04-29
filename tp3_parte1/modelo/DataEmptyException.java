package ar.unrn.tp3.modelo;

public class DataEmptyException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7124415008814160851L;

	public DataEmptyException() {
		super("Campos incompletos");
	}

	public DataEmptyException(String message) {
		super("El campo '" + message + "' no puede ser vacio");
	}

}