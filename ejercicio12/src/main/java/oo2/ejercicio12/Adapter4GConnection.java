package oo2.ejercicio12;

public class Adapter4GConnection implements Connection {
	public AGConnection gconn;
	
	public Adapter4GConnection () {
		gconn = new AGConnection();
	}
	
	@Override
	public String sendData(String data, long crc) {
		return gconn.transmit(data, crc);
	}

	@Override
	public String pict() {
		return gconn.getSymb();
	}

}
