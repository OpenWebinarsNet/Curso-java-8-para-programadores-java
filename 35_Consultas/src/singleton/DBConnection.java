/**
 * CLASE QUE IMPLEMENTA EL PATRÓN SINGLETON PARA OBTENER LA CONSULTA A LA BASE DE DATOS
 */
package singleton;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/**
 * @author Openwebinars
 *
 */
public class DBConnection {
	
	private static final String JDBC_URL = "jdbc:mysql://localhost:3306/jdbc";
	
	private static Connection instance = null;
	
	private DBConnection() { }
	
	public static Connection getConnection() throws SQLException {
		if (instance == null) {
			Properties props = new Properties();
			props.put("user", "openwebinars");
			props.put("password", "12345678");
			instance = DriverManager.getConnection(JDBC_URL, props);
		}
		
		return instance;
	}
	

}
