package herencia.composicion;

/**
 * 
 * @author Openwebinars
 *
 */
public class EjemploComposicion {

	public static void main(String[] args) {
		Provincia sevilla = new Provincia("Sevilla");
		
		sevilla.getMunicipios().add(new Municipio("Sevilla", 690576));
		sevilla.getMunicipios().add(new Municipio("Dos Hermanas", 131855));
		sevilla.getMunicipios().add(new Municipio("Mairena del Aljarafe", 45040));
		
		System.out.println(sevilla);

	}

}
