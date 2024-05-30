package objetos2.ejercicio24;

public class LightMix extends ProcessStep {

	@Override
	protected boolean basicExecute(MixingTank tank) {
		double temp = tank.temperature();
		tank.heatPower(100);
		tank.delay(2);
		if (tank.temperature()-temp == 10) {
			tank.mixerPower(5);
			return true;
		}
		else {
			return false;
		}
	}

}
