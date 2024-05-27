package ar.edu.unlp.info.oo2.facturacion_llamadas;

import java.util.ArrayList;
import java.util.Random;
import java.util.SortedSet;
import java.util.TreeSet;

public abstract interface GeneradorStrategy {

	public String obtenerNumeroLibre(SortedSet<String> lineas);

}
