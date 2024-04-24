package oo2.ejercicio16;

public class DatoFahrentheit extends Dato{
	public DatoFahrentheit (WeatherData componente) {
		super(componente);
	}
	public String displayData () {
		return componente.displayData() + "Temperatura F: "+ componente.getTemperatura() + "; ";
	}
}
