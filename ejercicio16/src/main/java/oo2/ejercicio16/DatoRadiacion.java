package oo2.ejercicio16;

public class DatoRadiacion extends Dato{
	public DatoRadiacion (WeatherData componente) {
		super(componente);
	}
	public String displayData () {
		return componente.displayData() + "Radiación solar: "+ componente.getRadiacionSolar() + "; ";
	}
}
