/**
 * LA CODIFICACIÓN CÉSAR ES AQUELLA QUE TRANSFORMA UN MENSAJE, CAMBIANDO CADA LETRA
 * POR AQUELLA QUE OCUPA 3 POSICIONES DESPUÉS EN EL ABECEDARIO.
 * ESTE PROGRAMA IMPLEMENTA DICHA CODIFICACIÓN, TRANSFORMANDO UN FICHERO DE TEXTO.
 */
package caracteres.codificador;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author Openwebinars
 *
 */
public class CodificadorCesar {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		final int OFFSET = 3;

		BufferedReader br = null;
		BufferedWriter bw = null;

		try {
			br = new BufferedReader(new FileReader("mensaje.txt"));
			bw = new BufferedWriter(new FileWriter("mensaje_cifrado.txt"));

			String linea = null;

			while ((linea = br.readLine()) != null) {
				StringBuilder sb = new StringBuilder(linea.length());
				for (char c : linea.toUpperCase().toCharArray()) {
					char result;
					if (Character.isLetter(c)) {
						int intValue = (int) c - 'A';
						int intResult = (intValue + OFFSET) % 26;
						result = (char) ('A' + intResult);
					}
					else
						result = c;
					sb.append(result);
				}
				bw.write(sb.toString());
				bw.newLine();

			}
			System.out.println("El mensaje ha sido cifrado correctamente");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (br != null)
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			if (bw != null)
				try {
					bw.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
		}

	}

}
