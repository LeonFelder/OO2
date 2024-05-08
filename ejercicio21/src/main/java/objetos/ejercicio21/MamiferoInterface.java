package objetos.ejercicio21;

import java.time.LocalDate;

public interface MamiferoInterface {
	
	public String getIdentificador ();
	
	public void setIdentificador (String id);
	
	public String getEspecie ();
	
	public void setEspecie (String especie);
	
	public LocalDate getFechaNacimiento ();
	
	public void setFechaNacimiento (LocalDate fecha);
	
	public MamiferoInterface getPadre ();
	
	public void setPadre (MamiferoInterface padre);
	
	public MamiferoInterface getMadre ();
	
	public void setMadre (MamiferoInterface madre);
	
	public MamiferoInterface getAbueloMaterno ();
	
	public MamiferoInterface getAbuelaMaterna ();
	
	public MamiferoInterface getAbueloPaterno ();
	
	public MamiferoInterface getAbuelaPaterna ();
	
	public boolean tieneComoAncestroA (MamiferoInterface mamifero);
}
