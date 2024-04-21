package oo2.ejercicio11;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Proyecto {
	private String nombre;
	private LocalDate inicio;
	private LocalDate fin;
	private String objetivo;
	private int integrantes;
	private double margen;
	private Estado estado;
	private double pago;
	
	public Proyecto(String nombre,LocalDate inicio, LocalDate fin, String objetivo, int integrantes, double pago) {
		estado = new EnConstruccion(this);
		this.nombre = nombre;
		this.inicio = inicio;
		this.fin = fin;
		this.objetivo = objetivo;
		this.integrantes = integrantes;
		margen = 0.07;
		this.pago = pago;
	}
	
	public void setEstado (Estado estado) {
		this.estado = estado;
	}
	
	public double getCosto() {
		return inicio.until(fin, ChronoUnit.DAYS) * pago * integrantes;
	}
	
	public double getPrecio() {
		return this.getCosto() + this.getCosto() * margen;
	}
	
	public void aprobarEtapa() {
		estado.aprobarEtapa();
	}
	
	public void modificarMargen (double margen) {
		estado.modificarMargen(margen);
	}
	
	public void setMargen (double margen) {
		this.margen = margen;
	}
	
	public void cancelar () {
		estado.cancelar();
	}
	
	public void setObjetivo (String objetivo) {
		this.objetivo = objetivo;
	}
	
	public String getObjetivo () {
		return objetivo;
	}
}
