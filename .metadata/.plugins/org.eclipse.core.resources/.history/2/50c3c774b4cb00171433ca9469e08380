/**
 * EJEMPLO DE USO DE CLASES ANIDADAS ESTÁTICAS Y NO ESTÁTICAS
 */
package anidadas;

/**
 * @author Openwebinars
 *
 */
public class EjemploExternaAnidada {

	/**
	 * @param args
	 */
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		//Podemos instanciar AnidadaEstatica sin necesidad de tener
		//una instancia de Externa
		Externa.AnidadaEstatica ie = new Externa.AnidadaEstatica("Hola");
		
		
		//No podemos hacer esta instanciación así
		//Externa.Interna i = new Externa.Interna("Mundo");
		
		//Estas son las dos formas de instanciar una clase
		//anidada NO estática
		//Creando primero la instancia externa
		Externa e = new Externa(1);
		//Y usándola para crear la anidada
		Externa.Anidada i = e.new Anidada("Mundo");
		//Creando ambas instancias a la vez
		Externa.Anidada i2 = new Externa(2).new Anidada("Mundo");
		
		
		System.out.println(i.getN());
		System.out.println(i2.getN());

	}

}
