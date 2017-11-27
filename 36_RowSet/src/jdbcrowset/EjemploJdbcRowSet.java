/**
 * 
 */
package jdbcrowset;

import java.sql.Date;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

import javax.sql.RowSetEvent;
import javax.sql.RowSetListener;
import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetFactory;
import javax.sql.rowset.RowSetProvider;

import connection.DBConnection;

/**
 * @author Openwebinars
 *
 */
public class EjemploJdbcRowSet {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		RowSetFactory myRowSetFactory = null;
		JdbcRowSet rowSet = null;
		
		try {
			myRowSetFactory = RowSetProvider.newFactory();
			rowSet = myRowSetFactory.createJdbcRowSet();
			
			rowSet.setUrl(DBConnection.JDBC_URL);
			rowSet.setUsername(DBConnection.USERNAME);
			rowSet.setPassword(DBConnection.PASSWORD);
			
			rowSet.setCommand("SELECT * FROM empleados");
			rowSet.execute();
			
			// Imprimimos todos los registros
			while (rowSet.next()) {
				System.out.printf("%d %s %s\t\t (%s) - %.2f€ %n", rowSet.getInt("id"), 
						rowSet.getString("nombre"), rowSet.getString("apellidos"),
						rowSet.getDate("fecha_nacimiento").toLocalDate().format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM)),
						rowSet.getFloat("sueldo"));
			}
			System.out.println("");
			
			// Añadimos este "listener", que nos permite gestionar algunos
			// eventos sobre el RowSet.
//			rowSet.addRowSetListener(new RowSetListener() {
//				
//				@Override
//				public void rowSetChanged(RowSetEvent event) {
//					
//				}
//				
//				@Override
//				public void rowChanged(RowSetEvent event) {
//					System.err.println("Una fila ha sido modificada");
//				}
//				
//				@Override
//				public void cursorMoved(RowSetEvent event) {
//					System.err.println("Cursor movido");
//				}
//			});
			
			// Nos vamos al último registro de nuevo, y le subimos el sueldo un 10%
			rowSet.last();
			rowSet.updateFloat("sueldo", rowSet.getFloat("sueldo") * 1.1f);
			rowSet.updateRow();
			
			// Insertamos un nuevo registro
			rowSet.moveToInsertRow();
			rowSet.updateString("nombre", "Ángel");
			rowSet.updateString("apellidos", "Cuenca Lozano");
			rowSet.updateDate("fecha_nacimiento", Date.valueOf(LocalDate.of(1975, 12, 21)));
			rowSet.updateFloat("sueldo", 1600.0f);
			rowSet.insertRow();
			
			
			// Imprimimos todos los registros de nuevo
			rowSet.beforeFirst();
			while (rowSet.next()) {
				System.out.printf("%d %s %s\t\t (%s) - %.2f€ %n", rowSet.getInt("id"), 
						rowSet.getString("nombre"), rowSet.getString("apellidos"),
						rowSet.getDate("fecha_nacimiento").toLocalDate().format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM)),
						rowSet.getFloat("sueldo"));
			}
			System.out.println("");
			
			
			// Cerramos el cursor
			rowSet.close();
			
			

		} catch (SQLException e) {			
			e.printStackTrace();
		}
		
		
		

	}

}
