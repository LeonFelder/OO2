package objetos2.ejercicio23;

import java.util.List;
import java.util.ArrayList;

public class Pasajero {
	private String nombre;
	private String dni;
	private List<Pasaje> pasajes;
	
	public Pasajero(String nombre, String dni) {
		this.nombre = nombre;
		this.dni = dni;
		pasajes = new ArrayList<>();
	}

	public void agregarPasaje (Pasaje pasaje) {
		pasajes.add(pasaje);
	}
	
	public List<Pasaje> getPasajes (){
		return pasajes;
	}
	
	public void eliminarPasaje (Pasaje pasaje) {
		pasajes.remove(pasaje);
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}
}
