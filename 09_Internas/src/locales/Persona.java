/**
 * EJEMPLO DE UNA CLASE DE TIPO MODELO
 */
package locales;

import java.time.LocalDate;

/**
 * @author Openwebinars
 *
 */
public class Persona {

	private String dni;
	private String nombre;
	private String apellidos;
	private LocalDate fechaNacimiento;

	public Persona() {
	}

	public Persona(String dni, String nombre, String apellidos, LocalDate fechaNacimiento) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	@Override
	public String toString() {
		return "Persona [dni=" + dni + ", nombre=" + nombre + ", apellidos=" + apellidos + ", fechaNacimiento="
				+ fechaNacimiento + "]";
	}

	/*
	 * Método que permite validar un DNI
	 */
	public static boolean validarNif(String nif) {

		int longitud = 9;
		// A partir de Java SE 8, aunque estas variables no son
		// final, la JVM las trata como tal, y podemos así usarlas
		// en la clase anónima.
		int longitudSinLetra = 8;

		if (nif.length() != longitud) {
			return false;
		}

		//Clase local, que nos ayuda a validar el NIF
		class Nif {
			String nifValido = null;
			final String[] arrayLetrasNIF = { "T", "R", "W", "A", "G", "M", "Y", "F", "P", "D", "X", "B", "N", "J", "Z", "S",
					"Q", "V", "H", "L", "C", "K", "E" };

			// CONSTRUCTOR
			// Recibe el numero, sin la letra.
			Nif(String nifSinLetra) {
				if (nifSinLetra.length() != longitudSinLetra)
					nifValido = null;
				else {
					try {
						nifValido = nifSinLetra + arrayLetrasNIF[Integer.parseInt(nifSinLetra) % 23];
					} catch (Exception e) {
						nifValido = null;
					}
				}
			}

			//MÉTODO QUE DEVUELVE EL DNI VÁLIDO
			//PARA EL CONJUNTO DE NÚMEROS
			public String getNif() {
				return nifValido;
			}

		}

		//Construimos un objeto local para testear
		Nif n = new Nif(nif.substring(0, nif.length() - 1));

		return nif.equalsIgnoreCase(n.getNif());

	}

}
