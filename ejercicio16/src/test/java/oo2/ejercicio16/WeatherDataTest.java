/**
 * 
 */
package oo2.ejercicio16;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.List;
import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class WeatherDataTest {
		private HomeWeatherStation estacion;
		private Adaptador adaptador;
		private DatoPresion presion;
		private DatoRadiacion radiacion; 
		private DatoCelsius celsius;
		private DatoPromedioCelsius promedioCelsius;
		private DatoPromedioFahrenheit promedioFahrenheit;

		@BeforeEach
		public void setUp() throws Exception {
			//23.5 + 23.5 + 30
			List<Double> temperaturas = new ArrayList<>();
			temperaturas.add(70.0);
			temperaturas.add(80.0);
			temperaturas.add(81.0);
			this.adaptador = new Adaptador(82.4, 1008, 500,temperaturas);
		}

		@Test
		public void testDisplayDataOpcion2() {
			//Ejemplo 2:    “Presión atmosférica: 1008  Radiación solar: 500”
			this.presion = new DatoPresion(adaptador);
			this.radiacion = new DatoRadiacion(this.presion);
			
			assertEquals("Presión atmosf: 1008.0; Radiación solar: 500.0; ",this.radiacion.displayData());
			
		}

		@Test
		public void testDisplayDataOpcion3() {
			//Ejemplo 3: “Radiación solar: 500  Temperatura C: 28  Promedio de temperaturas C: 25”
			this.radiacion = new DatoRadiacion(adaptador);
			this.celsius = new DatoCelsius(radiacion);
			this.promedioCelsius = new DatoPromedioCelsius(celsius);
			
			assertEquals("Radiación solar: 500.0; Temperatura C: 28.000000000000004; Promedio: 25.0; " ,this.promedioCelsius.displayData());

		}
}
