package objetos2.ejercicio23;

import java.time.DayOfWeek;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Pasaje {
	private Pasajero pasajero;
	private TreeMap<Servicio, Integer> vuelosConAsientos;
	
	public Pasaje (Pasajero pasajero, TreeMap<Servicio, Integer> vuelosConAsientos) {
		this.pasajero = pasajero;
		this.vuelosConAsientos = vuelosConAsientos;
	}


	public Set<Servicio> getVuelos() {
		return vuelosConAsientos.keySet();
	}


	public void setVuelosConAsientos(TreeMap<Servicio, Integer> vuelosConAsientos) {
		this.vuelosConAsientos = vuelosConAsientos;
	}


	public Pasajero getPasajero() {
		return pasajero;
	}

	public void setPasajero(Pasajero pasajero) {
		this.pasajero = pasajero;
	}
	
	public double getRateRoundTrip () {
		if (vuelosConAsientos.firstKey().getVuelo().getLugarSalida().equals(vuelosConAsientos.lastKey().getVuelo().getLugarLlegada()))
			return 0.95;
		else
			return 1;
	}
	
	public double getRateMultiHop () {
		if (vuelosConAsientos.size() >= 3)
			return 0.93;
		else
			return 1;
	}
	
	public double calcularCosto () {
		return vuelosConAsientos.keySet().stream().mapToDouble(s -> s.calcularCosto()).sum() * this.getRateRoundTrip() * this.getRateMultiHop();
	}
}
