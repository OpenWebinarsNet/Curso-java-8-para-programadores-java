/**
 * 
 */
package bytes.fileinput;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @author Openwebinars
 *
 */
public class EjemploFileInputStream {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		FileInputStream fIn = null;
		
		try {
			fIn = new FileInputStream("primero.dat");
			int c;
			while ((c = fIn.read()) != -1) 
				System.out.println(c);
		} catch (FileNotFoundException e) {			
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (fIn != null)
				try {
					fIn.close();
				} catch (IOException e) {					
					e.printStackTrace();
				}
		}
		
		

	}

}
