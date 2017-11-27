package datos;

import java.util.Arrays;
import java.util.OptionalInt;
import java.util.Random;

/**
 * 
 */

/**
 * @author Openwebinars
 *
 */
public class A_EjemploReduccion {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int[] array = generarArrayAleatorio();
		
		// Conozcamos el array
		System.out.println(Arrays.toString(array));
		
		// Reducimos el stream para quedarnos solamente con el máximo
		OptionalInt maximo = Arrays.stream(array).reduce(Integer::max);	

		String mensajeMaximo = maximo.isPresent() ?"El valor máximo es " + maximo.getAsInt() : "No hay valor máximo";
		System.out.println(mensajeMaximo);
		
		// En este caso, vamos a reducir el stream para quedarnos con la suma 
		int suma = Arrays.stream(array).reduce(0, (x, y) -> x+y);		
		System.out.println(suma);
	}
	
	public static int[] generarArrayAleatorio() {
		return new Random().ints(100, 0, 1000).toArray();
	}

}
