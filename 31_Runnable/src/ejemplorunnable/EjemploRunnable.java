/**
 * 
 */
package ejemplorunnable;

/**
 * @author Openwebinars
 *
 */
public class EjemploRunnable {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//Creación y lanzamiento de PrimoRunnable
		//a través de un thread.
		Thread t = new Thread(new PrimoRunnable(12345));
		t.start();
		
		//Otra forma de hacerlo, a través de una 
		//instancia anónima
		new Thread(new PrimoRunnable(1234567)).start();

	}

}
