/**
 * 
 */
package filter;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author Openwebinars
 *
 */
public class StreamFilterMap {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Map<Integer, Persona> personas = new HashMap<>();
		personas.put(1, new Persona("Ana", LocalDate.of(1930, 12, 20)));
		personas.put(2, new Persona("Jesús", LocalDate.of(1931, 3, 13)));
		personas.put(3, new Persona("Miguel", LocalDate.of(1943, 8, 1)));
		personas.put(4, new Persona("Simón", LocalDate.of(1949, 5, 22)));
		personas.put(5, new Persona("Luisa", LocalDate.of(1959, 8, 28)));
		personas.put(6, new Persona("Antonio", LocalDate.of(1965, 4, 28)));
		personas.put(7, new Persona("Alicia", LocalDate.of(1974, 2, 10)));
		personas.put(8, new Persona("Ángel", LocalDate.of(1982, 10, 12)));
		personas.put(9, new Persona("Alberto", LocalDate.of(2000, 1, 2)));
		personas.put(10, new Persona("Maria", LocalDate.of(2002, 4, 21)));
		
		System.out.println("PERSONAS CON ID >= 5");
		personas.entrySet()
			.stream()
			.filter(map -> map.getKey() >= 5)
			.collect(Collectors.toMap(p -> p.getKey(), p -> p.getValue()))
			.forEach((key, value) -> System.out.printf("%d: %s%n", key, value.getNombre()));
		System.out.println("");
		
		

	}

}
