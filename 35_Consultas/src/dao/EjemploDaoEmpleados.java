/**
 * 
 */
package dao;

import java.sql.SQLException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.List;
import java.util.Scanner;

/**
 * @author Openwebinars
 *
 */
public class EjemploDaoEmpleados {

	static Scanner sc;

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		try {
			sc = new Scanner(System.in);
			int opcion;
			DaoEmpleados dao = DaoEmpleados.getInstance();

			do {
				menu();
				opcion = Integer.parseInt(sc.nextLine());

				switch (opcion) {
				case 1:
					listarTodosEmpleados(dao);
					break;
				case 2:
					listarUnEmpleado(dao);
					break;
				case 3:
					nuevoEmpleado(dao);
					break;
				case 4:
					actualizarUnEmpleado(dao);
					break;
				case 5:
					eliminarUnEmpleado(dao);
					break;

				}

			} while (opcion != 0);
		} catch (SQLException ex) {
			ex.printStackTrace();
		}

	}

	

	



	public static void menu() {

		System.out.println("SISTEMA DE GESTIÓN DE EMPLEADOS");
		System.out.println("===============================");
		System.out.println("0. Salir");
		System.out.println("1. Listar todos los empleados");
		System.out.println("2. Listar un empleado por su ID");
		System.out.println("3. Insertar un nuevo empleado");
		System.out.println("4. Actualizar un empleado");
		System.out.println("5. Eliminar un empleado");

	}
	
	private static void listarTodosEmpleados(DaoEmpleados dao) {
		
		List<Empleado> lista = null;
		try {
			lista = dao.findAll();
		} catch (SQLException e) {			
			e.printStackTrace();
		}
		
		if (lista != null)
			lista.forEach((e) -> {
				System.out.printf("%d %s %s\t\t (%s) - %.2f€ %n", e.getId(), e.getNombre(), e.getApellido(), 
						e.getFechaNacimiento().format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM)),
						e.getSueldo());
			});
		else
			System.out.println("No hay empleados registrados en la base de datos");
		
		System.out.println("");
		
	}
	
	private static void listarUnEmpleado(DaoEmpleados dao) {
		System.out.println("Búsqueda de un empleado");
		System.out.print("Introduzca el ID del empleado: ");
		int id = Integer.parseInt(sc.nextLine());
		
		Empleado e = null;
		try {
			e = dao.findByPk(id);
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
		
		if (e != null) {
			System.out.printf("%s %s\t\t (%s) - %.2f€ %n", e.getNombre(), e.getApellido(), 
					e.getFechaNacimiento().format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM)),
					e.getSueldo());
		} else {
			System.out.println("No existe ningún registro con ese ID");
		}
		
		System.out.println("");
		
	}

	private static void nuevoEmpleado(DaoEmpleados dao) {
		System.out.println("Inserción de un nuevo empleado");
		System.out.print("Introduzca el nombre del empleado: ");
		String nombre = sc.nextLine();
		System.out.print("Introduzca los apellidos del empleado: ");
		String apellidos = sc.nextLine();
		System.out.print("Introduzca la fecha de nacimiento (dd/mm/aaaa) : ");
		String strFecha = sc.nextLine();
		LocalDate fecha = LocalDate.parse(strFecha, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		System.out.print("Introduzca el sueldo del empleado: ");
		float sueldo = Float.parseFloat(sc.nextLine());

		try {
			dao.insert(new Empleado(nombre, apellidos, fecha, sueldo));
			System.out.println("Nuevo registro insertado");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		System.out.println("");

	}
	
	
	private static void actualizarUnEmpleado(DaoEmpleados dao) {
		System.out.println("Actualización de un empleado");
		System.out.print("Introduzca el ID del empleado: ");
		int id = Integer.parseInt(sc.nextLine());
		
		Empleado e = null;
		try {
			e = dao.findByPk(id);
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
		
		if (e == null) {
			System.out.println("El empleado a modificar no está registrado en la base de datos");			
		} else {
			System.out.print("Introduzca el nombre del empleado: ");
			String nombre = sc.nextLine();
			System.out.print("Introduzca los apellidos del empleado: ");
			String apellidos = sc.nextLine();
			System.out.print("Introduzca la fecha de nacimiento (dd/mm/aaaa) : ");
			String strFecha = sc.nextLine();
			LocalDate fecha = LocalDate.parse(strFecha, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
			System.out.print("Introduzca el sueldo del empleado: ");
			float sueldo = Float.parseFloat(sc.nextLine());
			e.setNombre(nombre);
			e.setApellido(apellidos);
			e.setFechaNacimiento(fecha);
			e.setSueldo(sueldo);
			
			try {
				dao.update(e);
				System.out.println("Registro actualizado");
			} catch (SQLException ex) {				
				ex.printStackTrace();
			}
			
		}
		
		System.out.println("");
		
	}

	private static void eliminarUnEmpleado(DaoEmpleados dao) {
		System.out.println("Borrado de un empleado");
		System.out.print("Introduzca el ID del empleado: ");
		int id = Integer.parseInt(sc.nextLine());
		
		System.out.println("¿Está usted seguro de eliminar dicho registro? (S/N)");
		String opcion = sc.nextLine();
		
		if (opcion.equalsIgnoreCase("S")) {
			try {
				dao.delete(id);
				System.out.println("Registro eliminado");
			} catch (SQLException e) {				
				e.printStackTrace();
			}
		}
		
		System.out.println("");
		
	}



	
}
