package herencia.composicion;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author Openwebinars
 *
 */
public class Provincia {
	
	private String nombre;
	private List<Municipio> municipios;
	
	public Provincia(String nombre) {
		this.nombre = nombre;
		this.municipios = new ArrayList<>();
	}

	public Provincia(String nombre, List<Municipio> municipios) {
		this.nombre = nombre;
		this.municipios = municipios;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Municipio> getMunicipios() {
		return municipios;
	}

	public void setMunicipios(List<Municipio> municipios) {
		this.municipios = municipios;
	}

	@Override
	public String toString() {
		return "Provincia [nombre=" + nombre + ", municipios=" + municipios + "]";
	}
	
	

}
