package oops;

public class MethodOverriding extends MethodOverloading {

	String USERNAME = "Ravi"; 
	
	public void Addition(int a, int b)
	{
		int c = a+b;
		System.out.println("Addition if Integer a and b in subclass is : " + c);
	}

	public void Demo()
	{
		super.Addition(10, 20);
		this.Addition(10, 20);
		System.out.println(super.USERNAME);
		System.out.println(this.USERNAME);
		
	}
	
	public static void main(String[] args) {
		MethodOverriding mo = new MethodOverriding();
		//mo.Addition(10, 50); // Method overriding or runtime polymorphism
		mo.Demo();
		System.out.println(mo.USERNAME);
	}

}
