package oo2.ejercicio16;

import java.util.List;

public abstract class Dato implements WeatherData{
	protected WeatherData componente;
	
	public Dato (WeatherData componente) {
		this.componente = componente;
	}
	
	//retorna la temperatura en grados Fahrenheit. 
	public double getTemperatura() {
		return componente.getTemperatura();
	}

	//retorna la presión atmosférica en hPa
	public double getPresion() {
		return componente.getPresion();
	}

	//retorna la radiación solar
	public double getRadiacionSolar() {
		return componente.getRadiacionSolar();
	}

	//retorna una lista con todas las temperaturas sensadas hasta el momento, en grados Fahrenheit
	public List<Double> getTemperaturas(){
		return componente.getTemperaturas();
	}

	//retorna  un reporte de todos los datos: temperatura, presión, y radiación solar.
	public abstract String displayData();
	
	public double converToCelsius (double number) {
		return (number-32)/1.8;
	}
}
