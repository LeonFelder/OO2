package oo2.ejercicio15;

public class AspectName extends Aspect {
	public AspectName (FileOO2 component) {
		super(component);
	}
	
	public String prettyPrint () {
		return component.prettyPrint() + "\nName: " + this.getName();
	}
}
