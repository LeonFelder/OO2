package oo2.ejercicio19;

import java.util.List;
import java.util.ArrayList;

public class Personaje {
	private String tipo;
	private Armadura armadura;
	private Arma arma;
	private List<Habilidad> habilidades;
	private int vida;
	
	public Personaje () {
		habilidades = new ArrayList<>();
		vida = 100;
	}
	
	public void setArmadura (Armadura armadura) {
		this.armadura = armadura;
	}
	
	public void setArma (Arma arma) {
		this.arma = arma;
	}
	
	public void setTipo (String tipo) {
		this.tipo = tipo;
	}
	
	public void addHabilidad (Habilidad habilidad) {
		habilidades.add(habilidad);
	}
	
	public Armadura getArmadura () {
		return armadura;
	}
	
	public void recibirAtaque (int danio) {
		if (vida-danio < 0)
			vida = 0;
		else
			vida -= danio;
	}
	
	public boolean puedeParticipar () {
		return vida > 0;
	}
	
	public void atacar (Personaje objetivo) {
		if (this.puedeParticipar() && objetivo.puedeParticipar())
			objetivo.recibirAtaque(arma.atacar(objetivo.getArmadura()));
	}
	
	public String toString() {
		return "Soy el "+ tipo +" y me queda "+ vida + " de vida.";
	}
}
