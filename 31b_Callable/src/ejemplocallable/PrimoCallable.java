/**
 * 
 */
package ejemplocallable;

import java.util.concurrent.Callable;

/**
 * @author Openwebinars
 *
 */
public class PrimoCallable implements Callable<Long> {

	private long minimo;

	public PrimoCallable(long minimo) {
		this.minimo = minimo;
	}

	@Override
	public Long call() throws Exception {
		long n = minimo;
		System.out.println("Comenzamos a buscar un número primo");
		while(!testPrimalidad(n)) { 
			System.out.printf("%d no es primo %n", n);
			++n;
		}
		return n;
	}
	
	/*
	 * Método que nos permite verificar si un número es
	 * primo revisando si tiene divisores hasta n/2
	 * OJO es fácil de implementar, pero ineficiente para 
	 * números grandes
	 */
	public static boolean testPrimalidad(long n) {
		
		boolean continuar = true;
		boolean esPrimo = true;
		long divisor = 2;
		do {
			if (n % divisor == 0) {
				continuar = false;
				esPrimo = false;
			} else
				++divisor;			
				
		} while (continuar && divisor <= (n/2));
		
		return esPrimo;
	}

}
