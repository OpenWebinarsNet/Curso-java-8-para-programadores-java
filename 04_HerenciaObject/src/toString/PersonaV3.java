/**
 * 
 */
package toString;

import java.time.LocalDate;
import java.util.Objects;

/**
 * @author Openwebinars
 *
 */
public class PersonaV3 {

	private String nombre;
	private String apellidos;
	private LocalDate fechaNacimiento;

	public PersonaV3(String nombre, String apellidos, LocalDate fechaNacimiento) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.fechaNacimiento = fechaNacimiento;
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


	// Estilo a partir de Java SE 7
	// Mucho más compacto
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;

		// casteamos a la clase correcta
		PersonaV3 p = (PersonaV3) obj;

		return Objects.equals(nombre, p.nombre) && Objects.equals(apellidos, p.apellidos)
				&& Objects.equals(fechaNacimiento, p.fechaNacimiento);

	}
	
	@Override
	public int hashCode() {
		return Objects.hash(nombre, apellidos, fechaNacimiento);
	}
	
	@Override
	public String toString() {
		return "PersonaV3 [" + (nombre != null ? "nombre=" + nombre + ", " : "")
				+ (apellidos != null ? "apellidos=" + apellidos + ", " : "")
				+ (fechaNacimiento != null ? "fechaNacimiento=" + fechaNacimiento : "") + "]";
	}
	
	
	

}
