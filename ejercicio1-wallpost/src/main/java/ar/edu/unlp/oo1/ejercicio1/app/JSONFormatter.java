package ar.edu.unlp.oo1.ejercicio1.app;
import java.util.logging.LogRecord;
import java.util.logging.SimpleFormatter;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class JSONFormatter extends SimpleFormatter {
	
	public String format (LogRecord record) {
		JSONObject registro = new JSONObject();
		registro.put("message", record.getMessage());
		registro.put("level", record.getLevel());
		return registro.toJSONString() + "\n";
	}
}
