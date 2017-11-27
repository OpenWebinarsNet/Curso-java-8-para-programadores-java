/**
 * 
 */
package files;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

/**
 * @author Openwebinars
 *
 */
public class B_CopiarBorrarMover {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		
		//Creamos una ruta para crear un fichero
		Path p = Paths.get("files", "fichero.txt");
		
		//Creamos un fichero, y abrimos el flujo de texto para escribir
		BufferedWriter bw = Files.newBufferedWriter(p);
		bw.write("Curso de Java 8 para programadores Java en www.openwebinars.net");
		bw.close();
		
		//Copiamos el fichero
		Path copia = Paths.get("files", "fichero_copiado.txt");
		Files.copy(p, copia, StandardCopyOption.REPLACE_EXISTING);
		
		//Lo movemos fuera del directorio
		Files.move(copia, Paths.get("files", "copiado.txt"), StandardCopyOption.REPLACE_EXISTING);
		
		//Lo eliminamos
		Files.deleteIfExists(Paths.get("files", "copiado.txt"));
		
		
		

	}

}
