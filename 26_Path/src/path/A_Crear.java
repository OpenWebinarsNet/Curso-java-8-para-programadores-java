/**
 * 
 */
package path;

import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * @author Openwebinars
 *
 */
public class A_Crear {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Path p1 = Paths.get("java", "temario.txt");
		Path p2 = FileSystems.getDefault().getPath("java", "temario.txt");
		Path p3 = Paths.get(System.getProperty("user.home"),"documents", "java", "temario.txt");
		
		System.out.println(p1.toAbsolutePath().toString());
		System.out.println(p2.toAbsolutePath().toString());
		System.out.println(p3.toAbsolutePath().toString());

	}

}
