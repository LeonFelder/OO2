package objetos.ejercicio2;

public interface Jugada {
	public String contraPiedra();
	
	public String contraPapel();
	
	public String contraTijera();
	
	public String contraLagarto();
	
	public String contraSpock();
	
	public String jugar(Jugada jugada);
}
