package oo2.ejercicio16;

import java.util.List;

public class HomeWeatherStation implements WeatherData{
	private double temperatura;
	private double presion;
	private double radiacionSolar;
	private List<Double> temperaturas;
	
	
	public HomeWeatherStation(double temperatura, double presion, double radiacionSolar, List<Double> temperaturas) {
		super();
		this.temperatura = temperatura;
		this.presion = presion;
		this.radiacionSolar = radiacionSolar;
		this.temperaturas = temperaturas;
	}

	//retorna la temperatura en grados Fahrenheit. 
	public double getTemperatura() {
		return temperatura;
	}

	//retorna la presión atmosférica en hPa
	public double getPresion() {
		return presion;
	}

	//retorna la radiación solar
	public double getRadiacionSolar() {
		return radiacionSolar;
	}

	//retorna una lista con todas las temperaturas sensadas hasta el momento, en grados Fahrenheit
	public List<Double> getTemperaturas(){
		return temperaturas;
	}

	//retorna  un reporte de todos los datos: temperatura, presión, y radiación solar.
	public String displayData(){
	return "Temperatura F: " + this.getTemperatura() +
	   	  "Presión atmosf: " + this.getPresion() +
	   	  "Radiación solar: " + this.getRadiacionSolar();
	}

}
