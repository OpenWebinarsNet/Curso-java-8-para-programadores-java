/**
 * EJEMPLO DE COMO DOS HILOS PUEDEN INTERFERIR
 */
package interferencia;

/**
 * @author Openwebinars
 *
 */
public class EjemploInterferencia {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//Contador compartido
		Counter c = new Counter();
		
		//Diferentes ejecuciones de estos dos hilos, nos podrán dar
		//diferentes resultados: 1, 2, 1, 0; 1, 1, 1, 0; 1, 1, 0, 0;....
		new Thread(() -> {
			c.incrementar();
			System.out.println("Incrementrado en uno: " + c.valor());
			c.incrementar();
			System.out.println("Incrementrado en uno: " + c.valor());
		}).start();
		

		new Thread(() -> {
			c.decrementar();
			System.out.println("Decrementado en uno: " + c.valor());
			c.decrementar();
			System.out.println("Decrementado en uno: " + c.valor());
		}).start();

	}

}
