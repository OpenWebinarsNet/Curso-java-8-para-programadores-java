package service;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.TreeMap;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import model.RegistroDatos;
import model.TemperaturaHora;
import util.Temperatura;

public class ServicioClimatologia {

	List<RegistroDatos> datos;

	public ServicioClimatologia(List<RegistroDatos> datos) {
		this.datos = datos;
	}

	/*
	 * Método que devuelve las temperaturas máximas agrupadas por provincia
	 */
	public Map<String, Optional<TemperaturaHora>> temperaturaMaximaProvincias() {
		return temperaturaMaxOMinProvincias(Temperatura.MAXIMA);
	}

	/*
	 * Método que devuelve las temperaturas mínimas agrupadas por provincia
	 */

	public Map<String, Optional<TemperaturaHora>> temperaturaMinimaProvincias() {
		return temperaturaMaxOMinProvincias(Temperatura.MINIMA);
	}

	/*
	 * Método auxiliar, que utilizan las dos anteriores, que sirva para realizar
	 * el agrupamiento, según si es escoge máximo o mínimo.
	 */
	private Map<String, Optional<TemperaturaHora>> temperaturaMaxOMinProvincias(Temperatura tipo) {
		// Utilizamos el operador ternario para construir el collector.
		Collector<RegistroDatos, ?, Optional<TemperaturaHora>> c = (tipo == Temperatura.MAXIMA)
				? Collectors.mapping(RegistroDatos::getMaxima,
						Collectors.maxBy((m1, m2) -> Float.compare(m1.getTemperatura(), m2.getTemperatura())))
				: Collectors.mapping(RegistroDatos::getMinima,
						Collectors.minBy((m1, m2) -> Float.compare(m1.getTemperatura(), m2.getTemperatura())));
		// Usamos el colector para agrupar		
		return datos.stream().collect(Collectors.groupingBy(RegistroDatos::getProvincia, c));
	}

	/*
	 * Método que calcula las temperaturas medias agrupadas por provincia
	 */
	public Map<String, Double> temperaturaMediaProvincias() {

		
		return datos.stream()
				.collect(Collectors.toMap(Function.identity(),
						(RegistroDatos r) -> (r.getMaxima().getTemperatura() + r.getMinima().getTemperatura()) / 2))
				.entrySet().stream()
				.collect(Collectors.groupingBy((Map.Entry<RegistroDatos, Float> r) -> r.getKey().getProvincia(),
						TreeMap::new,
						Collectors.averagingDouble(((Map.Entry<RegistroDatos, Float> r) -> r.getValue()))));

	}

	/*
	 * Método que filtra los datos para obtener los de una provincia en particular
	 */
	public List<RegistroDatos> datosProvincia(String provincia) {

		return datos.stream().filter(p -> p.getProvincia().equalsIgnoreCase(provincia)).collect(Collectors.toList());
	}

	/*
	 * Método que obtiene la temperatura máxima total
	 */
	public Optional<RegistroDatos> maximaTotal() {

		return datos.stream()
				.max((r1, r2) -> Float.compare(r1.getMaxima().getTemperatura(), r2.getMaxima().getTemperatura()));

	}

	/*
	 * Método que obtiene la temperatura mínima total
	 */
	public Optional<RegistroDatos> minimaTotal() {

		return datos.stream()
				.min((r1, r2) -> Float.compare(r1.getMinima().getTemperatura(), r2.getMinima().getTemperatura()));

	}

}
