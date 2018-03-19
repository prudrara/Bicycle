package Bicycle;

public class Bicycle {

	public int currentSpeed;
	public int currentPedalCadence;
	public int currentGear;
	
	
	
	public Bicycle(int currentSpeed, int currentPedalCadence, int currentGear) {
		super();
		this.currentSpeed = currentSpeed;
		this.currentPedalCadence = currentPedalCadence;
		this.currentGear = currentGear;
	}
	public int getCurrentSpeed() {
		return currentSpeed;
	}
	public void setCurrentSpeed(int currentSpeed) {
		this.currentSpeed = currentSpeed;
	}
	public int getCurrentPedalCadence() {
		return currentPedalCadence;
	}
	public void setCurrentPedalCadence(int currentPedalCadence) {
		this.currentPedalCadence = currentPedalCadence;
	}
	public int getCurrentGear() {
		return currentGear;
	}
	public void setCurrentGear(int currentGear) {
		this.currentGear = currentGear;
	}
	
	
	
	
}
