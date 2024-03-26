/**
 * 
 */
package objetos.ejercicio2;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SistemaTest {
	private Jugada papel,piedra,tijera,lagarto,spock;
	
	@BeforeEach
	void setUp() throws Exception {
		papel = new Papel();
		piedra = new Piedra();
		tijera = new Tijera();
		spock = new Spock();
		lagarto = new Lagarto();
	}
	
    @Test
    public void testJugar() {
    	assertEquals(papel.jugar(piedra),"Gana papel");
    	assertEquals(piedra.jugar(papel),"Gana papel");
    	assertEquals(piedra.jugar(piedra),"Empate");
    	assertEquals(tijera.jugar(spock),"Gana Spock");
    }
}
