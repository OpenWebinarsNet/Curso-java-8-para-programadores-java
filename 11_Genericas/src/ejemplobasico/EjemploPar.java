/**
 * EJEMPLO DE USO DE UNA CLASE GENÉRICA
 */
package ejemplobasico;

/**
 * @author Openwebinars
 *
 */
public class EjemploPar {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Par<Integer, String> pareja1 = new Par<>(1, "UNO");
		
		System.out.println(pareja1);
		
		//pareja1.setObj1("UNO"); //Error de compilación
		
		Par<String, String> pareja2 = new Par<>("Hola", "Mundo");
		
		System.out.println(pareja2);

	}

}
