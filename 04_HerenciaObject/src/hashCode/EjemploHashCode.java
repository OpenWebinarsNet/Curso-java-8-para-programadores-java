/**
 * EJEMPLO DE COMPARACIÓN DE DOS INSTANCIAS DE UNA CLASE QUE TIENE
 * IMPLEMENTADO EL MÉTODO EQUALS
 */
package hashCode;

import java.time.LocalDate;

/**
 * @author Openwebinars
 *
 */
public class EjemploHashCode {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		//Persona sí que tiene implementado el método equals
		PersonaV2 rafaNadal = new PersonaV2("Rafael", "Nadal Parera", LocalDate.of(1986, 6, 3));
		PersonaV2 otroRafaNadal = new PersonaV2("Rafael", "Nadal Parera", LocalDate.of(1986, 6, 3));
		PersonaV2 rogerFederer = new PersonaV2("Roger", "Federer", LocalDate.of(1981, 8, 8));
		
		System.out.println((rafaNadal.equals(otroRafaNadal)) ? 
				"Las dos personas son iguales" : "Son diferentes");
		
		System.out.println((rafaNadal.equals(rogerFederer)) ? 
				"Las dos personas son iguales" : "Son diferentes");
		
		System.out.println("rafaNadal:" + rafaNadal);
		System.out.println("otroRafaNadal:" + otroRafaNadal);
		System.out.println("rogerFederer:" + rogerFederer);

	}

}
