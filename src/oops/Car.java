package oops;

public class Car {

	
	// State or Characteristics
	String Make = "Honda";
	String Color = "Modern Metallic Steel";
	int Price = 9450000;
	static String Model = "EXI";
	int noOfWheels = 4;
	int Speed = 160;
			
	//Behavior or Action
	public void Speed()
	{
		System.out.println("Max speed of Honda car is : " + Speed + " km/hr");
	}
	
	public void Accelerate()
	{
		System.out.println("Accelerate feature is available");
	}
	
	public static void Brake()
	{
		System.out.println("Car has ABS");
	}
	
	public Car() {
		System.out.println("This is a no argument constructor");
	}
	
	
	public static void main(String[] args) {
		
		Car cs = new Car();
		System.out.println(cs.Make);
		System.out.println(cs.Color);
		System.out.println(cs.Price);
		System.out.println(Model);
		System.out.println("No of wheels are : " + cs.noOfWheels);
		System.out.println(cs.Speed);
		
		cs.Speed();
		cs.Accelerate();
		Brake();

	}

}
