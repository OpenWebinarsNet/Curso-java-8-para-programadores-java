/**
 * Clase que extiende a una clase abstracta
 */
package ejemploabstract;


/**
 * @author Openwebinars
 *
 */
public class Circulo extends ObjectoGrafico  {
	
	private int radio;
	
	public Circulo(int x, int y, int radio) {
		this.x = x;
		this.y = y;
		this.radio = radio;
	}

	@Override
	public void dibujar() {
		System.out.println(this);
	}

	@Override
	public void cambiarTamanio(int factorAumento) {
		this.radio *= factorAumento;
		
	}

	@Override
	public String toString() {
		return "Circulo [radio=" + radio + ", x=" + x + ", y=" + y + "]";
	}

	
	
	

}
