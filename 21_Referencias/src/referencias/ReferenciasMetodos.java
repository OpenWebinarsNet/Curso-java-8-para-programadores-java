/**
 * 
 */
package referencias;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Openwebinars
 *
 */
public class ReferenciasMetodos {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		List<Persona> personas = Arrays.asList(
				new Persona("Ana", LocalDate.of(1930, 12, 20)),
				new Persona("Jesús", LocalDate.of(1931, 3, 13)),
				new Persona("Miguel", LocalDate.of(1943, 8, 1)),
				new Persona("Simón", LocalDate.of(1949, 5, 22)),
				new Persona("Luisa", LocalDate.of(1959, 8, 28)),
				new Persona("Antonio", LocalDate.of(1965, 4, 28)),
				new Persona("Alicia", LocalDate.of(1974, 2, 10)),
				new Persona("Ángel", LocalDate.of(1982, 10, 12)),
				new Persona("Alberto", LocalDate.of(2000, 1, 2)),
				new Persona("Maria", LocalDate.of(2002, 4, 21))
				);
		
		// Expresión lambda "amplia"
		personas.sort((Persona p1, Persona p2) -> {
			return p1.getFechaNacimiento().compareTo(p2.getFechaNacimiento());
		});
		System.out.println("MÉTODO 1");
		System.out.println(personas);
		System.out.println("");
		
		// Expresión lambda más abreviada
		personas.sort((p1, p2) -> p1.getFechaNacimiento().compareTo(p2.getFechaNacimiento()));
		System.out.println("MÉTODO 2");
		System.out.println(personas);
		System.out.println("");
		
		// Referencia a métodos
		personas.sort(Persona::compararPorEdad);
		System.out.println("MÉTODO 3");
		System.out.println(personas);
		System.out.println("");
		
		
		/*
		 * OTROS TIPOS DE REFERENCIAS A MÉTODOS
		 * 
		 */
		
		// Referencia a un método de instancia de un objeto en particular
		
		ComparadorPersonas comparadorPersonas = new ComparadorPersonas();
		personas.sort(comparadorPersonas::compararPorNombre);
		System.out.println("PERSONAS ORDENADAS POR NOMBRE");
		System.out.println(personas);
		System.out.println("");
		
		
		// Dos ejemplos de referencia a un método de instancia de 
		// un objeto arbitrario de un tipo particular
		List<String> nombres = personas.stream()
										.map(Persona::getNombre)
										.collect(Collectors.toList());
		
		nombres.sort(String::compareToIgnoreCase);
		System.out.println("NOMBRE ORDENADOS");
		System.out.println(nombres);
		System.out.println("");
		
		// Referencia a un constructor
		
		List<Estudiante> estudiantes = personas.stream()
			.filter(p -> p.getEdad() <= 18)
			.map(p -> p.getNombre())
			.map(Estudiante::new)
			.collect(Collectors.toList());
		
		estudiantes.forEach(System.out::println);
		//estudiantes.forEach(e -> System.out.println(e));
			
		System.out.println("");
		

	}

}
