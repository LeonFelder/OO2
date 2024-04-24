package oo2.ejercicio16;

public class DatoPromedioCelsius extends Dato{
	public DatoPromedioCelsius (WeatherData componente) {
		super(componente);
	}
	public String displayData () {
		return componente.displayData() + "Promedio: "+ this.converToCelsius(componente.getTemperaturas().stream().mapToDouble(d -> d).average().orElse(0)) + "; ";
	}
}
