package oops;

public class IMAX extends Theater {

	public static void main(String[] args) {
		IMAX im = new IMAX();
		im.SeatingTypes();
		im.SoundSystem();
		im.Parking();
		im.Caferia();
		im.FireAndSafety();
		im.CounterBooking();
	}


	public void Parking() {
		System.out.println("Bike Parking facility is available for 500 bikes");
		System.out.println("Car Parking facility is available for 100 bikes");
	}


	public void Caferia() {
		System.out.println("Cafeteria is available");
	}

	public void CounterBooking() {
		System.out.println("CounterBooking facility is available");
	}

	
	public void FireAndSafety() {
		System.out.println("FireAndSafety is available");
	}

}
