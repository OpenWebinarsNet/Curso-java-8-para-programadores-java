/**
 * 
 */
package ejemploclasefinal;

/**
 * @author Openwebinars
 *
 */
public final class Cuadrado extends Rectangulo{

	public Cuadrado(float lado) {
		super(lado, lado);
	}
	
	public float getLado() {
		return getBase();
	}
	
	public void setLado(float lado) {
		setBase(lado);
		setAltura(lado);
	}
	
	public float getArea() {
		System.out.println("Area de un cuadrado");
		return getBase()*getBase();
	}
	
	public float getPerimetro() {
		System.out.println("Perimetro de un cuadrado");
		return getBase()*4;
	}

	@Override
	public String toString() {
		return "Cuadrado [lado=" + getLado() + "]";
	}
	
	

}
