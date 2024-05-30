package objetos2.ejercicio24;

public abstract class ProcessStep {
	private boolean result;
	
	public void execute (MixingTank tank) {
		if (this.basicExecute(tank)) {
			this.setSucces();
		}
		else this.setFailure();
	}
	
	protected abstract boolean basicExecute (MixingTank tank);
	
	public boolean isDone () {
		return result;
	}
	
	private void setSucces () {
		result = true;
	}
	
	private void setFailure () {
		result = false;
	}
}
