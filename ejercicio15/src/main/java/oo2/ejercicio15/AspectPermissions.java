package oo2.ejercicio15;

public class AspectPermissions extends Aspect {
	public AspectPermissions (FileOO2 component) {
		super(component);
	}
	
	public String prettyPrint () {
		return component.prettyPrint() + "\nPermissions: " + this.getPermissions();
	}
}
