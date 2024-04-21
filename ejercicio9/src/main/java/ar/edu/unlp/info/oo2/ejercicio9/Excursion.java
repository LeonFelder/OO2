package ar.edu.unlp.info.oo2.ejercicio9;

import java.time.LocalDate;
import java.util.List;
import java.util.ArrayList;

public class Excursion {
	private String nombre;
	private LocalDate inicio;
	private LocalDate fin;
	private String encuentro;
	private double costo;
	private int cupoMaximo;
	private int cupoMinimo;
	private List<Usuario> listaEspera;
	private List<Usuario> inscriptos;
	private Estado estado;
	
	public Excursion(String nombre, LocalDate inicio, LocalDate fin, String encuentro, double costo, int cupoMaximo,
			int cupoMinimo) {
		listaEspera = new ArrayList<>();
		inscriptos = new ArrayList<>();
		this.nombre = nombre;
		this.inicio = inicio;
		this.fin = fin;
		this.encuentro = encuentro;
		this.costo = costo;
		this.cupoMaximo = cupoMaximo;
		this.cupoMinimo = cupoMinimo;
		estado = new Provisoria(this);
	}

	public int getCupoMaximo() {
		return cupoMaximo;
	}

	public int getCupoMinimo() {
		return cupoMinimo;
	}

	public List<Usuario> getListaEspera() {
		return listaEspera;
	}

	public List<Usuario> getInscriptos() {
		return inscriptos;
	}
	
	public void enrolarInscripto (Usuario inscripto) {
		inscriptos.add(inscripto);
	}
	
	public void enrolarEnEspera (Usuario enEspera) {
		listaEspera.add(enEspera);
	}
	
	public void inscribir (Usuario unUsuario) {
		estado.inscribir(unUsuario);
	}
	
	public String obtenerInformacion() {
		return estado.obtenerInformacion();
	}

	public String getNombre() {
		return nombre;
	}

	public LocalDate getInicio() {
		return inicio;
	}

	public LocalDate getFin() {
		return fin;
	}

	public String getEncuentro() {
		return encuentro;
	}

	public double getCosto() {
		return costo;
	}

	public Estado getEstado() {
		return estado;
	}
	
	public void setEstado (Estado estado) {
		this.estado = estado;
	}
}
