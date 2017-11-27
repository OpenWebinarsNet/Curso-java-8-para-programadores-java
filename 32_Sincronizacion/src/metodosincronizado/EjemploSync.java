/**
 * EJEMPLO DE COMO DOS HILOS PUEDEN INTERFERIR
 */
package metodosincronizado;

/**
 * @author Openwebinars
 *
 */
public class EjemploSync {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//Contador compartido y sincronizado
		SyncCounter c = new SyncCounter();

		//También podemos tener diferentes resultados, pero
		//nos aseguramos de que ninguno va a ser inconsistente.
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
