/**
 * 
 */
package map;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

import modelo.Persona;

/**
 * @author Openwebinars
 *
 */
public class EjemploMap {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		Map<String, Persona> agenda = new HashMap<>();
		
		//Insertamos los pares clave, valor
		agenda.put("954000001", new Persona("12345678A", "Pepe", "Perez", LocalDate.of(1990, 1, 2)));
		agenda.put("954000002",new Persona("23456789B", "Juan", "Martínez", LocalDate.of(1991, 2, 3)));
		agenda.put("954000003",new Persona("34567890C", "Ana", "Ramírez", LocalDate.of(1992, 3, 4)));
		agenda.put("954000004",new Persona("45678901D", "María", "López", LocalDate.of(1993, 4, 5)));
		
		//Si insertamos un elemento con la misma clave, lo sustituimos
		agenda.put("954000004",new Persona("56789012E", "Martín", "García", LocalDate.of(1990, 12, 15)));
		
		//La forma más normal de recorrer un Map es tomar su conjunto de claves, iterar por ellas, y
		//para cada una de ellas, obtener el valor.
		for(String key : agenda.keySet())
			System.out.printf("%s %s %n", key, agenda.get(key));
		
		


	}

}
