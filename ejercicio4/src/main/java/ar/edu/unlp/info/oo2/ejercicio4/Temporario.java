package ar.edu.unlp.info.oo2.ejercicio4;

public class Temporario extends Empleado {
	boolean casado;
	int hijos;
	
	@Override
	public double getAdicional() {
		double adicional = 0;
		if (casado) {
			adicional = adicional + 5000;
		}
		adicional = adicional + 2000 * hijos;
		return adicional;
	}

	@Override
	public double getBasico() {
		// TODO Auto-generated method stub
		return 0;
	}

}
