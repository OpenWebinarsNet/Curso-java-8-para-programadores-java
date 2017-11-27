/**
 * Ejemplo de transformación con .map(...)
 */
package map;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.List;

/**
 * @author Openwebinars
 *
 */
public class EjemploMap {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		List<Persona> personas = Arrays.asList(
				new Persona("Pepe", "Pérez", LocalDate.of(1990, 1, 2)),
				new Persona("Juan", "Andévalo", LocalDate.of(1991, 2, 3)),
				new Persona("Miguel", "Ramos", LocalDate.of(1992, 3, 4)),
				new Persona("Carlos", "Jiménez", LocalDate.of(1993, 4, 5))				
				);
				
		personas
			.stream()                         //Stream<Persona>
			.map(p -> p.getNombre())          //Stream<String>
			.map(s -> s.toUpperCase())        //Stream<String>
			.forEach(System.out::println);
		System.out.println("");
		
		System.out.println("Fechas de cumpleaños");
		personas
			.stream()													//Stream<Persona>
			.map(p -> p.getFechaNacimiento())							//Stream<LocalDate>
			.map(f -> f.format(DateTimeFormatter.ofPattern("dd-MM")))   //Stream<String>
			.forEach(System.out::println);
		
	}

}
