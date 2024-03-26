package objetos.ejercicio2;

public class Piedra implements Jugada{
	public String contraPiedra() {
		return "Empate";
	}
	
	public String contraPapel() {
		return "Gana papel";
	}
	
	public String contraTijera() {
		return "Gana piedra";
	}
	
	public String contraLagarto() {
		return "Gana piedra";
	}
	
	public String contraSpock() {
		return "Gana Spock";
	}
	
	public String jugar(Jugada jugada) {
		return jugada.contraPiedra();
	}
}
