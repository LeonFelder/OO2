package ar.edu.unlp.oo1.ejercicio1.app;

import java.util.logging.SimpleFormatter;
import java.util.logging.LogRecord;
import java.util.List;
import java.util.Arrays;

public class PalabrasProhibidasFormatter extends SimpleFormatter {

	@Override
	public String format(LogRecord record) {
		LogRecord record2 = new LogRecord(record.getLevel(),record.getMessage());
		List<String> palabrasAReemplazar = Arrays.asList("switch-statements", "tocó", "pájaro");
		for (String palabra : palabrasAReemplazar) {
			record2.setMessage(record2.getMessage().replace(palabra, "***"));
		}
		return super.format(record2);
	}

}
