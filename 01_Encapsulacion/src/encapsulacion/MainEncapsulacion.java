/**
 * 
 */
package encapsulacion;

import java.time.LocalDate;

import encapsulacion.modelo.Persona;
import encapsulacion.servicio.Servicio;
import encapsulacion.utilidad.UtilsDni;

/**
 * @author Openwebinars
 *
 */
public class MainEncapsulacion {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Persona p = new Persona("12345678A", "Pepe", "Perez", LocalDate.of(1980,1,1));
		
		Servicio s = new Servicio();
		
		s.addPersona(p);
		
		for(Persona per : s.listarTodasPersonas()) {
			System.out.print(per);
			if (UtilsDni.verificarLetraDni(p.getDni())) {
				System.out.println(" Su DNI es correcto");
			} else {
				System.out.println(" Su DNI es incorrecto");
			}
		}
		
		

	}

}
