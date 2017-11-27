/**
 * 
 */
package flatmap;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Openwebinars
 *
 */
public class Persona {
	
	private String nombre;
	private List<Viaje> viajes = new ArrayList<>();

	public Persona(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}	

	public List<Viaje> getViajes() {
		return viajes;
	}

	public void setViajes(List<Viaje> viajes) {
		this.viajes = viajes;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + "]";
	}
	
	
	

}
