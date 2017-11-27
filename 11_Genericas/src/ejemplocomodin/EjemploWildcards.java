/**
 * 
 */
package ejemplocomodin;

import java.util.Arrays;
import java.util.List;

/**
 * @author Openwebinars
 *
 */
public class EjemploWildcards {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<Integer> listaEntera = Arrays.asList(1, 2, 3, 4, 5);
		System.out.printf("La suma de la lista entera es %.0f %n%n", sumOfList(listaEntera));
		
		List<Float> listaReal = Arrays.asList(0.5f, 1.5f, 2.5f, 3.4f, 4.3f);
		System.out.printf("La suma de la lista real es %.2f %n%n", sumOfList(listaReal));
		
	}
	
	public static double sumOfList(List<? extends Number> list) {
	    double s = 0.0;
	    for (Number n : list)
	        s += n.doubleValue();
	    return s;
	}

}
