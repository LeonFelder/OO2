package objetos2.ejercicio23;

import java.time.DayOfWeek;
import java.util.Map;
import java.util.EnumMap;
import java.util.List;
import java.util.ArrayList;
import java.time.LocalDate;

public class Servicio {
	private static final Map<DayOfWeek, Double> rates;

    static {
        rates = new EnumMap<>(DayOfWeek.class);
        rates.put(DayOfWeek.MONDAY, 1.0);
        rates.put(DayOfWeek.TUESDAY, 1.01);
        rates.put(DayOfWeek.WEDNESDAY, 0.99);
        rates.put(DayOfWeek.THURSDAY, 0.95);
        rates.put(DayOfWeek.FRIDAY, 1.0);
        rates.put(DayOfWeek.SATURDAY, 1.01);
        rates.put(DayOfWeek.SUNDAY, 1.01);
    }
    
	private Vuelo vuelo;
	private LocalDate fecha;
	private Avion avion;
	private int asientosOcupados;
	
	public Servicio(Vuelo vuelo, LocalDate fecha, Avion avion) {
		this.vuelo = vuelo;
		this.fecha = fecha;
		this.avion = avion;
		asientosOcupados = 0;
	}
	
	public boolean hayLugar () {
		return asientosOcupados < avion.getCapacidadPasajeros();
	}
	
	public int obtenerAsiento () {
		return ++asientosOcupados;
	}
	
	public Vuelo getVuelo() {
		return vuelo;
	}
	
	public void setVuelo(Vuelo vuelo) {
		this.vuelo = vuelo;
	}
	
	public LocalDate getFecha() {
		return fecha;
	}
	
	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}
	
	public Avion getAvion() {
		return avion;
	}
	
	public void setAvion(Avion avion) {
		this.avion = avion;
	}
	
	public long getDuracion() {
		return vuelo.getDuracion();
	}
	public double calcularCosto () {
		return vuelo.getCostoBase() * rates.get(fecha.getDayOfWeek());
	}
}
