/**
 * 
 */
package anidadas;

/**
 * @author Openwebinars
 *
 */
public class Externa {
	
	private int n;
	//private static int m;
	
	public Externa(int n) {
		this.n = n;
	}
	
	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}



	public class Anidada {
		
		private String s;

		public Anidada(String s) {
			this.s = s;
		}

		public String getS() {
			return s;
		}

		public void setS(String s) {
			this.s = s;
		}
		
		//Como clase anidada, puede acceder a los atributos de la 
		//clase externa.
		public int getN() {
			return n;
		}
		
		
		
	}
	
	public static class AnidadaEstatica {
		
		private String str;

		public AnidadaEstatica(String str) {
			this.str = str;
		}

		public String getStr() {
			return str;
		}

		public void setStr(String str) {
			this.str = str;
		}

		//Como clase interna estática, no puede acceder 
		//a los atributos de la clase externa.
		//a no ser que sean estáticos
//		public int getN() {
//			return n;
//		}
		
		
		
	}

}
