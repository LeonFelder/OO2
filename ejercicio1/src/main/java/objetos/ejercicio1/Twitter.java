package objetos.ejercicio1;

import java.util.List;
import java.util.ArrayList;

public class Twitter {
	private List<Usuario> usuarios;
	
	public Twitter () {
		usuarios = new ArrayList<>();
	}
	
	public boolean agregarUsuario (String screenName) {
		boolean exito = false;
		if (!usuarios.stream().anyMatch(u -> u.esIgual(screenName))){
			usuarios.add(new Usuario(screenName));
			exito = true;
		}
		return exito;
	}
}
