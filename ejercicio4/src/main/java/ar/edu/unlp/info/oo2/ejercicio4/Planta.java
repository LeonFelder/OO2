package ar.edu.unlp.info.oo2.ejercicio4;

public class Planta extends Intermedio{
	private int antiguedad;
	
	public double getBasico() {
		return 50000;
	}
	
	public double getAdicional() {
		return super.getAdicional() + 2000 * antiguedad;
	}
}
