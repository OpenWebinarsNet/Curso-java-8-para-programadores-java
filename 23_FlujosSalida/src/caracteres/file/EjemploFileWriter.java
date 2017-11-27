/**
 * 
 */
package caracteres.file;

import java.io.FileWriter;
import java.io.IOException;

/**
 * @author Openwebinars
 *
 */
public class EjemploFileWriter {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		FileWriter fw = null;
		String intro = "En un lugar de La Mancha, de cuyo nombre no quiero acordarme";
		
		try {
			fw = new FileWriter("introquijote.txt");
			for(char c : intro.toCharArray())
				fw.write(c);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (fw != null)
				try {
					fw.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
		}

	}

}
