package oo2.ejercicio19;

public class CreadorThoor extends Creador {

	@Override
	public void setTipo() {
		personaje.setTipo("Thoor");
	}

	@Override
	public void setArmadura() {
		personaje.setArmadura(new ArmaduraHierro());
	}

	@Override
	public void setArma() {
		personaje.setArma(new ArmaMartillo());
	}

	@Override
	public void setHabilidades() {
		personaje.addHabilidad(new HabilidadLanzarRayos());
		personaje.addHabilidad(new HabilidadADistancia());
	}

}
