/**
 * 
 */
package herencia.clases;

/**
 * @author Openwebinars
 *
 */
public class Hija extends Base {
	
	public Hija(String n, String a) {
		super(n, a);
	}
	
	public void metodo() {
		//this.nombre = Pepe;   // Imposible acceder. Nos da error
		this.setNombre("Pepe"); // Funciona perfectamente
		this.apellidos = "Perez";
	}
	
	public void print() {
		System.out.println(this.getNombre() + " " + this.apellidos);
	}

}
