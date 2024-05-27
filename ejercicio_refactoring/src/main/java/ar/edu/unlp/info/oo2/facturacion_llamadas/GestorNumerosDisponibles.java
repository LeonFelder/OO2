package ar.edu.unlp.info.oo2.facturacion_llamadas;

import java.util.TreeSet;
import java.util.SortedSet;

public class GestorNumerosDisponibles {
	SortedSet<String> lineas = new TreeSet<String>();
	GeneradorStrategy generador;

	public GestorNumerosDisponibles (GeneradorStrategy generador) {
		this.generador = generador;
	}
	
	public SortedSet<String> getLineas() {
		return lineas;
	}

	public String obtenerNumeroLibre () {
		String linea = generador.obtenerNumeroLibre(lineas);
		this.lineas.remove(linea);
		return linea;
	}
	
	public void cambiarTipoGenerador(GeneradorStrategy generador) {
		this.generador = generador;
	}
}
