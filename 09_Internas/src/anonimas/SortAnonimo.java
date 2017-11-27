/**
 * OTRO EJEMPLO DE CLASE ANÓNIMA, PARA MODIFICAR EL ORDEN NATURAL DE LOS NÚMEROS
 */
package anonimas;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * @author Openwebinars
 *
 */
public class SortAnonimo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		List<Integer> listaNumeros = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

		//Orden inverso a través de una clase anónima
		listaNumeros.sort(new Comparator<Integer>() {

			@Override
			public int compare(Integer arg0, Integer arg1) {
				return -arg0.compareTo(arg1);
			}
			
		});

		for(Integer i : listaNumeros)
			System.out.print(i + " ");
		
	}

}
