package oo2.ejercicio15;

public class AspectExtension extends Aspect {
	public AspectExtension (FileOO2 component) {
		super(component);
	}
	
	public String prettyPrint () {
		return component.prettyPrint() + "\nExtension: " + this.getExtension();
	}
}
