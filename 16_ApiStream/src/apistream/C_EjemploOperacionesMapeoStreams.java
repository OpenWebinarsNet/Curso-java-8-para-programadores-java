/**
 * 
 */
package apistream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * @author Openwebinars
 *
 */
public class C_EjemploOperacionesMapeoStreams {

	/**
	 * @param args
	 */
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		List<String> capitales = Arrays.asList("Jaén", "Córdoba", "Sevilla", "Huelva", "Cádiz", "Málaga", "Granada",
				"Almería");
		
		// Obtenemos todas las capitales en mayúsculas
		Stream<String> capitalesEnMayus = 
				capitales
					.stream()
					.map(String::toUpperCase);
		
		// Obtenemos las longitudes en caracteres de todas las capitales
		IntStream longitudCapitales = 
				capitales
					.stream()
					.mapToInt(String::length);
		
		

	}

}
