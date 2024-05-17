package objetos2.ejercicio22;

public class Director {
	private Creador creador;
	
	public Director (Creador creador) {
		this.creador = creador;
	}
	
	public void cambiarCreador (Creador creador) {
		this.creador = creador;
	}
	
	public Sandwich crearSandwich () {
		creador.setPan();
		creador.setAderezo();
		creador.setPrincipal();
		creador.setAdicional();
		return creador.crear();
	}
}
