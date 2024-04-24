package oo2.ejercicio16;

public class DatoMinimo extends Dato{
	public DatoMinimo (WeatherData componente) {
		super(componente);
	}
	public String displayData () {
		return componente.displayData() + "Mínimo: "+ componente.getTemperaturas().stream().mapToDouble(d -> d.doubleValue()).min().orElse(0) + "; ";
	}
}
