/**
 * 
 */
package variablesatomicas;

import java.util.concurrent.atomic.LongAdder;

/**
 * @author Openwebinars
 *
 */
public class OtroEjemploContadorAtomico {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		LongAdder longAdder = new LongAdder();
		
		new Thread(()->{
			longAdder.increment();
			longAdder.increment();
			System.out.println(longAdder.intValue());
		}).start();
		
		new Thread(()->{
			longAdder.decrement();
			longAdder.decrement();
			System.out.println(longAdder.intValue());
		}).start();		

	}

}
