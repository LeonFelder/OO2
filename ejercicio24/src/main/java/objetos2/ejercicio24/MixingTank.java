package objetos2.ejercicio24;

public class MixingTank {
	private int heatPower;
	private int mixerPower;
	private double temperature;
	private double volume;
	
	
	public MixingTank() {
		this.heatPower = 0;
		this.mixerPower = 0;
		this.temperature = 0;
		this.volume = 0;
	}

	public boolean heatPower(int percentage) {
		heatPower = percentage;
		return true;
	}
	
	public boolean mixerPower (int percentage) {
		mixerPower = percentage;
		return true;
	}
	
	public boolean purge () {
		volume = 0;
		return true;
	}
	
	public double upTo() {
		return volume;
	}
	
	public double temperature () {
		return temperature;
	}
}
