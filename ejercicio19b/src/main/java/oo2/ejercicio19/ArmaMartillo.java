package oo2.ejercicio19;

public class ArmaMartillo extends Arma {

	@Override
	public int atacar(Armadura armadura) {
		return armadura.recibirMartillo();
	}

}
