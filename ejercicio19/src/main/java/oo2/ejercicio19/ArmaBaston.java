package oo2.ejercicio19;

public class ArmaBaston extends Arma {

	@Override
	public int atacar(Armadura armadura) {
		return armadura.reciibirBaston();
	}

}
