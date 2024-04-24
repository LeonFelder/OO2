package oo2.ejercicio16;

import java.util.List;

public class Adaptador implements WeatherData{
	private HomeWeatherStation adaptado;
	
	
	public Adaptador(double temperatura, double presion, double radiacionSolar, List<Double> temperaturas) {
		adaptado = new HomeWeatherStation(temperatura,presion,radiacionSolar,temperaturas);
	}

	//retorna la temperatura en grados Fahrenheit. 
	public double getTemperatura() {
		return adaptado.getTemperatura();
	}

	//retorna la presión atmosférica en hPa
	public double getPresion() {
		return adaptado.getPresion();
	}

	//retorna la radiación solar
	public double getRadiacionSolar() {
		return adaptado.getRadiacionSolar();
	}

	//retorna una lista con todas las temperaturas sensadas hasta el momento, en grados Fahrenheit
	public List<Double> getTemperaturas(){
		return adaptado.getTemperaturas();
	}

	//retorna  un reporte de todos los datos: temperatura, presión, y radiación solar.
	public String displayData(){
	return "";
	}

}
