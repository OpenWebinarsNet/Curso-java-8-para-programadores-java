/**
 * EJEMPLO DE IMPLEMENTACIÓN DEL PATRÓN DAO CON LA TABLA PERSONAS
 * OFRECEMOS LOS MÉTODOS 
 * 
 * - insert
 * - findAll
 * - findByPk
 * - update
 * - delete
 * 
 * TAMBIÉN IMPLEMENTAMOS EL PATRÓN SINGLETON
 * 
 */
package dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import singleton.DBConnection;

/**
 * @author Openwebinars
 *
 */
public class DaoEmpleados {

	/*
	 * PROPIEDADES Y MÉTODOS SINGLETON
	 */

	private Connection con = null;

	private static DaoEmpleados instance = null;

	private DaoEmpleados() throws SQLException {
		con = DBConnection.getConnection();
	}

	public static DaoEmpleados getInstance() throws SQLException {
		if (instance == null)
			instance = new DaoEmpleados();

		return instance;
	}

	/*
	 * MÉTODOS PROPIOS DE LA CLASE DAO
	 */

	public void insert(Empleado e) throws SQLException {

		PreparedStatement ps = con.prepareStatement(
				"INSERT INTO empleados (nombre, apellidos, fecha_nacimiento, sueldo) VALUES (?, ?, ?, ?)");
		ps.setString(1, e.getNombre());
		ps.setString(2, e.getApellido());
		ps.setDate(3, Date.valueOf(e.getFechaNacimiento()));
		ps.setFloat(4, e.getSueldo());

		ps.executeUpdate();

		ps.close();

	}

	public List<Empleado> findAll() throws SQLException {

		PreparedStatement ps = con.prepareStatement("SELECT * FROM empleados");
		ResultSet rs = ps.executeQuery();

		List<Empleado> result = null;

		while (rs.next()) {
			if (result == null)
				result = new ArrayList<>();

			result.add(new Empleado(rs.getInt("id"), rs.getString("nombre"), rs.getString("apellidos"),
					rs.getDate("fecha_nacimiento").toLocalDate(), rs.getFloat("sueldo")));
		}

		rs.close();
		ps.close();

		return result;
	}

	public Empleado findByPk(int id) throws SQLException {

		PreparedStatement ps = con.prepareStatement("SELECT * FROM empleados WHERE id = ?");
		ps.setInt(1, id);
		ResultSet rs = ps.executeQuery();

		Empleado result = null;

		if (rs.next()) {
			result = new Empleado(rs.getInt("id"), rs.getString("nombre"), rs.getString("apellidos"),
					rs.getDate("fecha_nacimiento").toLocalDate(), rs.getFloat("sueldo"));
		}

		rs.close();
		ps.close();

		return result;

	}

	public void delete(Empleado e) throws SQLException {
		delete(e.getId());
	}
	
	public void delete(int id) throws SQLException {
		
		if (id <= 0)
			return;
		
		PreparedStatement ps = con.prepareStatement("DELETE FROM empleados WHERE id = ?");
		ps.setInt(1, id);

		ps.executeUpdate();

		ps.close();
	}

	public void update(Empleado e) throws SQLException {

		if (e.getId() == 0)
			return;

		PreparedStatement ps = con.prepareStatement(
				"UPDATE empleados SET nombre = ?, apellidos = ?, fecha_nacimiento = ?, sueldo = ? WHERE id = ?");
		
		
		ps.setString(1, e.getNombre());
		ps.setString(2, e.getApellido());
		ps.setDate(3, Date.valueOf(e.getFechaNacimiento()));
		ps.setFloat(4, e.getSueldo());
		ps.setInt(5, e.getId());
		
		ps.executeUpdate();
		
		ps.close();

	}

}
