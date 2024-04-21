package ar.edu.unlp.info.oo2.ejercicio9;

public class Llena extends Estado {

	public Llena(Excursion excursion) {
		super(excursion);
	}
	
	public void inscribir (Usuario usuario) {
		excursion.enrolarEnEspera(usuario);
	}
}
