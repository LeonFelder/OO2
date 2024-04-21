package oo2.ejercicio11;

public abstract class Estado {
	protected Proyecto proyecto;
	
	public Estado (Proyecto proyecto) {
		this.proyecto = proyecto;
	}
	
	public void aprobarEtapa() {
		
	}
	
	public void modificarMargen (double margen) {
		
	}
	
	public void cancelar () {
		proyecto.setObjetivo(proyecto.getObjetivo()+" (Cancelado)");
		proyecto.setEstado(new Cancelado(proyecto));
	}
}
