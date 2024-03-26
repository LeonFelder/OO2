package objetos.ejercicio1;

public class ReTweet implements Publicacion{
	private Tweet tweet;
	
	public ReTweet (Tweet tweet) {
		this.tweet = tweet;
	}
	
	public String getTexto () {
		return tweet.getTexto();
	}
}
