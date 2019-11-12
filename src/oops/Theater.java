package oops;

public abstract class Theater {
	
	public abstract void Parking(); // Bodyless method or abstract method
	public abstract void Caferia(); 
	public abstract void CounterBooking(); 
	public abstract void FireAndSafety(); 
	
	// Non abstract or method with body
	public void SoundSystem()
	{
		System.out.println("360 degrees dolby digital sound system is available");
	}
		
	public void SeatingTypes()
	{
		System.out.println("Seating types are deluxe, general etc");
	}

}
