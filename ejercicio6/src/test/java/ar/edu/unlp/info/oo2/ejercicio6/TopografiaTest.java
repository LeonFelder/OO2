package ar.edu.unlp.info.oo2.ejercicio6;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TopografiaTest {
	Topografia top1,top2,top3,top4,top5;
	
	@BeforeEach
	public void setUp() throws Exception {
		top1 = new Agua();
		top2 = new Tierra();
		top3 = new Mixta(top1,top2,new Tierra(),new Agua());
		top4 = new Mixta(top1,top2,new Tierra(),new Mixta(top1,top2,new Tierra(),new Agua()));
		top5 = new Mixta(top1,new Mixta(top1,new Pantano(),new Tierra(),new Agua()),top2,new Pantano());
	}
	
    @Test
    public void testCalcularProporcion() {
        assertEquals(top1.calcularProporcion(), 1);
        assertEquals(top2.calcularProporcion(), 0);
        assertEquals(0.5,top3.calcularProporcion());
        assertEquals(0.375, top4.calcularProporcion());
        assertEquals(0.59375, top5.calcularProporcion());
    }
    
    @Test
    public void testIgualdad() {
        assertTrue(top1.equals(top1));
        assertTrue(top2.equals(top2));
        assertTrue(top3.equals(top3));
        assertTrue(top4.equals(top4));
        assertFalse(top1.equals(top2));
        assertFalse(top2.equals(top3));
        assertFalse(top3.equals(top4));
        assertFalse(top4.equals(top1));
    }
}
