/**
 * 
 */
package cachedrowset;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

import javax.sql.rowset.CachedRowSet;
import javax.sql.rowset.RowSetFactory;
import javax.sql.rowset.RowSetProvider;

import connection.DBConnection;

/**
 * @author Openwebinars
 *
 */
public class EjemploCachedRowSet {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		RowSetFactory myRowSetFactory = null;
		CachedRowSet rowSet = null;

		try {
			myRowSetFactory = RowSetProvider.newFactory();
			rowSet = myRowSetFactory.createCachedRowSet();

			// Podemos crear el CachedRowSet de forma idéntica
			rowSet.setUrl(DBConnection.JDBC_URL);
			rowSet.setUsername(DBConnection.USERNAME);
			rowSet.setPassword(DBConnection.PASSWORD);

			rowSet.setCommand("SELECT * FROM empleados");
			// Indicamos los números de columnas que forman la PK
			rowSet.setKeyColumns(new int[] { 1 });

			// Se abre una conexión puntual para extraer los datos
			// y rellenar el CachedRowSet
			rowSet.execute();

			// o podríamos usar las siguientes líneas
//			ResultSet rs = DBConnection.getConnection().createStatement().executeQuery("SELECT * FROM empleados");
//			rowSet.populate(rs);

			// Imprimimos todos los registros
			while (rowSet.next()) {
				System.out.printf("%d %s %s\t\t (%s) - %.2f€ %n", rowSet.getInt("id"), 
						rowSet.getString("nombre"), rowSet.getString("apellidos"),
						rowSet.getDate("fecha_nacimiento").toLocalDate().format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM)),
						rowSet.getFloat("sueldo"));
			}
			System.out.println("");

			// En este caso, vamos a subir el sueldo de todos los empleados
			rowSet.beforeFirst();
			while (rowSet.next()) {
				rowSet.updateFloat("sueldo", rowSet.getFloat("sueldo") * 1.1f);
				rowSet.updateRow();
			}

			// Imprimimos todos los registros de nuevo
			rowSet.beforeFirst();
			while (rowSet.next()) {
				System.out.printf("%d %s %s\t\t (%s) - %.2f€ %n", rowSet.getInt("id"), 
						rowSet.getString("nombre"), rowSet.getString("apellidos"),
						rowSet.getDate("fecha_nacimiento").toLocalDate().format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM)),
						rowSet.getFloat("sueldo"));
			}
			System.out.println("");


			// ¿Estos cambios han sido consolidados en la base de datos?
			// NO, hasta que no ejecutamos acceptChanges.
			// ¡OJO! Necesitamos una conexión con auto-commit = false
			// para poder usar este método.
			rowSet.acceptChanges(DBConnection.getConnection());

			// Cerramos el cursor
			rowSet.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
