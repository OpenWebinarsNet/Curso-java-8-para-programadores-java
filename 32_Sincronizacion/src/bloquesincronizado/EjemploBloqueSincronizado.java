/**
 * 
 */
package bloquesincronizado;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.stream.IntStream;

/**
 * @author Openwebinars
 *
 */
public class EjemploBloqueSincronizado {
		
	/**
	 * @param args
	 */
	
	private int count = 0;
	
	public void increment() {
		synchronized(this) {
			count++;
		}
	}
	
	public int get() {
		synchronized(this) {
			return count;
		}
	}
	
	
	public static void main(String[] args) throws InterruptedException {
		
		
		ExecutorService executor = Executors.newFixedThreadPool(2);
		EjemploBloqueSincronizado sync = new EjemploBloqueSincronizado();
		
		IntStream
			.range(0, 10000)
			.forEach(i -> executor.submit(sync::increment));
		
		executor.shutdown();
		executor.awaitTermination(10, TimeUnit.SECONDS);
		
		System.out.println(sync.get());


	}
	
	
	

}
