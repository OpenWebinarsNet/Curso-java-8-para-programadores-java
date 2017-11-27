/**
 * 
 */
package ejemplorunnableanonimo;

/**
 * @author Openwebinars
 *
 */
public class EjemploRunnableAnonimo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//Este trozo de código puede ser muy común si
		//el proceso de lanzamiento del hilo está dentro
		//de un manejador de eventos, como el click de un
		//botón.
		new Thread(new Runnable() {

			@Override
			public void run() {
				System.out.println("Hello from Runnable+Thread!!");
				
			}
			
		}).start();
		
		//Este código es como el anterior, pero aprovecha la potencia
		//de las expresiones lambda.
		new Thread(() -> System.out.print("Hello from Lambda Runnable+Thread")).start();

	}

}
