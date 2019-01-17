package herencia.composicion;

/**
 * 
 * @author Openwebinars
 *
 */
public class Municipio {
	
	private String nombre;
	private int numHabitantes;
	
	
	public Municipio() { }


	public Municipio(String nombre, int numHabitantes) {
		this.nombre = nombre;
		this.numHabitantes = numHabitantes;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public int getNumHabitantes() {
		return numHabitantes;
	}


	public void setNumHabitantes(int numHabitantes) {
		this.numHabitantes = numHabitantes;
	}


	@Override
	public String toString() {
		return "Municipio [nombre=" + nombre + ", numHabitantes=" + numHabitantes + "]";
	}
	
	
	
	

}
