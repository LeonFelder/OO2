/**
 * 
 */
package objetos2.ejercicio24;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ProcessStepTest {
	
	ProcessStep processStep;
	MixingTank mixingTank;
	
	@BeforeEach
	void setUp() throws Exception {
		mixingTank = new MixingTank();
	}
	
    @Test
    public void testLightMix() {
    	processStep = new LightMix();
    	processStep.execute(mixingTank);
        assertTrue(processStep.isDone());
    }
    
    @Test
    public void testPurge() {
    	processStep = new Purge();
    	processStep.execute(mixingTank);
        assertTrue(processStep.isDone());
    }
}
