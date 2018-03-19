package Bicycle;

public class MountainBike extends Bicycle {
	
	public String chairRing;
	
	

	public MountainBike(int currentSpeed, int currentPedalCadence, int currentGear, String chairRing) {
		super(currentSpeed, currentPedalCadence, currentGear);
		this.chairRing = chairRing;
	}

	

	public String getChairRing() {
		return chairRing;
	}

	public void setChairRing(String chairRing) {
		this.chairRing = chairRing;
	}
	
	

}
