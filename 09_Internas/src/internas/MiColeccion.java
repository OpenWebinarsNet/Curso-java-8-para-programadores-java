/**
 * EJEMPLO DE USO DE UNA CLASE INTERNA, PARA CREAR
 * UNA COLECCIÓN CON UN ITERADOR
 */
package internas;

/**
 * @author Openwebinars
 *
 */
public class MiColeccion {
	
	private final static int TAM = 15;
	private int[] array = new int[TAM];
	
	
	public MiColeccion() {
		for(int i = 0; i < TAM; i++)
			array[i] = i+1;
	}
	
	public void imprimirPares() {
		IteradorPares iter = this.new IteradorPares();
		
		while(iter.hasNext())
			System.out.print(iter.getNext() + " ");
	}
	
	// Iterador de posiciones pares
	private class IteradorPares {
		
		private int siguiente = 0;
		
		public boolean hasNext() {
			//indica si hay más elementos en el array
			return (siguiente <= TAM - 1);
		}
		
		public int getNext() {
			int val = array[siguiente];
			siguiente += 2;
			return val;
		}
		
	}

}
