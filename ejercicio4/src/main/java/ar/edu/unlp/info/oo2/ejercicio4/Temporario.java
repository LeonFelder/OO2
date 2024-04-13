package ar.edu.unlp.info.oo2.ejercicio4;

public class Temporario extends Intermedio {
	private int horas;

	@Override
	public double getBasico() {
		return 20000 + horas*300;
	}

}
