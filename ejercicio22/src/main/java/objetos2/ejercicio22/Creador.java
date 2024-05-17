package objetos2.ejercicio22;

public abstract class Creador {
	protected Sandwich sandwich;
	
	public void reset () {
		sandwich = new Sandwich ();
	}
	
	public abstract void setPan ();
	
	public void setAderezo () {
		sandwich.setAderezo(0);
	}
	
	public abstract void setPrincipal();
	
	public void setAdicional () {
		sandwich.setAdicional(0);
	}
	
	public Sandwich crear () {
		Sandwich s = sandwich;
		this.reset();
		return s;
	}
}
