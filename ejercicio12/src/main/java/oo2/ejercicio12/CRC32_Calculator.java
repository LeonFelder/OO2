package oo2.ejercicio12;

import java.util.zip.CRC32;

public class CRC32_Calculator implements Calculator{
	CRC32 crc = new CRC32();
	
	public long crcFor(String datos) {
		crc.update(datos.getBytes());
		return crc.getValue();
	}

}
