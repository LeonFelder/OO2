package ar.edu.unlp.info.oo2.ejercicio7;

import java.time.LocalDate;
import java.util.List;
import java.util.ArrayList;

public class Directorio extends Elemento{
	private List<Elemento> componentes;
	
	public Directorio (String nombre, LocalDate creacion) {
		super(nombre,creacion);
		componentes = new ArrayList<>();
	}
	
	public int tamanoTotalOcupado () {
		return 32 + componentes.stream().mapToInt(c -> c.tamanoTotalOcupado()).sum();
	}
	
	public Archivo archivoMasGrande() {
		return componentes.stream().map(c -> c.archivoMasGrande()).max((a1,a2) -> Integer.compare(a1.tamanoTotalOcupado(), a2.tamanoTotalOcupado())).orElse(null);
	}
	
	public Archivo archivoMasNuevo() {
		return componentes.stream().map(c -> c.archivoMasNuevo()).max((a1,a2) -> a1.getFecha().compareTo(a2.getFecha())).orElse(null);
	}
	
	public Elemento buscar(String nombre) {
		Elemento buscado = null;
		if (this.coincideNombre(nombre))
			buscado = this;
		else 
			buscado = componentes.stream().filter(c -> c.buscar(nombre) != null).findFirst().orElse(null);
    	return buscado;
    }
	
	public void buscarTodos(String nombre, List<Elemento> buscados) {
		if (this.coincideNombre(nombre))
			buscados.add(this);
		componentes.forEach(c -> c.buscarTodos(nombre, buscados));
    }
	
	public void agregar (Archivo archivo) {
		componentes.add(archivo);
	}
	
	public void agregar (Directorio directorio) {
		componentes.add(directorio);
	}
	
	public String listadoDeContenido(String camino, String listado) {
		camino = camino + "/" + this.getNombre();
		listado = camino + "\n";
		for (Elemento e : componentes) {
			listado = e.listadoDeContenido(camino,listado) ;
		}
		return listado;
	}
}
