package encapsulacion.servicio;

import java.util.ArrayList;
import java.util.List;

import encapsulacion.modelo.Persona;

/**
 * 
 * @author Openwebinars
 *
 */
public class Servicio {
	
	List<Persona> lista;
	
	public Servicio() {
		lista = new ArrayList<>();
	}
	
	public void addPersona(Persona p) {
		lista.add(p);
	}
	
	public void editarPersona(Persona p) {
		for(int i=0; i < lista.size(); i++) {
			if (lista.get(i).getDni().equalsIgnoreCase(p.getDni())) {
				lista.set(i, p);
			}
		}
		
	}

	public void eliminarPersona(Persona p) {
		for(int i=0; i < lista.size(); i++) {
			if (lista.get(i).getDni().equalsIgnoreCase(p.getDni())) {
				lista.remove(i);
			}
		}
		
	}
	
	public List<Persona> listarTodasPersonas() {
		return lista;
	}
	
	
}
