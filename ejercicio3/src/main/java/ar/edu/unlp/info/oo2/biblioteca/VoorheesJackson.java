package ar.edu.unlp.info.oo2.biblioteca;

import java.util.List;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class VoorheesJackson extends VoorheesExporter {

	public String exportar(List<Socio> socios) {
		if (socios.isEmpty()) {
			return "[]";
		}
	    ObjectMapper mapper = new ObjectMapper();
		String datos = "";
		try {
			datos = mapper.writeValueAsString(socios);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		return datos;
	}
}
