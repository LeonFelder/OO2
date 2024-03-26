package ar.edu.unlp.info.oo2.ejercicio4;

public abstract class Empleado{
	public abstract double getAdicional();
	
	public abstract double getBasico();
	
	public double getDescuento () {
		return 0.13*this.getBasico()+0.05*this.getAdicional();
	}
	
	public double sueldo () {
		return this.getBasico() + this.getAdicional() - this.getDescuento();
	}
}
