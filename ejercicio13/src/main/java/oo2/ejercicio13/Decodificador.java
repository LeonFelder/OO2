package oo2.ejercicio13;

import java.util.List;
import java.util.ArrayList;

public class Decodificador {
	private List<Pelicula> grilla;
	private List<Pelicula> vistas;
	private Sugerencia sugerencias;
	
	public Decodificador () {
		grilla = new ArrayList<>();
		vistas = new ArrayList<>();
		sugerencias = new Novedad();
	}
	
	public void agregarAGrilla (Pelicula pelicula) {
		grilla.add(pelicula);
	}
	
	public void agregarAVistas (Pelicula pelicula) {
		vistas.add(pelicula);
	}
	
	public List<Pelicula> obtenerSugerencias (){
		return sugerencias.obtenerSugerencias(this);
	}
	
	public void setSugerencias (Sugerencia sugerencias) {
		this.sugerencias = sugerencias;
	}

	public List<Pelicula> getGrilla() {
		return grilla;
	}

	public List<Pelicula> getVistas() {
		return vistas;
	}
}
