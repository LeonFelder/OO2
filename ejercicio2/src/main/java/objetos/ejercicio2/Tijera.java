package objetos.ejercicio2;

public class Tijera implements Jugada{
	public String contraPiedra() {
		return "Gana piedra";
	}
	
	public String contraPapel() {
		return "Gana tijera";
	}
	
	public String contraTijera() {
		return "Empate";
	}
	
	public String contraLagarto() {
		return "Gana tijera";
	}
	
	public String contraSpock() {
		return "Gana Spock";
	}
	
	public String jugar(Jugada jugada) {
		return jugada.contraTijera();
	}
}
