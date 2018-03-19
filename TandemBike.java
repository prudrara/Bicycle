package Bicycle;

public class TandemBike extends Bicycle{
	
	public int seats ;
	public int handlebars ;
	
	
	
	
	public TandemBike(int currentSpeed, int currentPedalCadence, int currentGear, int seats, int handlebars) {
		super(currentSpeed, currentPedalCadence, currentGear );
		this.seats = seats;
		this.handlebars = handlebars;
	}

	public int getSeats() {
		return seats;
	}

	public void setSeats(int seats) {
		this.seats = seats;
	}

	public int getHandlebars() {
		return handlebars;
	}

	public void setHandlebars(int handlebars) {
		this.handlebars = handlebars;
	}
	
	

}
