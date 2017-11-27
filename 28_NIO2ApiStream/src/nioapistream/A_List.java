package nioapistream;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

/**
 * 
 */

/**
 * @author Openwebinars
 *
 */
public class A_List {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try (Stream<Path> stream = Files.list(Paths.get(System.getProperty("user.home"),"ejemplo"))) {
		    stream
		        .map(String::valueOf)
		        .filter(path -> !path.startsWith("."))
		        .sorted()
		        .forEach(System.out::println);
		} catch (IOException e) {			
			e.printStackTrace();
		} 

	}

}
