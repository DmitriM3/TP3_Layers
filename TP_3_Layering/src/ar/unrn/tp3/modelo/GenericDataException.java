package ar.unrn.tp3.modelo;

public class GenericDataException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6293120756921833515L;

	public GenericDataException() {
		super("Dato invalido");
	}

	public GenericDataException(String message) {
		super("Error - " + message);
	}

}
