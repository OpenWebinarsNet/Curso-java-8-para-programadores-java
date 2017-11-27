/**
 * 
 */
package consultas;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

import singleton.DBConnection;

/**
 * @author Openwebinars
 *
 */
public class EjemploSelect {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Connection con = null;

		try {

			// Obtenemos la conexión
			con = DBConnection.getConnection();

			// Creamos el objeto para enviar sentencias
			Statement st = con.createStatement();

			// Enviamos una sentencia para rescatar todos los
			// datos de una tabla
			ResultSet rs = st.executeQuery("SELECT * FROM empleados");

			while (rs.next()) {
				String nombre = rs.getString("nombre"); //equivalente a rs.getString(1);
				String apellidos = rs.getString("apellidos"); // equivalente a rs.getString(2);
				java.sql.Date fechaNacimiento = rs.getDate("fecha_nacimiento"); //equivalente a rs.getDate(3);
				LocalDate fechaNacimientoLD = fechaNacimiento.toLocalDate();				
				float sueldo = rs.getFloat("sueldo"); //equivalente a rs.getFloat(4);
				System.out.printf("%s %s\t\t (%s) - %.2f€ %n", nombre, apellidos, 
						fechaNacimientoLD.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM)),
						sueldo);
			}
			
			// Cerramos ResultSet y Statement
			rs.close();
			st.close();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (con != null)
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
		}

	}

}
