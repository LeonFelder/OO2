package ar.edu.unlp.info.oo2.ejercicio9;

public abstract class Estado {
	protected Excursion excursion;
	
	public Estado (Excursion excursion) {
		this.excursion = excursion;
	}
	
	public abstract void inscribir (Usuario usuario);
	
	public String obtenerInformacion() {
		String informe = "Nombre: " + excursion.getNombre() + ".\n";
		informe += "Costo: $" + excursion.getCosto() + ".\n";
		informe += "Inicio: " + excursion.getInicio() + ".\n";
		informe += "Fin: " + excursion.getFin() + ".\n";
		informe += "Punto de encuentro: " + excursion.getEncuentro() + ".\n";
		return informe;
	}
}
