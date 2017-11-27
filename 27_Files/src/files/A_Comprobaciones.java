package files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * 
 */

/**
 * @author Openwebinars
 *
 */
public class A_Comprobaciones {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Path p = Paths.get("file.txt");

		if (Files.notExists(p)) {
			System.out.println("La ruta no existe");
			try {
				Files.createFile(p);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		if (Files.exists(p))
			System.out.println("La ruta sí existe");

		if (Files.notExists(p)) 
			System.out.println("La ruta no existe");

		if (Files.isRegularFile(p))
			System.out.println("El fichero " + p.toString() + " es regular");

		Path p2 = Paths.get("file.txt");

		try {
			if (Files.isSameFile(p, p2))
				System.out.println("Son el mismo fichero");
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
