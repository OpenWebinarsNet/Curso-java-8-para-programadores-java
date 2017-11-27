/**
 * EJEMPLO DE OBJETO INMUTABLE
 */
package inmutable;

import java.time.LocalDate;

/**
 * @author Openwebinars
 *
 */
public final class PersonaInmutable {
	
	final private String nombre;
	final private String apellidos;
	final private LocalDate fechaNacimiento;
	
	
	public PersonaInmutable(final String nombre, final String apellidos, final LocalDate fechaNacimiento) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.fechaNacimiento = fechaNacimiento;
	}


	public String getNombre() {
		return nombre;
	}


	public String getApellidos() {
		return apellidos;
	}


	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}
	
	
	
	

}
