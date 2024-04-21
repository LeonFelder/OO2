package ar.edu.unlp.info.oo2.ejercicio7;

import java.time.LocalDate;
import java.util.List;

public class Archivo extends Elemento{
	private int tamano;
	
	public Archivo (String nombre, LocalDate creacion,int tamano) {
		super(nombre,creacion);
		this.tamano = tamano;
	}
	
	public int tamanoTotalOcupado() {
		return tamano;
	}
	
	public Archivo archivoMasGrande() {
		return this;
	}
	
	public Archivo archivoMasNuevo() {
		return this;
	}
	
	public Elemento buscar(String nombre) {
		Elemento buscado = null;
		if (this.coincideNombre(nombre))
			buscado = this;
    	return buscado;
    }
	
	public void buscarTodos(String nombre, List<Elemento> buscados) {
		if (this.coincideNombre(nombre))
			buscados.add(this);
    }
	
	public String listadoDeContenido(String camino, String listado) {
		return listado + camino + "/" + this.getNombre() + "\n";
	}
}
