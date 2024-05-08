package oo2.ejercicio19;

public abstract class Creador {
	protected Personaje personaje;
	
	public abstract void setTipo();
	
	public abstract void setArmadura();
	
	public abstract void setArma();
	
	public abstract void setHabilidades();
	
	public void reset () {
		personaje = new Personaje();
	}
	
	public Personaje crear () {
		return personaje;
	}
}
