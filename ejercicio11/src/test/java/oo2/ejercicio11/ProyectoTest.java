/**
 * 
 */
package oo2.ejercicio11;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ProyectoTest {
	Proyecto proyect;
	
	@BeforeEach
	void setUp() throws Exception {
		proyect = new Proyecto ("Vacaciones de invierno",LocalDate.of(2024, 4, 5),LocalDate.now(),"salir con amigos",3,1000);
	}
	
    @Test
    public void testGetCosto() {
        assertEquals(36000, proyect.getCosto());
    }
    
    @Test
    public void testGetPrecio() {
        assertEquals(38520, proyect.getPrecio());
    }
    
    @Test
    public void testModificarMargenConstruccion() {
    	proyect.modificarMargen(0.06);
        assertEquals(38520, proyect.getPrecio());
        proyect.modificarMargen(0.08);
        assertEquals(38880, proyect.getPrecio());
        proyect.modificarMargen(0.1);
        assertEquals(39600, proyect.getPrecio());
        proyect.modificarMargen(0.11);
        assertEquals(39600, proyect.getPrecio());
    }
    
    @Test
    public void testModificarMargenEvaluacion() {
    	proyect.aprobarEtapa();
        proyect.modificarMargen(0.1);
        assertEquals(38520, proyect.getPrecio());
        proyect.modificarMargen(0.11);
        assertEquals(39960, proyect.getPrecio());
        proyect.modificarMargen(0.15);
        assertEquals(41400, proyect.getPrecio());
        proyect.modificarMargen(0.16);
        assertEquals(41400, proyect.getPrecio());
    }
    
    @Test
    public void testModificarMargen() {
    	proyect.aprobarEtapa();
    	proyect.aprobarEtapa();
        proyect.modificarMargen(0.1);
        assertEquals(38520, proyect.getPrecio());
        proyect.aprobarEtapa();
        proyect.modificarMargen(0.1);
        assertEquals(38520, proyect.getPrecio());
    }
}
