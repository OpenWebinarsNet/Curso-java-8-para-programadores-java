/**
 * 
 */
package hashCode;

import java.time.LocalDate;
import java.util.Objects;

/**
 * @author Openwebinars
 *
 */
public class PersonaV2 {

	private String nombre;
	private String apellidos;
	private LocalDate fechaNacimiento;

	public PersonaV2(String nombre, String apellidos, LocalDate fechaNacimiento) {
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

//	// Generado por Eclipse
//	// Viejo estilo	
//	@Override
//	public int hashCode() {
//		final int prime = 31;
//		int result = 1;
//		result = prime * result + ((apellidos == null) ? 0 : apellidos.hashCode());
//		result = prime * result + ((fechaNacimiento == null) ? 0 : fechaNacimiento.hashCode());
//		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
//		return result;
//	}
//	
//
//	// Generado por Eclipse
//	// Viejo estilo
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		PersonaV2 other = (PersonaV2) obj;
//		if (apellidos == null) {
//			if (other.apellidos != null)
//				return false;
//		} else if (!apellidos.equals(other.apellidos))
//			return false;
//		if (fechaNacimiento == null) {
//			if (other.fechaNacimiento != null)
//				return false;
//		} else if (!fechaNacimiento.equals(other.fechaNacimiento))
//			return false;
//		if (nombre == null) {
//			if (other.nombre != null)
//				return false;
//		} else if (!nombre.equals(other.nombre))
//			return false;
//		return true;
//	}

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
		PersonaV2 p = (PersonaV2) obj;

		return Objects.equals(nombre, p.nombre) && Objects.equals(apellidos, p.apellidos)
				&& Objects.equals(fechaNacimiento, p.fechaNacimiento);

	}
	
	@Override
	public int hashCode() {
		return Objects.hash(nombre, apellidos, fechaNacimiento);
	}
	

}
