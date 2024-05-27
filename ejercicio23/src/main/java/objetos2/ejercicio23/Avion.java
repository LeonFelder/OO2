package objetos2.ejercicio23;

public class Avion {
	private String nombre;
	private int capacidadPasajeros;
	private double capacidadDeCarga;
	
	public Avion(String nombre,int capacidadPasajeros, double capacidadDeCarga) {
		this.nombre = nombre;
		this.capacidadPasajeros = capacidadPasajeros;
		this.capacidadDeCarga = capacidadDeCarga;
	}

	public int getCapacidadPasajeros() {
		return capacidadPasajeros;
	}

	public void setCapacidadPasajeros(int capacidadPasajeros) {
		this.capacidadPasajeros = capacidadPasajeros;
	}

	public double getCapacidadDeCarga() {
		return capacidadDeCarga;
	}

	public void setCapacidadDeCarga(double capacidadDeCarga) {
		this.capacidadDeCarga = capacidadDeCarga;
	}
}
