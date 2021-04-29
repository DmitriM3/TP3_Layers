package bd;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;

import modelo.Empleados;
import modelo.RegistroEmpleados;

public class EnDiscoRegistroEmpleados implements RegistroEmpleados {

	public ArrayList<Empleados> obtenerEmpleados() {

		ArrayList<Empleados> misEmpleados = new ArrayList<Empleados>();
		// File archivo = new File("%userprofile%\\Desktop\\prueba.txt");
		File archivo = new File("C:\\Users\\Mati\\Desktop\\prueba.txt");
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader(archivo));
			// Leer la primera línea, guardando en un String por palabras separadas en ','
			String split = ", ";
			String texto = br.readLine();
			while (texto != null) {
				String[] texto1 = texto.split(split);
				misEmpleados.add(new Empleados(texto1[0], texto1[1], texto1[2], texto1[03]));
				// Leer la siguiente línea
				texto = br.readLine();
			}
		} catch (FileNotFoundException e) {
			throw new RuntimeException("No se encuentra el archivo");
		} catch (Exception e) {
			throw new RuntimeException("No se puede conectar");
		} finally {
			try {
				if (br != null)
					br.close();
			} catch (Exception e) {
				throw new RuntimeException("Error al finalizar");
			}
		}
		return misEmpleados;
	}

}
