package oo2.ejercicio16;

public class DatoMaximo extends Dato{
	public DatoMaximo (WeatherData componente) {
		super(componente);
	}
	public String displayData () {
		return componente.displayData() + "Máximo: "+ componente.getTemperaturas().stream().mapToDouble(d -> d.doubleValue()).max().orElse(0) + "; ";
	}
}
