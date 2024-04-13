package ar.edu.unlp.info.oo2.ejercicio5;

public class VideoStreamAdapter extends Media {

	@Override
	public String play() {
		return new VideoStream().reproduce();
	}

}
