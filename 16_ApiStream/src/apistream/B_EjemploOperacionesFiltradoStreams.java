/**
 * 
 */
package apistream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * @author Openwebinars
 *
 */
public class B_EjemploOperacionesFiltradoStreams {

	/**
	 * @param args
	 */
	@SuppressWarnings("unused")
	public static void main(String[] args) {

		List<String> capitales = Arrays.asList("Jaén", "Córdoba", "Sevilla", "Huelva", "Cádiz", "Málaga", "Granada",
				"Almería");

		// Obtenemos un stream con todas las capitales de Andalucía que empiezan por C
		Stream<String> capitalesConC = capitales.stream().filter(s -> s.startsWith("C"));

		List<String> capitalesRepetidas = Arrays.asList("Sevilla", "Huelva", "Sevilla");
		// Obtenemos un stream con todas las capitales sin repetir.
		Stream<String> capitalesSinRepetir = capitalesRepetidas.stream().distinct();

		// Obtenemos un stream cuyo tamaño no es mayor que un número
		Stream<String> primerasCincoCapitales = capitales.stream().limit(5);

		// Obtenemos un stream que descarta una serie de elementos iniciales
		Stream<String> ultimasCuatroCapitales = capitales.stream().skip(4);

	}

}
