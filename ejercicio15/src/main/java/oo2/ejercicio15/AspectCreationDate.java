package oo2.ejercicio15;

public class AspectCreationDate extends Aspect {
	public AspectCreationDate (FileOO2 component) {
		super(component);
	}
	
	public String prettyPrint () {
		return  component.prettyPrint() + "\nCreation date: " + this.getCreationDate();
	}
}
