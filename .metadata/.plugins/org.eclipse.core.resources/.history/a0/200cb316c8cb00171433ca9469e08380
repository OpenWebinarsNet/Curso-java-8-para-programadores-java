/**
 * 
 */
package predicate;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;


/**
 * @author Openwebinars
 *
 */
public class EjemploPredicate {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		List<Persona> listaPersonas = new ArrayList<>();

		listaPersonas.add(new Persona("12345678A", "Pepe", "Perez", LocalDate.of(1990, 1, 2)));
		listaPersonas.add(new Persona("23456789B", "Juan", "Martínez", LocalDate.of(1981, 2, 3)));
		listaPersonas.add(new Persona("34567890C", "Ana", "Ramírez", LocalDate.of(1972, 3, 4)));
		listaPersonas.add(new Persona("45678901D", "María", "López", LocalDate.of(1993, 4, 5)));
		
		
		listaPersonas
			.stream()
			.filter((p) -> p.getEdad() >= 35l)
			.forEach(System.out::println);
		
		
		Predicate<Persona> edad = (p) -> p.getEdad() >= 35l;
		Predicate<Persona> nombre = (p) -> p.getApellidos().contains("e");
		Predicate<Persona> complejo = edad.or(nombre);
		
		System.out.println("");
		listaPersonas
			.stream()
			.filter(complejo)
			.forEach(System.out::println);		
		
	}

}
