package ar.edu.unlp.info.oo2.ejercicio6;

public abstract class Topografia {
	public abstract double calcularProporcion ();
	
	public Object getTopografia() {
		return this;
	}

	public  boolean isEquals(Topografia topografia) {
		return (this.calcularProporcion() == topografia.calcularProporcion());
	}
	
	@Override
	public  boolean equals(Object objeto) {
		return this.isEquals((Topografia)objeto);
	}
}
