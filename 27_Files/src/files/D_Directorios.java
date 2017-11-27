/**
 * 
 */
package files;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * @author Openwebinars
 *
 */
public class D_Directorios {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		
		
		Files.createDirectory(Paths.get("files", "subdir2"));
		
		DirectoryStream<Path> directoryStream = Files.newDirectoryStream(Paths.get("files"));
		
		for(Path p : directoryStream)
			System.out.println(p.getFileName());
		
	}

}
