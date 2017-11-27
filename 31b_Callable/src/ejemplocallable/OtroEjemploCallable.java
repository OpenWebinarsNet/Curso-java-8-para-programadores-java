/**
 * USO DE OTRO TIPO DE EJECUTOR
 */
package ejemplocallable;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * @author Openwebinars
 *
 */
public class OtroEjemploCallable {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Creamos nuestro ejecutor
		ExecutorService executor = Executors.newFixedThreadPool(3);

		// Como tenemos varios hilos de ejecución, se solapa la ejecución
		// de ambas tareas
		Future<Long> f1 = executor.submit(new PrimoCallable(1234585676));
		Future<Long> f2 = executor.submit(new PrimoCallable(123));
		try {
			System.out.println(f1.get());
			System.out.println(f2.get());
		} catch (InterruptedException | ExecutionException e) {
			e.printStackTrace();
		}
		// Este método espera a que terminen las tareas enviadas, y posteriormente
		// destruye el ejecutor.
		executor.shutdown();

	}

}
