/**
 * ESTA CLASE IMPRIME POR CONSOLA UN NÚMERO PRIMO MAYOR QUE EL NÚMERO
 * QUE SE LE HA PROPORCIONADO A TRAVÉS DEL CONSTRUCTOR
 */
package ejemplohilos;

/**
 * @author Openwebinars
 *
 */

public class PrimoThread extends Thread {

	private long minimo;
	
	public PrimoThread(long minimo) {
		this.minimo = minimo;
	}
	
	
	
	@Override
	public void run() {
		long n = minimo;
		while(!testPrimalidad(n)) {
			System.out.printf("(Mínimo: %d) %d no es primo %n", minimo, n);
			++n;
		}
		
		System.out.printf("El número primo es %d %n", n);
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
