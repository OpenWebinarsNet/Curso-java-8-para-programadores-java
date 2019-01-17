/**
 * 
 */
package herencia.clases;

/**
 * @author Openwebinars
 *
 */
public class Base {
	
	private String nombre;
	protected String apellidos;
	
	public Base() { }

	public Base(String nombre, String apellidos) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
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

	
	

}
