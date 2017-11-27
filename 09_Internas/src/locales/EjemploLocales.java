/**
 * EJEMPLO DE USO DE CLASES LOCALES A UN MÉTODO
 */
package locales;

import java.time.LocalDate;

/**
 * @author Openwebinars
 *
 */
public class EjemploLocales {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//Persona p = new Persona("12345678B", "Pepe", "Pérez", LocalDate.of(1990, 3, 15));
		Persona p = new Persona("12345678Z", "Pepe", "Pérez", LocalDate.of(1990, 3, 15));
		
		if (Persona.validarNif(p.getDni())) {
			System.out.println("El nif " + p.getDni() + " es válido");
		} else {			
			System.out.println("El nif " + p.getDni() + " no es válido");
		}
		
		

	}

}
