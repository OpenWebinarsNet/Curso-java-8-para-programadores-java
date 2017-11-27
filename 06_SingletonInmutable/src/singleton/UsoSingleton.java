/**
 * EJEMPLO DE USO DE UNA CLASE SINGLETON
 */
package singleton;

/**
 * @author Openwebinars
 *
 */
public class UsoSingleton {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//No podemos instanciar directamente
		//MiServicioSingleton ser1 = new MiServicioSingleton();
		
		//Creamos dos referencias, pero una sola instancia
		MiServicioSingleton ser2 = MiServicioSingleton.getInstance();
		MiServicioSingleton ser3 = MiServicioSingleton.getInstance();
		
		//Podemos comprobar que la dirección de memoria es la misma
		System.out.println(ser2);
		System.out.println(ser3);
		
		//Si cambiamos un atributo a través de una referencia
		ser2.setUnAtributo("Hola");
		//Podemos visualizarlo desde la otra.
		System.out.println(ser3.getUnAtributo());
		

	}

}
