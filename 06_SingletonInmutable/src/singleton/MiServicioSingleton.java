/**
 * Ejemplo de un Servicio que implementa el patrón Singleton
 */

package singleton;

/**
 * @author Openwebinars
 *
 */
public class MiServicioSingleton {
	
	private String unAtributo;
	
	//Una instancia del objeto que va a existir
	private static MiServicioSingleton instance = null;
	
	//Evitamos así la instanciación directa
	private MiServicioSingleton() {	}
	
	public static MiServicioSingleton getInstance() {
		if (instance == null)
			instance = new MiServicioSingleton();
		
		return instance;
	}

	public String getUnAtributo() {
		return unAtributo;
	}

	public void setUnAtributo(String unAtributo) {
		this.unAtributo = unAtributo;
	}

	
	

}
