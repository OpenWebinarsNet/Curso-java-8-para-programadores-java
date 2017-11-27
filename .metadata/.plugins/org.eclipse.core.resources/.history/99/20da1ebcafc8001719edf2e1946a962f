package model;

import java.time.LocalDate;

public class RegistroDatos {
	
	private LocalDate fecha;
	private String estacionMeteorologica;
	private String provincia;
	private TemperaturaHora maxima;
	private TemperaturaHora minima;
	private float precipitacion;
	
	public RegistroDatos() { }

	public RegistroDatos(LocalDate fecha, String estacionMeteorologica, String provincia, TemperaturaHora maxima,
			TemperaturaHora minima, float precipitacion) {
		this.fecha = fecha;
		this.estacionMeteorologica = estacionMeteorologica;
		this.provincia = provincia;
		this.maxima = maxima;
		this.minima = minima;
		this.precipitacion = precipitacion;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public String getEstacionMeteorologica() {
		return estacionMeteorologica;
	}

	public void setEstacionMeteorologica(String estacionMeteorologica) {
		this.estacionMeteorologica = estacionMeteorologica;
	}

	public String getProvincia() {
		return provincia;
	}

	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}

	public TemperaturaHora getMaxima() {
		return maxima;
	}

	public void setMaxima(TemperaturaHora maxima) {
		this.maxima = maxima;
	}

	public TemperaturaHora getMinima() {
		return minima;
	}

	public void setMinima(TemperaturaHora minima) {
		this.minima = minima;
	}

	public float getPrecipitacion() {
		return precipitacion;
	}

	public void setPrecipitacion(float precipitacion) {
		this.precipitacion = precipitacion;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((estacionMeteorologica == null) ? 0 : estacionMeteorologica.hashCode());
		result = prime * result + ((fecha == null) ? 0 : fecha.hashCode());
		result = prime * result + ((maxima == null) ? 0 : maxima.hashCode());
		result = prime * result + ((minima == null) ? 0 : minima.hashCode());
		result = prime * result + Float.floatToIntBits(precipitacion);
		result = prime * result + ((provincia == null) ? 0 : provincia.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		RegistroDatos other = (RegistroDatos) obj;
		if (estacionMeteorologica == null) {
			if (other.estacionMeteorologica != null)
				return false;
		} else if (!estacionMeteorologica.equals(other.estacionMeteorologica))
			return false;
		if (fecha == null) {
			if (other.fecha != null)
				return false;
		} else if (!fecha.equals(other.fecha))
			return false;
		if (maxima == null) {
			if (other.maxima != null)
				return false;
		} else if (!maxima.equals(other.maxima))
			return false;
		if (minima == null) {
			if (other.minima != null)
				return false;
		} else if (!minima.equals(other.minima))
			return false;
		if (Float.floatToIntBits(precipitacion) != Float.floatToIntBits(other.precipitacion))
			return false;
		if (provincia == null) {
			if (other.provincia != null)
				return false;
		} else if (!provincia.equals(other.provincia))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "RegistroDatos [fecha=" + fecha + ", estacionMeteorologica=" + estacionMeteorologica + ", provincia="
				+ provincia + ", maxima=" + maxima + ", minima=" + minima + ", precipitacion=" + precipitacion + "]";
	}
	
	
	

}
