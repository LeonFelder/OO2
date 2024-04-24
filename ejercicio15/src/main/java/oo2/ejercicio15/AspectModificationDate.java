package oo2.ejercicio15;

public class AspectModificationDate extends Aspect {
	public AspectModificationDate (FileOO2 component) {
		super(component);
	}
	
	public String prettyPrint () {
		return component.prettyPrint() + "\nModification date: " + this.getModificationDate();
	}
}
