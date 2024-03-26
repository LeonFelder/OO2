package objetos.ejercicio1;

public class Tweet implements Publicacion{
	private String texto;
	
	public static boolean validarTexto (String texto) {
		return (!texto.isBlank()) && (texto.length() <= 280);
	}
	
	public Tweet (String texto) {
		this.texto = texto;
	}
	
	public String getTexto () {
		return texto;
	}
	
	public void eliminar () {
		texto = "Contenido no disponible.";
	}
}
