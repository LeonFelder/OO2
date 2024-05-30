package objetos2.ejercicio24;

public class Purge extends ProcessStep {

	@Override
	protected boolean basicExecute(MixingTank tank) {
		return (tank.heatPower(0) && tank.mixerPower(0) &&
				tank.purge());
	}

}
