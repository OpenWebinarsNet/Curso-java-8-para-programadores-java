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
public class D_Unir {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Path basePath = Paths.get(System.getProperty("user.home"),"documents", "java");
		Path file = Paths.get("temario.txt");
		
		Path complete = basePath.resolve(file);
		
		System.out.println(complete.toString());
		
		

	}

}
