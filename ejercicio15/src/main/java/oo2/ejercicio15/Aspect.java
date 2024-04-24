package oo2.ejercicio15;

import java.time.LocalDate;

public abstract class Aspect extends FileOO2 {
	protected FileOO2 component;
	
	public Aspect (FileOO2 component) {
		this.component = component;
	}
	
	public abstract String prettyPrint();
	
	@Override
	public String getName() {
		return component.getName();
	}

	@Override
	public String getExtension() {
		return component.getExtension();
	}

	@Override
	public double getSize() {
		return component.getSize();
	}

	@Override
	public LocalDate getCreationDate() {
		return component.getCreationDate();
	}

	@Override
	public LocalDate getModificationDate() {
		return component.getModificationDate();
	}

	@Override
	public int getPermissions() {
		return component.getPermissions();
	}

}
