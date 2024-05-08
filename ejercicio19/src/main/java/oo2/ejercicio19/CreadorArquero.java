package oo2.ejercicio19;

public class CreadorArquero extends Creador {

	@Override
	public void setTipo() {
		personaje.setTipo("Arquero");
	}

	@Override
	public void setArmadura() {
		personaje.setArmadura(new ArmaduraCuero());
	}

	@Override
	public void setArma() {
		personaje.setArma(new ArmaArco());
	}

	@Override
	public void setHabilidades() {
		personaje.addHabilidad(new HabilidadADistancia());
	}

}
