package oo2.ejercicio12;

public class WifiConn implements Connection {
	String pict = "Simbolo Wifi";
	
	@Override
	public String sendData(String data, long crc) {
		return "Datos enviados";
	}

	public String pict () {
		return pict;
	}
}
