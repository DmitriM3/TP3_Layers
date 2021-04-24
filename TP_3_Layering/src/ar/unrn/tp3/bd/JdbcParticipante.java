package ar.unrn.tp3.bd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import ar.unrn.tp3.modelo.AppSQLException;
import ar.unrn.tp3.modelo.ListaDeParticipantes;
import ar.unrn.tp3.modelo.Participante;

public class JdbcParticipante implements ListaDeParticipantes {

	private Connection dbConn;

	private void setupBaseDeDatos() throws AppSQLException {
		String url = "jdbc:derby://localhost:1527/participantes";
		String user = "app";
		String password = "app";
		try {
			this.dbConn = DriverManager.getConnection(url, user, password);
		} catch (SQLException e) {
			throw new AppSQLException("Error al iniciar conexión " + e.getMessage());
		}
	}

	public void nuevoParticipante(Participante participante) throws AppSQLException {

		try {
			setupBaseDeDatos();
			PreparedStatement st = dbConn
					.prepareStatement("insert into participantes(nombre, telefono, region) values(?,?,?)");
			st.setString(1, participante.nombre());
			st.setString(2, participante.telefono());
			st.setString(3, participante.region());
			st.executeUpdate();
			st.close();
		} catch (AppSQLException | SQLException e) {
			throw new AppSQLException("No se pudo conectar a la BD. " + e.getMessage());
		}

	}

}
