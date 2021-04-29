package modelo;

public class FechaNacimiento {

	private String dia;
	private String mes;
	private String anio;

	public FechaNacimiento(String dia) {
		String split = "/";
		String[] fechaSplit = dia.split(split);
		this.dia = fechaSplit[2];
		this.mes = fechaSplit[1];
		this.anio = fechaSplit[0];
	}

	public String dia() {
		return this.dia;
	}

	public String mes() {
		return this.mes;
	}

	public String anio() {
		return this.anio;
	}

	public int diaInteger() {
		return new Integer(dia);
	}

	public int mesInteger() {
		return new Integer(mes);
	}

}
