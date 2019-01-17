package herencia.interfaces;

public interface ImprimiblePorConsola extends Imprimible {
	
	default public void printConsola(String s) {
		System.out.println(s);
	}

}
