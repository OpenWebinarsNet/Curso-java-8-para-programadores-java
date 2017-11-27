/**
 * 
 */
package io;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import model.RegistroDatos;
import model.TemperaturaHora;

/**
 * @author Openwebinars
 *
 */
public class MeteoReader {
	
	public static Optional<List<RegistroDatos>> readDataOfPath(Path p, LocalDate fecha) {
		
		if (Files.exists(p)) {			
			try (Stream<String> stream = Files.lines(p, Charset.forName("Cp1252"))) {
				return Optional.of(stream
			        .map(s -> s.split(";"))
			        //.peek(splitted -> System.out.println(Arrays.toString(splitted)))
			        .map(splitted -> {
			        	String estacion = splitted[0];
			        	String provincia = splitted[1];
			        	TemperaturaHora maxima = new TemperaturaHora(Float.parseFloat(splitted[2]), LocalTime.parse(splitted[3], DateTimeFormatter.ofPattern("H:mm")));
			        	TemperaturaHora minima = new TemperaturaHora(Float.parseFloat(splitted[4]), LocalTime.parse(splitted[5], DateTimeFormatter.ofPattern("H:mm")));
			        	float precipitaciones = Float.parseFloat(splitted[6]);
			        	return new RegistroDatos(fecha, estacion, provincia, maxima, minima, precipitaciones);
			        })
			        .collect(Collectors.toList()));
			} catch (IOException ex) {
				System.err.println(ex.getMessage());
				return Optional.empty();
			} 
		} else {
			return Optional.empty();
		}
		
	}

}
