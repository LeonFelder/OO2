package oo2.ejercicio13;

import java.time.Year;
import java.util.List;
import java.util.ArrayList;

public class Pelicula {
	private String titulo;
	private Year anioEstreno;
	private List<Pelicula> similares;
	private double puntaje;
	
	public Pelicula(String titulo, double puntaje, Year anioEstreno) {
		similares = new ArrayList<>();
		this.titulo = titulo;
		this.anioEstreno = anioEstreno;
		this.puntaje = puntaje;
	}
	
	public Year getAnioEstreno () {
		return anioEstreno;
	}
	
	public List<Pelicula> getSimilares (){
		return similares;
	}
	
	public double getPuntaje () {
		return puntaje;
	}
	
	public void agregarSimilitud (Pelicula pelicula) {
		similares.add(pelicula);
	}
}
