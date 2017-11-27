/**
 * EJEMPLO DE GENÉRICO CON TIPO "BOUNDED"
 */
package ejemplobounded;

/**
 * @author Openwebinars
 *
 */
public class EjemploBounded {

	/**
	 * @param args
	 */
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		NumericBox<Integer> integerBox = new NumericBox<>(1);
		
		NumericBox<Float> realBox = new NumericBox<>(2.3f);
		
		//Esta sentencia produce error, aunque sea una clase genérica
		//NumericBox<String> stringBox = new NumericBox<>("¿Se puede?");

	}

}
