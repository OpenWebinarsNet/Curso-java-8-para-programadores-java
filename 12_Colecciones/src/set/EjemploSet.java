/**
 * 
 */
package set;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

import modelo.Persona;

/**
 * @author Openwebinars
 *
 */
public class EjemploSet {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Set<Persona> juntaDirectiva = new HashSet<>();
		//Set<Persona> juntaDirectiva = new TreeSet<>(); //Para ordenar, Persona debe implementar Comparable
		//Set<Persona> juntaDirectiva = new LinkedHashSet<>();
		
		
		juntaDirectiva.add(new Persona("12345678A", "Pepe", "Perez", LocalDate.of(1990, 1, 2)));
		juntaDirectiva.add(new Persona("23456789B", "Juan", "Martínez", LocalDate.of(1991, 2, 3)));
		juntaDirectiva.add(new Persona("34567890C", "Ana", "Ramírez", LocalDate.of(1992, 3, 4)));
		juntaDirectiva.add(new Persona("45678901D", "María", "López", LocalDate.of(1993, 4, 5)));
		
		//Si tratamos de añadir un elemento repetido...
		juntaDirectiva.add(new Persona("45678901D", "María", "López", LocalDate.of(1993, 4, 5)));
		
		//Comprobamos que al listarlos todos, no aparece duplicado
		for(Persona p : juntaDirectiva)
			System.out.println(p);
		
		
	}

}
