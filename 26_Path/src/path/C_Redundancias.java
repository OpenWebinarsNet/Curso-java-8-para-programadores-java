/**
 * 
 */
package path;

import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * @author Openwebinars
 *
 */
public class C_Redundancias {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Path path = Paths.get(System.getProperty("user.home"),"documents", "java", "..", "..", "temario.txt");		
		System.out.println(path.toString());
		
		Path normalized = path.normalize();
		System.out.println(normalized.toString());
		

	}

}
