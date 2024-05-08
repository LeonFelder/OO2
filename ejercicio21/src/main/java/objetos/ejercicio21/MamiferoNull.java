package objetos.ejercicio21;

import java.time.LocalDate;

public class MamiferoNull implements MamiferoInterface{
	
	public MamiferoNull () {
	}
	
	public String getIdentificador () {
		return "";
	}
	
	public void setIdentificador (String id) {
	
	}
	
	public String getEspecie () {
		return "";
	}
	
	public void setEspecie (String especie) {

	}
	
	public LocalDate getFechaNacimiento () {
		return LocalDate.now();
	}
	
	public void setFechaNacimiento (LocalDate fecha) {
		
	}
	
	public MamiferoInterface getPadre () {
		return new MamiferoNull();
	}
	
	public void setPadre (MamiferoInterface padre) {
	
	}
	
	public MamiferoInterface getMadre () {
		return new MamiferoNull();
	}
	
	public void setMadre (MamiferoInterface madre) {
	
	}
	
	public MamiferoInterface getAbueloMaterno () {
		return new MamiferoNull();
	}
	
	public MamiferoInterface getAbuelaMaterna () {
		return new MamiferoNull();
	}
	
	public MamiferoInterface getAbueloPaterno () {
		return new MamiferoNull();
	}
	
	public MamiferoInterface getAbuelaPaterna () {
		return new MamiferoNull();
	}
	
	public boolean tieneComoAncestroA (MamiferoInterface mamifero) {
		return false;
	}
	
	public boolean equals (MamiferoNull otro) {
		return true;
	}
}
