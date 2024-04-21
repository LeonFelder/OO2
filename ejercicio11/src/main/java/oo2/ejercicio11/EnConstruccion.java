package oo2.ejercicio11;

public class EnConstruccion extends Estado {
	
	public EnConstruccion(Proyecto proyecto) {
		super(proyecto);
	}
	
	public void aprobarEtapa () {
		if (proyecto.getPrecio() != 0) 
			proyecto.setEstado(new EnEvaluacion(proyecto));
		else
			throw new RuntimeException("El precio del proyecto es igual a cero.");
	}
	
	public void modificarMargen (double margen) {
		if ((margen >= 0.08) && (margen <= 0.1)) {
			proyecto.setMargen(margen);
		}
	}
}
