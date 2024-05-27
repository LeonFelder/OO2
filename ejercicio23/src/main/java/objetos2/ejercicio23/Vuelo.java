package objetos2.ejercicio23;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class Vuelo {
	private String nombre;
	private String lugarSalida;
	private String lugarLlegada;
	private LocalTime horarioSalida;
	private LocalTime horarioLlegada;
	private double costoBase;
	
	
	public Vuelo(String nombre, String lugarSalida, String lugarLlegada, LocalTime horarioSalida,
			LocalTime horarioLlegada, double costoBase) {
		this.nombre = nombre;
		this.lugarSalida = lugarSalida;
		this.lugarLlegada = lugarLlegada;
		this.horarioSalida = horarioSalida;
		this.horarioLlegada = horarioLlegada;
		this.costoBase = costoBase;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getLugarSalida() {
		return lugarSalida;
	}
	public void setLugarSalida(String lugarSalida) {
		this.lugarSalida = lugarSalida;
	}
	public String getLugarLlegada() {
		return lugarLlegada;
	}
	public void setLugarLlegada(String lugarLlegada) {
		this.lugarLlegada = lugarLlegada;
	}
	public LocalTime getHorarioSalida() {
		return horarioSalida;
	}
	public void setHorarioSalida(LocalTime horarioSalida) {
		this.horarioSalida = horarioSalida;
	}
	public LocalTime getHorarioLlegada() {
		return horarioLlegada;
	}
	public void setHorarioLlegada(LocalTime horarioLlegada) {
		this.horarioLlegada = horarioLlegada;
	}
	public double getCostoBase() {
		return costoBase;
	}
	public void setCostoBase(double costoBase) {
		this.costoBase = costoBase;
	}
	
	public long getDuracion() {
		return horarioSalida.until(horarioLlegada, ChronoUnit.HOURS);
	}
}
