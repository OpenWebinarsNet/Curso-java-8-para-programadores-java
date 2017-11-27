/**
 * 
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
public class EjemploCallable {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//Creamos nuestro ejecutor
		ExecutorService executor = Executors.newSingleThreadExecutor();
		
		//Como solo dispone de un hilo, si enviamos dos tareas, la segunda
		//se ejecuta al terminar la primera
		Future<Long> f1 = executor.submit(new PrimoCallable(1234585676));
		Future<Long> f2 = executor.submit(new PrimoCallable(123));
		try {
			System.out.println(f1.get());
			System.out.println(f2.get());
		} catch (InterruptedException | ExecutionException e) {			
			e.printStackTrace();
		}
		
		//Si nos fijamos bien, la aplicación no finaliza cuando ha mostrado
		//por pantalla los dos primos. El ExecutorService se queda "disponible"
		//Podemos intentar "apagarlo" cuando ambas tareas hayan terminado
		
		//Este método espera a que terminen las tareas enviadas, y posteriormente
		//destruye el ejecutor.
		executor.shutdown();
		
		
		
		

	}

}
