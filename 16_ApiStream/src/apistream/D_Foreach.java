/**
 * 
 */
package apistream;

import java.util.Arrays;
import java.util.List;

/**
 * @author Openwebinars
 *
 */
public class D_Foreach {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		List<String> capitales = Arrays.asList("Jaén", "Córdoba", "Sevilla", "Huelva", "Cádiz", "Málaga", "Granada",
				"Almería");

		// Obtenemos un stream con todas las capitales de Andalucía que empiezan por C
		System.out.println("CAPITALES DE ANDALUCÍA QUE EMPIEZAN POR C");
		capitales
			.stream()
			.filter(s -> s.startsWith("C"))
			.forEachOrdered(System.out::println);
		System.out.println("");
		
		System.out.println("ALGUNAS CAPITALES DE ANDALUCÍA SIN REPETIR");
		List<String> capitalesRepetidas = Arrays.asList("Sevilla", "Huelva", "Sevilla");
		// Obtenemos un stream con todas las capitales sin repetir.
		capitalesRepetidas
			.stream()
			.distinct()
			.forEach(System.out::println);
		System.out.println();
		
		// Obtenemos un stream cuyo tamaño no es mayor que un número
		System.out.println("LAS 5 PRIMERAS CAPITALES DE ANDALUCÍA");
		capitales
			.stream()
			.limit(5)
			.forEachOrdered(System.out::println);
		System.out.println("");
		
		// Obtenemos un stream que descarta una serie de elementos iniciales
		System.out.println("LAS ÚLTIMAS CAPITALES DE ANDALUCÍA");
		capitales
			.stream()
			.skip(4)
			.forEach(System.out::println);
		System.out.println("");
		
		// Obtenemos todas las capitales en mayúsculas
		System.out.println("LAS CAPITALES DE ANDALUCÍA EN MAYÚSCULA");
		capitales
			.stream()
			.map(String::toUpperCase)
			.forEach(System.out::println);
		System.out.println("");
		
		// Obtenemos las longitudes en caracteres de todas las capitales
		System.out.println("LA LONGITUD EN CARACTERES DE TODAS LAS CAPITALES DE ANDALUCÍA");
		capitales
			.stream()
			.mapToInt(String::length)
			.forEach(System.out::println);
		System.out.println();
		
		// Obtenemos las longitudes en caracteres de todas las capitales
		// en un formato más adecuado
		System.out.println("LA LONGITUD EN CARACTERES DE TODAS LAS CAPITALES DE ANDALUCÍA");
		capitales
			.stream()
			.map((s) -> String.format("%s (%d caracteres)", s, s.length()))
			.forEach(System.out::println);

		
		
	}

}
