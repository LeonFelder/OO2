package oo2.ejercicio16;

public class DatoPromedioFahrenheit extends Dato{
	public DatoPromedioFahrenheit (WeatherData componente) {
		super(componente);
	}
	public String displayData () {
		return componente.displayData() + "Promedio: "+ componente.getTemperaturas().stream().mapToDouble(d -> d).average().orElse(0) + "; ";
	}
}
