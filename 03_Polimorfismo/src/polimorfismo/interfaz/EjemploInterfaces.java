/**
 *  Ejemplo de polimorfismo, utilizando como tipos de las
 *  referencias algunas interfaces.
 */
package polimorfismo.interfaz;

/**
 * @author Openwebinars
 *
 */
public class EjemploInterfaces {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		ClaseQueImplementaInterfaz c1 = new ClaseQueImplementaInterfaz();
		c1.saludar("Hola Mundo");
		
		Hija c2 = new ClaseQueImplementaInterfaz();
		c2.saludar("Hola Mundo, otra vez");
		
		Base c3 = new ClaseQueImplementaInterfaz();
		c3.saludar("Hola Mundo, por tercera vez");

	}

}
