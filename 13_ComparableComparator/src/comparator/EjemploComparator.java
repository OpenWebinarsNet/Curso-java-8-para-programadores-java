/**
 * 
 */
package comparator;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import comparable.Persona;

/**
 * @author Openwebinars
 *
 */
public class EjemploComparator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<Persona> listaPersonas = new ArrayList<>();

		listaPersonas.add(new Persona("12345678A", "Pepe", "Perez", LocalDate.of(1990, 1, 2)));
		listaPersonas.add(new Persona("23456789B", "Juan", "Martínez", LocalDate.of(1981, 2, 3)));
		listaPersonas.add(new Persona("34567890C", "Ana", "Ramírez", LocalDate.of(1972, 3, 4)));
		listaPersonas.add(new Persona("45678901D", "María", "López", LocalDate.of(1993, 4, 5)));

		//Ordenamos de más jóven a más viejo
		listaPersonas.sort(new Comparator<Persona>() {

			@Override
			public int compare(Persona o1, Persona o2) {
				return -o1.compareTo(o2);
			}
			
		});
		
		System.out.println("Lista de personas, ordenadas de más joven a mayor edad");
		for(Persona p : listaPersonas)
			System.out.println(p);
		
		//Y ahora, ordenamos alfabéticamente por apellido 
		listaPersonas.sort(new Comparator<Persona>() {

			@Override
			public int compare(Persona o1, Persona o2) {
				return o1.getApellidos().compareTo(o2.getApellidos());
			}
			
		});
		
		System.out.println("Lista de personas, ordenadas alfabéticamente por apellido");
		for(Persona p : listaPersonas)
			System.out.println(p);

	}

}
