/**
 * EjemploSelect.java, MODIFICADO Y AUMENTADO PARA EL USO DE PREPAREDSTATEMENT
 */
package consultas;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

import singleton.DBConnection;

/**
 * @author Openwebinars
 *
 */
public class EjemploPreparedStatement {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Connection con = null;

		try {

			// Obtenemos la conexión
			con = DBConnection.getConnection();

			// Creamos el objeto para enviar sentencias
			PreparedStatement ps = con
					.prepareStatement("SELECT * FROM empleados WHERE sueldo >= ? ORDER BY fecha_nacimiento");
			ps.setFloat(1, 1200.0f);

			// Ejecutamos la sentencia y recogemos
			// datos de la consulta
			ResultSet rs = ps.executeQuery();

			// El procesamiento se hace igual que en el ejemplo anterior			
			while (rs.next()) {
				String nombre = rs.getString("nombre"); // equivalente a rs.getString(1);
				String apellidos = rs.getString("apellidos"); // equivalente a rs.getString(2);
				java.sql.Date fechaNacimiento = rs.getDate("fecha_nacimiento"); // equivalente a rs.getDate(3);
				LocalDate fechaNacimientoLD = fechaNacimiento.toLocalDate();
				float sueldo = rs.getFloat("sueldo"); // equivalente a rs.getFloat(4);
				System.out.printf("%s %s\t\t (%s) - %.2f€ %n", nombre, apellidos,
						fechaNacimientoLD.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM)), sueldo);
			}

			// Cerramos ResultSet y Statement
			rs.close();
			ps.close();

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
