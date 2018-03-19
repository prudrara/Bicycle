package Bicycle;

public class Roadbikes extends Bicycle{

	public String handlebars;

	public Roadbikes(int currentSpeed, int currentPedalCadence, int currentGear,String handlebars) {
		super(currentSpeed, currentPedalCadence, currentGear);
		this.handlebars = handlebars;
	}

	public String getHandlebars() {
		return handlebars;
	}

	public void setHandlebars(String handlebars) {
		this.handlebars = handlebars;
	}
	
	
}
