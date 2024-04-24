package oo2.ejercicio16;

public class DatoPresion extends Dato{
	public DatoPresion (WeatherData componente) {
		super(componente);
	}
	public String displayData () {
		return componente.displayData() + "Presión atmosf: "+ componente.getPresion() + "; ";
	}
}
