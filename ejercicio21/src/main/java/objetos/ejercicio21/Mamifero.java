package objetos.ejercicio21;

import java.time.LocalDate;

public class Mamifero implements MamiferoInterface {
	private String id;
	private String especie;
	private LocalDate fecha;
	private MamiferoInterface padre;
	private MamiferoInterface madre;
	
	public Mamifero () {
		id = "";
		especie = "";
		fecha = LocalDate.now();
		padre = new MamiferoNull();
		madre = new MamiferoNull();
	}
	
	public Mamifero (String id) {
		this.id = id;
		especie = "";
		fecha = LocalDate.now();
	}
	
	public String getIdentificador () {
		return id;
	}
	
	public void setIdentificador (String id) {
		this.id = id;
	}
	
	public String getEspecie () {
		return especie;
	}
	
	public void setEspecie (String especie) {
		this.especie = especie;
	}
	
	public LocalDate getFechaNacimiento () {
		return fecha;
	}
	
	public void setFechaNacimiento (LocalDate fecha) {
		this.fecha = fecha;
	}
	
	public MamiferoInterface getPadre () {
		return padre;
	}
	
	public void setPadre (MamiferoInterface padre) {
		this.padre = padre;
	}
	
	public MamiferoInterface getMadre () {
		return madre;
	}
	
	public void setMadre (MamiferoInterface madre) {
		this.madre = madre;
	}
	
	public MamiferoInterface getAbueloMaterno () {
		return madre.getPadre();
	}
	
	public MamiferoInterface getAbuelaMaterna () {
		return madre.getMadre();
	}
	
	public MamiferoInterface getAbueloPaterno () {
		return padre.getPadre();
	}
	
	public MamiferoInterface getAbuelaPaterna () {
		return padre.getMadre();
	}
	
	public boolean tieneComoAncestroA (MamiferoInterface mamifero) {
		Boolean tiene = false;
		if(madre.equals(mamifero) || padre.equals(mamifero)) {
			tiene = true;
		} else {
			tiene = padre.tieneComoAncestroA(mamifero);
			if (!tiene)
				tiene = madre.tieneComoAncestroA(mamifero);
		}
		return tiene;
	}
	
	public boolean equals (Mamifero otro) {
		return especie.equals(otro.getEspecie()) && 
				id.equals(otro.getIdentificador()) &&
				fecha.equals(otro.getFechaNacimiento());
	}
}
