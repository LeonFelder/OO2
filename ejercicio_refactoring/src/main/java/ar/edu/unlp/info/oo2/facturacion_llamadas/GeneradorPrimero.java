package ar.edu.unlp.info.oo2.facturacion_llamadas;

import java.util.TreeSet;
import java.util.SortedSet;

public class GeneradorPrimero implements GeneradorStrategy {
	public String obtenerNumeroLibre(SortedSet<String> lineas) {
		return lineas.first();
	}
}
