/**
 * 
 */
package equals;

/**
 * @author Openwebinars
 *
 */
public class Coche {
	
	private String marca;
	private String modelo;
	private String motorizacion;
	
	
	public Coche(String marca, String modelo, String motorizacion) {
		this.marca = marca;
		this.modelo = modelo;
		this.motorizacion = motorizacion;
	}


	public String getMarca() {
		return marca;
	}


	public void setMarca(String marca) {
		this.marca = marca;
	}


	public String getModelo() {
		return modelo;
	}


	public void setModelo(String modelo) {
		this.modelo = modelo;
	}


	public String getMotorizacion() {
		return motorizacion;
	}


	public void setMotorizacion(String motorizacion) {
		this.motorizacion = motorizacion;
	}
	
	
	
	

}
