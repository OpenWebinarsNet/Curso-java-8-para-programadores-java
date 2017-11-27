/**
 * 
 */
package bytes.fileoutput;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/**
 * @author Openwebinars
 *
 */
public class EjemploFileOutputStream {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		OutputStream fOut = null;
		
		try {
			fOut = new FileOutputStream("primero.dat");
			for(int i = 0; i < 1000; i++) {
				fOut.write(i);
			}			
		} catch (FileNotFoundException e) {			
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (fOut != null)
				try {
					fOut.close();
				} catch (IOException e) {					
					e.printStackTrace();
				}
		}
		
		

	}

}
