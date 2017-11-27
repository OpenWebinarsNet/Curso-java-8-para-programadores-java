/**
 * 
 */
package collectors;

import static java.util.stream.Collectors.*;

import java.util.Arrays;
import java.util.List;
import java.util.Map;



/**
 * @author Openwebinars
 *
 */
public class B_GroupByAndPartition {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		List<Empleado> empleados = Arrays.asList(
				new Empleado("Pepe", 30000, "Ventas"),
				new Empleado("Juan", 31000, "Ventas"),
				new Empleado("Antonio", 30000, "Compras"),
				new Empleado("María", 30000, "Compras"),
				new Empleado("Manuela", 34000, "Ejecutivo")				
				);
		
		Map<String, List<Empleado>> porDepartamento = 
				empleados
					.stream()
					.collect(groupingBy(Empleado::getDepartamento));
		
		System.out.println("EMPLEADOS AGRUPADOS POR DEPARTAMENTO");
		porDepartamento.forEach((k, v) -> {
			String strEmpleados = v.stream().map(e -> e.getNombre()).collect(joining(", "));
			System.out.printf("Departamento: %s | Empleados: %s %n", k, strEmpleados );
		});
		System.out.println("");
		
		
		// Se puede agrupar con otro collector, para obtener un valor en lugar de 
		// otra coleccion
		Map<String, Long> porDepartamentoCantidad = 
				empleados
					.stream()
					.collect(groupingBy(Empleado::getDepartamento, counting()));
		
		System.out.println("NÚMERO DE EMPLEADOS POR DEPARTAMENTO");
		porDepartamentoCantidad.forEach((k, v) -> System.out.printf("%s (%d empleados) %n", k, v));
		System.out.println();
//
//		// Podemos añadir dos niveles de agrupamiento
//		Map<String, Map<Double, List<Empleado>>> porDepartamentoYSalario = 
//				empleados
//					.stream()
//					.collect(groupingBy(Empleado::getDepartamento, groupingBy(Empleado::getSalario)));
//
//		System.out.println("EMPLEADOS AGRUPADOS POR DEPARTAMENTO Y SUELDO");
//		porDepartamentoYSalario.forEach((depar, v) -> {
//			System.out.printf("Departamento: %s%n", depar);
//			v.forEach((salario, emples) -> {
//				String strEmpleados = emples.stream().map(e -> e.getNombre()).collect(joining(", "));
//				System.out.printf("\tSalario: %.0f | Empleados: %s %n", salario, strEmpleados);
//			});
//		});
//		System.out.println("");
//		
//		
//		// Podemos particionar en dos grupos, según un predicado
		Map<Boolean, List<Empleado>> salarioMayorOIgualque32000 =
				empleados
					.stream()
					.collect(partitioningBy(e -> e.getSalario() >= 32000));
		
		System.out.println("EMPLEADOS AGRUPADOS POR EL CUMPLIMIENTO DE UNA FUNCIÓN");
		salarioMayorOIgualque32000.forEach((bool, v) -> {
			System.out.printf("Empleados con un salario " + 
								((bool) ? "mayor" : "menor") 
								+ " que 32000€: %s %n",v.stream().map(e -> e.getNombre()).collect(joining(", ")));
			
		});
		

	}

}
