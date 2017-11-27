/**
 * EJEMPLO DE COMPARACIÓN DE DOS INSTANCIAS DE UNA CLASE QUE TIENE
 * IMPLEMENTADO EL MÉTODO EQUALS
 */
package equals;

import java.time.LocalDate;

/**
 * @author Openwebinars
 *
 */
public class EjemploEquals {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// Coche no tiene implementado equals
		// Toma el comportamiento por defecto de object
		Coche mercedes = new Coche("Mercedes", "A200", "2.0 TDI");
		Coche volkswagen = new Coche("VolksWagen", "Passat", "2.0 TDI");

		if (mercedes.equals(volkswagen))
			System.out.println("Los dos coches son iguales");
		else
			System.out.println("Son diferentes");

		
		//Asigna a las dos referencias el mismo objeto en memoria
		//No copia valores
		volkswagen = mercedes;

		// Esta línea de código es equivalente al bloque if/else de arriba
		System.out.println((mercedes.equals(volkswagen)) ? 
				"Los dos coches son iguales" : "Son diferentes");
		
		System.out.println("Mercedes: " + mercedes);
		System.out.println("Volkswagen: " + volkswagen);
		
		System.out.println("\n\n\n");
		//Persona sí que tiene implementado el método equals
		Persona rafaNadal = new Persona("Rafael", "Nadal Parera", LocalDate.of(1986, 6, 3));
		Persona otroRafaNadal = new Persona("Rafael", "Nadal Parera", LocalDate.of(1986, 6, 3));
		Persona rogerFederer = new Persona("Roger", "Federer", LocalDate.of(1981, 8, 8));
		
		System.out.println((rafaNadal.equals(otroRafaNadal)) ? 
				"Las dos personas son iguales" : "Son diferentes");
		
		System.out.println((rafaNadal.equals(rogerFederer)) ? 
				"Las dos personas son iguales" : "Son diferentes");
		
		System.out.println("rafaNadal:" + rafaNadal);
		System.out.println("otroRafaNadal:" + otroRafaNadal);
		System.out.println("rogerFederer:" + rogerFederer);

	}

}
