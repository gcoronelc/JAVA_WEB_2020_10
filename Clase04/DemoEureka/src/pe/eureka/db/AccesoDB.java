package pe.eureka.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author Eric Gustavo Coronel Castillo
 * @blog www.desarrollasoftware.com
 * @email gcoronelc@gmail.com
 * @youtube www.youtube.com/c/DesarrollaSoftware
 * @facebook www.facebook.com/groups/desarrollasoftware/
 */
public final class AccesoDB {

	private AccesoDB() {
	}

	public static Connection getConnection() throws SQLException {
		Connection cn = null;
		// Parámetros
		String driver = "oracle.jdbc.OracleDriver";
		String urlDB = "jdbc:oracle:thin:@localhost:1521/XE";
		String user = "eureka";
		String pass = "admin";
		try {
			Class.forName(driver).newInstance();
			cn = DriverManager.getConnection(urlDB, user, pass);
		} catch (SQLException e) {
			throw e;
		} catch (ClassNotFoundException e) {
			throw new SQLException("No se encontro el driver de la BD.");
		} catch (Exception e) {
			throw new SQLException("No se puede establecer conexión de la BD.");
		}
		return cn;
	}

}
