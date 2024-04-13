package ar.edu.unlp.info.oo2.ejercicio4;

public abstract class Intermedio extends Empleado{
	private boolean casado;
	private int hijos;
	
	public double getAdicional() {
		double adicional = 0;
		if (casado)
			adicional = adicional + 5000;
		adicional = adicional + 2000 * hijos;
		return adicional; 
	}
}
