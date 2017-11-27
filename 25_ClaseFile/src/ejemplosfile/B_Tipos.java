/**
 * Verificar si un File corresponde a un fichero, o un directorio
 */
package ejemplosfile;

import java.io.File;

/**
 * @author Openwebinars
 *
 */
public class B_Tipos {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		File f = new File("./", "nuevo.txt");
		//File f = new File("./");
		
		if (f.isFile()) 
			System.out.println("Es un fichero");
		else if (f.isDirectory())
			System.out.println("Es un directorio");
		else
			System.out.println("No es ni un fichero ni un directorio");

	}

}
