/**
 * 
 */
package nioapistream;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.TreeMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author Openwebinars
 *
 */
public class C_Walk {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Path start = Paths.get(System.getProperty("user.home"), "ejemplo");
		int maxDepth = 5;
		try (Stream<Path> stream = Files.walk(start, maxDepth)) {
			TreeMap<String, Long> groupByExtension =
					stream
						.filter(Files::isRegularFile)				
						.sorted()
						.collect(Collectors.groupingBy(C_Walk::getExtension, TreeMap::new, Collectors.counting()));
			
			groupByExtension.forEach((k, v) -> System.out.printf("%s -> %d ficheros%n", k, v));
			
				
		} catch (IOException ex) {
			ex.printStackTrace();
		}

	}
	
	public static String getExtension(Path p) {
		String extension = "";
		String fileName = p.getFileName().toString();

		int i = fileName.lastIndexOf('.');
		if (i >= 0) {
		    extension = fileName.substring(i);
		}
		return extension;
	}

}
