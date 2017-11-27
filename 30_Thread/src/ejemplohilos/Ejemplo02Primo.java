/**
 * EJEMPLO DE EJECUCIÓN DE VARIAS INSTANCIAS DE PRIMOTHREAD
 */
package ejemplohilos;

/**
 * @author Openwebinars
 *
 */
public class Ejemplo02Primo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//Las ejecuciones de los 3 hilos se pueden intercalar
		//Podemos "comprobarlo" en la salida de la consola
		
		PrimoThread pt01 = new PrimoThread(1234567);
		pt01.start();
		
		PrimoThread pt02 = new PrimoThread(23456789);
		pt02.start();
		
		PrimoThread pt03 = new PrimoThread(34567891);
		pt03.start();


	}

}
