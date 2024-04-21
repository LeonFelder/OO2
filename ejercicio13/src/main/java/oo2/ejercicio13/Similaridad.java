package oo2.ejercicio13;

import java.util.List;
import java.util.stream.Collectors;

public class Similaridad extends Sugerencia{
	public List<Pelicula> sugerirPeliculas (Decodificador decodificador){
		return decodificador.getVistas().stream()
				.map(p -> p.getSimilares())
				.flatMap(lista -> lista.stream())
				.sorted((p1,p2) -> p2.getAnioEstreno().compareTo(p1.getAnioEstreno()))
				.collect(Collectors.toList());
	}
}
