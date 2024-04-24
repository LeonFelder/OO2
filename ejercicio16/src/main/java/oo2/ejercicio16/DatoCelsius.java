package oo2.ejercicio16;

public class DatoCelsius extends Dato{
	public DatoCelsius (WeatherData componente) {
		super(componente);
	}
	public String displayData () {
		return componente.displayData() + "Temperatura C: "+ this.converToCelsius(componente.getTemperatura()) + "; ";
	}
}
