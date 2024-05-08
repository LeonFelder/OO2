package oo2.ejercicio19;

public class CreadorMago extends Creador {

	@Override
	public void setTipo() {
		personaje.setTipo("Mago");
	}

	@Override
	public void setArmadura() {
		personaje.setArmadura(new ArmaduraCuero());
	}

	@Override
	public void setArma() {
		personaje.setArma(new ArmaBaston());
	}

	@Override
	public void setHabilidades() {
		personaje.addHabilidad(new HabilidadMagia());
		personaje.addHabilidad(new HabilidadADistancia());
	}

}
