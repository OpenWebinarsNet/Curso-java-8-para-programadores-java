/**
 * EJEMPLO DE USO DE ENUMERACIONES
 */
package enumeraciones.comoclases;

/**
 * @author Openwebinars
 *
 */
public class EjemploPlanetas {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		double pesoEnLaTierra = 75.0;
        double masaEnLaTierra = pesoEnLaTierra/ Planeta.TIERRA.gravedadSuperficial();
        for (Planeta p : Planeta.values())
           System.out.printf("Tu peso en %s es %f%n", p, p.pesoEnLaSuperficie(masaEnLaTierra));
        

	}

}
