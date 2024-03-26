package objetos.ejercicio2;

public class Papel implements Jugada{
	public String contraPiedra() {
		return "Gana papel";
	}
	
	public String contraPapel() {
		return "Empate";
	}
	
	public String contraTijera() {
		return "Gana tijera";
	}
	
	public String contraLagarto() {
		return "Gana lagarto";
	}
	
	public String contraSpock() {
		return "Gana papel";
	}
	
	public String jugar(Jugada jugada) {
		return jugada.contraPapel();
	}
}
