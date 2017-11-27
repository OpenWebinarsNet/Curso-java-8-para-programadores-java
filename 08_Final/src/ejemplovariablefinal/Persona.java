/**
 * EJEMPLO DE UNA CLASE DE TIPO MODELO
 */
package ejemplovariablefinal;

import java.time.LocalDate;

/**
 * @author Openwebinars
 *
 */
public class Persona {
	
	public static final char HOMBRE = 'H';
	public static final char MUJER = 'M';

	private String dni;
	private String nombre;
	private String apellidos;
	private char sexo;
	private LocalDate fechaNacimiento;
	
	public Persona() { }

	public Persona(String dni, String nombre, String apellidos, char sexo, LocalDate fechaNacimiento) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.sexo = sexo;
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
	
	

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	@Override
	public String toString() {
		return "Persona [" + (dni != null ? "dni=" + dni + ", " : "")
				+ (nombre != null ? "nombre=" + nombre + ", " : "")
				+ (apellidos != null ? "apellidos=" + apellidos + ", " : "") + "sexo=" + sexo + ", "
				+ (fechaNacimiento != null ? "fechaNacimiento=" + fechaNacimiento : "") + "]";
	}

	

	
	
	
	
	
}
