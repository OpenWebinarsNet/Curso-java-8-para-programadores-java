/**
 * Listar el contenido de un directorio
 */
package ejemplosfile;

import java.io.File;
import java.util.Arrays;
import java.util.List;

/**
 * @author Openwebinars
 *
 */
public class C_ListarDirectorio {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		File f = new File("./", "nuevo.txt");
		
		if (f.isDirectory()) {
			//Manejando la lista como String[]
			System.out.println("Como lista de String");
			List<String> lista = Arrays.asList(f.list());
			lista.forEach(System.out::println);
			
			//Manejando la lista como File[]
			System.out.println("\nComo lista de File");
			List<File> listaFiles = Arrays.asList(f.listFiles());
//			listaFiles.forEach((file) -> { 
//				System.out.println(file.getName());
//			});
			listaFiles
				.stream()
				.map(File::getName)
				.forEach(System.out::println);
			
		} else {
			System.out.println("No es un directorio!!!");
		}
			

	}

}
