/**
 * EJEMPLO DE USO DE UNA CLASE INMUTABLE
 */
package inmutable;

import java.time.LocalDate;

/**
 * @author Openwebinars
 *
 */
public class EjemploInmutable {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		PersonaInmutable yo = new PersonaInmutable("Luis Miguel", "López Magaña", LocalDate.of(1982, 9, 18));
		
		//No tenemos forma de modificar las propiedades
		//Solo de acceder a ellas en modo lectura
		System.out.printf("%s %s (%s)", yo.getNombre(), yo.getApellidos(), yo.getFechaNacimiento());

	}

}
