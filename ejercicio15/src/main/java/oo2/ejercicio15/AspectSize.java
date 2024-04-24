package oo2.ejercicio15;

public class AspectSize extends Aspect {
	public AspectSize (FileOO2 component) {
		super(component);
	}
	
	public String prettyPrint () {
		return component.prettyPrint() + "\nSize: " + this.getSize() + " MB";
	}
}
