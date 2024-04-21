package ar.edu.unlp.info.oo2.ejercicio9;

import java.util.List;

public class Definitiva extends Estado {

	public Definitiva(Excursion excursion) {
		super(excursion);
	}
	
	public void inscribir (Usuario usuario) {
		excursion.enrolarInscripto(usuario);
		if (excursion.getCupoMaximo()== excursion.getInscriptos().size())
			excursion.setEstado(new Llena(excursion));
	}
	
	public String obtenerInformacion() {
		String informe = super.obtenerInformacion();
		List<Usuario> inscriptos = excursion.getInscriptos();
		informe += "Email de inscriptos: \n";
		for (Usuario ins : inscriptos)
			informe += ins.getEmail() + "\n";
		informe += "Cantidad de usuarios faltantes para llegar a el cupo maximo: " + (excursion.getCupoMaximo() - inscriptos.size()) + ".\n";
		return informe;
	}
}
