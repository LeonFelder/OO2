package objetos.ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
	private List<Tweet> tweets;
	private List<ReTweet> reTweets;
	private String screenName;
	
	public Usuario (String screenName) {
		tweets = new ArrayList<>();
		reTweets = new ArrayList<>();
		this.screenName = screenName;
	}
	
	public boolean esIgual(String otroNombre) {
		return otroNombre.equals(screenName);
	}
	
	public void eliminarTweets () {
		tweets.forEach(tweet -> tweet.eliminar());
		tweets.clear();
		reTweets.clear();
	}
	
	public boolean agregarTweet (String texto) {
		boolean valido = false;
		if (Tweet.validarTexto(texto)) {
			tweets.add(new Tweet(texto));
			valido = true;
		}
		return valido;
	}
	
	public void agregarReTweet (Tweet tweet) {
		reTweets.add(new ReTweet(tweet));
	}
	
	public List<Tweet> getTweets (){
		return new ArrayList<>(tweets);
	}
}
