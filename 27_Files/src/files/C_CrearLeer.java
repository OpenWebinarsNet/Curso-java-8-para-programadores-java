/**
 * 
 */
package files;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

/**
 * @author Openwebinars
 *
 */
public class C_CrearLeer {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		
		
		try {
			Path p = Paths.get("files", "quijote.txt");
			Path p2 = Paths.get("files", "quijote2.txt");
			if (Files.exists(p)) {
				
				BufferedWriter bw = Files.newBufferedWriter(p2, Charset.forName("UTF-8"));
				
				//El Charset del fichero debe ser UTF-8
				List<String> lineas = Files.readAllLines(p);
				lineas.forEach((s) ->{
					try {
						bw.write(s);
						bw.newLine();
					} catch (IOException e) {
						e.printStackTrace();
					}
					System.out.println(s);
				});
				
				bw.close();
			}

		} catch (IOException e) {			
			e.printStackTrace();
		} 

	}

}
