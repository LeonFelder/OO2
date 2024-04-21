package oo2.ejercicio13;

import java.util.List;
import java.util.stream.Collectors;

public class Novedad extends Sugerencia{
	public List<Pelicula> sugerirPeliculas (Decodificador decodificador){
		return decodificador.getGrilla().stream().sorted((p1,p2) -> p2.getAnioEstreno().compareTo(p1.getAnioEstreno())).collect(Collectors.toList());
	}
}
