package oo2.ejercicio12;

public class Dispositivo {
	private Calculator crcCalculator;
	private Connection connection;
	private Ringer ringer;
	private Display display;
	
	public Dispositivo (Calculator crcCalculator, Connection connection) {
		this.crcCalculator = crcCalculator;
		this.connection = connection;
		ringer = new Ringer ();
		display = new Display();
	}
	
	public String send (String data) {
		long crc =this.crcCalculator.crcFor(data);
		return this.connection.sendData(data,crc);
	}
	
	public void setCalculator (Calculator crcCalculator) {
		this.crcCalculator = crcCalculator;
	}
	
	public void setConnection (Connection connection) {
		display.showBanner(connection.pict());
		this.connection = connection;
		ringer.ring();
	}
}
