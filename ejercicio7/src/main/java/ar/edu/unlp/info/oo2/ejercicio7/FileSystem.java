package ar.edu.unlp.info.oo2.ejercicio7;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class FileSystem{
	public Directorio raiz;
	
	public FileSystem () {
		raiz = new Directorio ("",LocalDate.now());
	}
	
	public int tamanoTotalOcupado() {
		return raiz.tamanoTotalOcupado();
	}
	public Archivo archivoMasGrande() {
		return raiz.archivoMasGrande();
	}
	
	public Archivo archivoMasNuevo() {
		return raiz.archivoMasNuevo();
	}

    public Elemento buscar(String nombre) {
    	return raiz.buscar(nombre);
    }	

    public List<Elemento> buscarTodos(String nombre){
    	List<Elemento> buscados = new ArrayList<>();
    	raiz.buscarTodos(nombre, buscados);
    	return buscados;
    }

    public String listadoDeContenido() {
    	return raiz.listadoDeContenido("", "");
    }
}