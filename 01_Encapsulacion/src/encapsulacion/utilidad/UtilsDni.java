package encapsulacion.utilidad;

/**
 * 
 * @author Openwebinars
 *
 */
public class UtilsDni {

	/*
	 * El algoritmo está sacado de la wikipedia
	 * https://es.wikipedia.org/wiki/N%C3%BAmero_de_identificaci%C3%B3n_fiscal
	 */
	public static boolean verificarLetraDni(String nif) {

		String[] arrayLetrasNIF = { "T", "R", "W", "A", "G", "M", "Y", "F", "P", "D", "X", "B", "N", "J", "Z", "S", "Q",
				"V", "H", "L", "C", "K", "E" };

		nif = nif.toUpperCase();
		// Si el largo del NIF es diferente a 9, acaba el método.
		if (nif.length() != 9) {
			return false;
		}

		// Posición inicial: 0 (primero en la cadena de texto).
		// Longitud: cadena de texto menos última posición. Así obtenemos solo el
		// número.
		String numeroNIF = nif.substring(0, nif.length() - 1);

		// Para obtener la letra, nos situamos en la penúltima posición y contamos 1 de largo
		
		String letraNif = nif.substring(nif.length() - 1, nif.length());

		try {
			if (letraNif.equals(arrayLetrasNIF[Integer.parseInt(numeroNIF) % 23])) {
				return true;
			} else {
				return false;
			}
		} catch(Exception e) {
			return false;
		}
		

	}

}
