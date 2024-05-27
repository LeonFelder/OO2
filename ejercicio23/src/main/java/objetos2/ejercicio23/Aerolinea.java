package objetos2.ejercicio23;

import java.util.List;

import java.util.Map;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.TreeMap;

public class Aerolinea {
	private List<Avion> aviones;
	private List<Servicio> servicios;
	private List<Vuelo> vuelos;
	private List<Pasajero> pasajeros;
	
	public Aerolinea () {
		aviones = new ArrayList<>();
		aviones.add(new Avion("Pilatus PC-12",9,1500));
		aviones.add(new Avion("Pilatus PC-12",6,1500));
		vuelos = new ArrayList<>();
		vuelos.add(new Vuelo("UF101","La Plata","Balcarce", LocalTime.of(7,0),LocalTime.of(8, 0), 12000));
		servicios = new ArrayList<>();
		pasajeros = new ArrayList<>();
	}
	
	public Servicio agregarServicio (Vuelo vuelo, Avion avion, LocalDate fecha) {
		return new Servicio(vuelo, fecha, avion);
	}
	
	public Pasaje agregarPasaje (Pasajero pasajero, List<Servicio> servicios) {
		Pasaje pasaje = null;
		if (servicios.stream().allMatch(s -> s.hayLugar())) {
			TreeMap <Servicio, Integer> serviciosConAsientos = new TreeMap<Servicio, Integer>();
			servicios.forEach(s -> serviciosConAsientos.put(s,s.obtenerAsiento()));
			pasaje = new Pasaje(pasajero, serviciosConAsientos);
			pasajero.agregarPasaje(pasaje);
		}
		return pasaje;
	}
	
	public void eliminarPasaje (Pasajero pasajero, Pasaje pasaje) {
		pasajero.eliminarPasaje(pasaje);
	}
	
	public Map<Vuelo, Double> getPromedioOcupacion () {
		Map<Vuelo, Double> promedios = new TreeMap<>();
		vuelos.forEach(v -> promedios.put(
				v, servicios.stream().
				filter(s -> s.getVuelo().equals(v))
				.mapToDouble(s -> s.getDuracion())
				.sum()
				)
				);
		return promedios;
	}
}
