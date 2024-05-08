package oo2.ejercicio19;

public class ArmaArco extends Arma {

	@Override
	public int atacar(Armadura armadura) {
		return armadura.reciibirArco();
	}

}
