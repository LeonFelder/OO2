package ar.edu.unlp.info.oo2.biblioteca;

import java.util.List;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class VoorheesJson extends VoorheesExporter {
	
	private JSONObject crearJSON (Socio socio) {
		JSONObject socioj = new JSONObject();
		socioj.put("nombre",socio.getNombre());
		socioj.put("email", socio.getEmail());
		socioj.put("legajo", socio.getLegajo());
		return socioj;
	}

	public String exportar(List<Socio> socios) {
		if (socios.isEmpty()) {
			return "[]";
		}
		JSONArray array = new JSONArray();
		socios.forEach(socio -> array.add(this.crearJSON(socio)));
		return array.toJSONString();
	}
}
