package nuevos;

@FunctionalInterface
public interface MiInterfaz {
	
	void print(String str);
	
	boolean equals(Object o);
	
	default void defecto() {
		System.out.println("Método con implementación por defecto");
	}
	
	static void estatico() {
		System.out.println("Método estático");
	}

}
