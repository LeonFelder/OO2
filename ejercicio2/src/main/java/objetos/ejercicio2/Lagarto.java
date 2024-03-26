package objetos.ejercicio2;

public class Lagarto implements Jugada{
	public String contraPiedra() {
		return "Gana piedra";
	}
	
	public String contraPapel() {
		return "Gana lagarto";
	}
	
	public String contraTijera() {
		return "Gana tijera";
	}
	
	public String contraLagarto() {
		return "Empate";
	}
	
	public String contraSpock() {
		return "Gana lagarto";
	}
	
	public String jugar(Jugada jugada) {
		return jugada.contraLagarto();
	}
}
