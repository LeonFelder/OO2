package oo2.ejercicio19;

public class CreadorGuerrero extends Creador {

	@Override
	public void setTipo() {
		personaje.setTipo("Guerrero");
	}

	@Override
	public void setArmadura() {
		personaje.setArmadura(new ArmaduraAcero());
	}

	@Override
	public void setArma() {
		personaje.setArma(new ArmaEspada());
	}

	@Override
	public void setHabilidades() {
		personaje.addHabilidad(new HabilidadCuerpoACuerpo());
	}

}
