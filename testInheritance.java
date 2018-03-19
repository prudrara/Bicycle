package Bicycle;

public class testInheritance {

	public static void main (String[] args)
	{
		TandemBike bike1 = new TandemBike(35,40,3,2,2);
		System.out.println("The seats are " + bike1.seats);
		
		MountainBike bike2 = new MountainBike(33,40,3,"Alloy");
		System.out.println("The chain ring is made up of " + bike2.chairRing);
		
		Roadbikes bike3 = new Roadbikes(39,40,3,"Drop");
		System.out.println("The handle bar type is " + bike3.handlebars);
		
	
		
		
	}
}
