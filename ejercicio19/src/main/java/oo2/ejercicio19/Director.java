package oo2.ejercicio19;

public class Director {
	private Creador creador;
	
	public Director () {
		this.creador = new CreadorGuerrero();
	}
	
	public Personaje crear () {
		creador.reset();
		creador.setTipo();
		creador.setArmadura();
		creador.setArma();
		creador.setHabilidades();
		return creador.crear();
	}
	
	public void cambiarCreador (Creador creador) {
		this.creador = creador;
	}
}
