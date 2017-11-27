/**
 * 
 */
package supplier;

import java.util.function.Supplier;

/**
 * @author Openwebinars
 *
 */
public class EjemploSupplier {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Supplier<Item> supplier = Item::new;
		Item item = supplier.get();
		System.out.println(item.getMsg());

		Supplier<String> supplier2 = Item::getStaticVal;
		String valor = supplier2.get();
		System.out.println("Llamada a método estático: " + valor);

		Supplier<String> supplier3 = () -> { return new String("Hola Mundo!"); };
		//Supplier<String> supplier3 = () -> "Hola Mundo!";
		valor = supplier3.get();
		System.out.println("Obtención de un valor nuevo: " + valor);
		

		

	}

}
