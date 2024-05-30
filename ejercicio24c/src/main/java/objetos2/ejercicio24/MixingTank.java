package objetos2.ejercicio24;

public class MixingTank {
	private int heatPower;
	private int mixerPower;
	private double temperature;
	private double volume;
	private int seconds;
	
	public MixingTank() {
		this.heatPower = 0;
		this.mixerPower = 0;
		this.temperature = 0;
		this.volume = 0;
		seconds = 0;
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
		switch (heatPower) {
		case 100:
			return 5* seconds;
		case 75:
			return 4* seconds;
		case 50:
			return 2 * seconds;
		case 25:
			return seconds;
		case 0:
			return 0;
		}
		return 0;
	}
	
	public void delay(int seconds) {
		this.seconds = seconds;
	}
}
