package ar.edu.unlp.info.oo2.biblioteca;

import static org.junit.Assert.assertEquals;

import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class BibliotecaTest {
	Biblioteca biblioteca = new Biblioteca();
	JSONParser parser;
	Object resultado;

	@BeforeEach
	public void setUp() throws Exception {
		biblioteca = new Biblioteca();
		biblioteca.agregarSocio(new Socio("Arya Stark", "needle@stark.com", "5234-5"));
		biblioteca.agregarSocio(new Socio("Tyron Lannister", "tyron@thelannisters.com",  "2345-2"));
		parser = new JSONParser();
		resultado = parser.parse("[\n"
    			+ "    {\n"
    			+ "   	 \"nombre\": \"Arya Stark\",\n"
    			+ "   	 \"email\": \"needle@stark.com\",\n"
    			+ "   	 \"legajo\": \"5234-5\"\n"
    			+ "    },\n"
    			+ "    {\n"
    			+ "   	 \"nombre\": \"Tyron Lannister\",\n"
    			+ "   	 \"email\": \"tyron@thelannisters.com\",\n"
    			+ "   	 \"legajo\": \"2345-2\"\n"
    			+ "    }\n"
    			+ "]\n"
    			+ "");
	}
	
    @Test
    public void testVoorhees() {
    	try {
			assertEquals(parser.parse(biblioteca.exportarSocios()),resultado);
		} catch (ParseException e) {
			e.printStackTrace();
		}
    }
    
    @Test
    public void testJson() {
    	biblioteca.setExporter(new VoorheesJson());
    	try {
			assertEquals(parser.parse(biblioteca.exportarSocios()),resultado);
		} catch (ParseException e) {
			e.printStackTrace();
		}
    }
    
    @Test
    public void testJackson() {
    	biblioteca.setExporter(new VoorheesJackson());
    	try {
			assertEquals(parser.parse(biblioteca.exportarSocios()),resultado);
		} catch (ParseException e) {
			e.printStackTrace();
		}
    }
}
