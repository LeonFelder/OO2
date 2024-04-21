package ar.edu.unlp.info.oo2.ejercicio7;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public abstract class Elemento{
	public String nombre;
	public LocalDate creacion;
	
	public Elemento (String nombre, LocalDate creacion) {
		this.creacion = creacion;
		this.nombre = nombre;
	}
	
	public LocalDate getFecha () {
		return creacion;
	}
	
	public String getNombre () {
		return nombre;
	}
	
	public abstract int tamanoTotalOcupado();	   
  
	public abstract Archivo archivoMasGrande();
	
	public abstract Archivo archivoMasNuevo();

    public abstract Elemento buscar(String nombre);
    
    public boolean coincideNombre (String nombre) {
    	return this.nombre.equals(nombre);
    }	

    public abstract void buscarTodos(String nombre, List<Elemento> buscados);

    public abstract String listadoDeContenido(String camino,String listado);

}