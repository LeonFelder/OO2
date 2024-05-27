package ar.edu.unlp.info.oo2.facturacion_llamadas;

import java.util.SortedSet;
import java.util.TreeSet;

public class GeneradorUltimo implements GeneradorStrategy {
	public String obtenerNumeroLibre(SortedSet<String> lineas) {
		return lineas.last();
	}
}
