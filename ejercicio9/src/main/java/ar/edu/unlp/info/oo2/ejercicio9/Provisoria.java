package ar.edu.unlp.info.oo2.ejercicio9;

public class Provisoria extends Estado {

	public Provisoria(Excursion excursion) {
		super(excursion);
	}
	
	public void inscribir (Usuario usuario) {
		excursion.enrolarInscripto(usuario);
		int cantInscriptos = excursion.getInscriptos().size();
		if (excursion.getCupoMinimo() == cantInscriptos) {
			if (excursion.getCupoMaximo() != cantInscriptos)
				excursion.setEstado(new Definitiva(excursion));
			else
				excursion.setEstado(new Llena(excursion));
		}
	}
	
	public String obtenerInformacion() {
		String informe = super.obtenerInformacion();
		informe += "Cantidad de usuarios faltantes para llegar a el cupo minimo: " + (excursion.getCupoMinimo() - excursion.getInscriptos().size()) + ".\n";
		return informe;
	}
}
