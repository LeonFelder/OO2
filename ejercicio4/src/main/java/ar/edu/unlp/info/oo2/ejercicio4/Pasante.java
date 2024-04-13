package ar.edu.unlp.info.oo2.ejercicio4;

public class Pasante extends Empleado {
	private int examenes;
	
	@Override
	public double getAdicional() {
		return 2000 * examenes;
	}

	@Override
	public double getBasico() {
		return 20000;
	}

}
