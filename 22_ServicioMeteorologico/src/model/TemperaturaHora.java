package model;

import java.time.LocalTime;

public class TemperaturaHora {
	
	private float temperatura;
	private LocalTime hora;
	
	public TemperaturaHora() { }

	public TemperaturaHora(float temperatura, LocalTime hora) {
		this.temperatura = temperatura;
		this.hora = hora;
	}

	public float getTemperatura() {
		return temperatura;
	}

	public void setTemperatura(float temperatura) {
		this.temperatura = temperatura;
	}

	public LocalTime getHora() {
		return hora;
	}

	public void setHora(LocalTime hora) {
		this.hora = hora;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((hora == null) ? 0 : hora.hashCode());
		result = prime * result + Float.floatToIntBits(temperatura);
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
		TemperaturaHora other = (TemperaturaHora) obj;
		if (hora == null) {
			if (other.hora != null)
				return false;
		} else if (!hora.equals(other.hora))
			return false;
		if (Float.floatToIntBits(temperatura) != Float.floatToIntBits(other.temperatura))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "TemperaturaHora [temperatura=" + temperatura + ", hora=" + hora + "]";
	}
	
	

}
