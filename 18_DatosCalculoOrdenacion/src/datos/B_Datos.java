/**
 * 
 */
package datos;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

/**
 * @author Openwebinars
 *
 */
public class B_Datos {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		double array[] = generarArrayAleatorio();

		// Conocemos el array
		System.out.println(Arrays.toString(array));

		System.out.println("El número de elementos del stream: " + Arrays.stream(array).count());

		// Cálculo del máximo y mínimo
		double maximo = Arrays.stream(array).max().orElse(0);
		double minimo = Arrays.stream(array).min().orElse(0);

		System.out.printf("El valor máximo es %.2f y el mínimo %.2f%n", maximo, minimo);

		double suma = Arrays.stream(array).sum();
		System.out.println("La suma de todos los elementos del array es: " + suma);

		// Uso del cálculo del máximo y mínimo en otro tipo de clases
		List<String> listaPalabrasLargas = Arrays.asList("Arteriosclerosis", "Bioelectromagnetismo", "Ciclopentanoperhidrofenantreno",
				"Magnetoencefalografía", "Neurorretroalimentación");
		
		String palabraMaxima = listaPalabrasLargas.stream().max((s1, s2) -> s1.length()-s2.length()).get();
		
		System.out.println("La palabra más larga de la lista es " + palabraMaxima);

	}

	public static double[] generarArrayAleatorio() {
		return new Random().doubles(100, 0, 1000).toArray();
	}

}
