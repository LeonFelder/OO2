package oo2.ejercicio19;

public class ArmaEspada extends Arma {

	@Override
	public int atacar(Armadura armadura) {
		return armadura.reciibirEspada();
	}

}
