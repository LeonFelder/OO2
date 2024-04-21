package oo2.ejercicio11;

public class EnEvaluacion extends Estado {
	
	public EnEvaluacion(Proyecto proyecto) {
		super(proyecto);
	}
	
	public void aprobarEtapa () {
		proyecto.setEstado(new Confirmada(proyecto));
	}
	
	public void modificarMargen (double margen) {
		if ((margen >= 0.11) && (margen <= 0.15)) {
			proyecto.setMargen(margen);
		}
	}
}
