package oo2.ejercicio15;

import java.time.LocalDate;

public abstract class FileOO2 {
	
	public abstract String prettyPrint();
	
	public abstract String getName();
	
	public abstract String getExtension();

	public abstract double getSize();

	public abstract LocalDate getCreationDate();
	
	public abstract LocalDate getModificationDate();
	
	public abstract int getPermissions();
}
