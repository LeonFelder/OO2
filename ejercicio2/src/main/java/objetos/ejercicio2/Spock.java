package objetos.ejercicio2;

public class Spock implements Jugada{
	public String contraPiedra() {
		return "Gana Spock";
	}
	
	public String contraPapel() {
		return "Gana papel";
	}
	
	public String contraTijera() {
		return "Gana Spock";
	}
	
	public String contraLagarto() {
		return "Gana lagarto";
	}
	
	public String contraSpock() {
		return "Empate";
	}
	
	public String jugar(Jugada jugada) {
		return jugada.contraSpock();
	}
}
