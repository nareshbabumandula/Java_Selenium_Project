package basics;

public class Variables {
	
	int a=10; // Instance variable
	int b=20; // Instance variable
	
	static int e=100; // static variable
	
	public void Addition()
	{
		int c=30; // Local variable
		int d=a+b+c;
		System.out.println("Addition of a, b & c is : " + d);
		System.out.println("Static variable e value is : " + e);
	}
	
	public void Substraction()
	{
		System.out.println("Value os a is : " + a);
		System.out.println("Static variable e value is : " + e);
	}
	
	public static void Multiplication()
	{
		int f =100*20;
		System.out.println("Multiplication value of f is : " + f);
	}


	public static void main(String[] args) {
	
		Variables var = new Variables(); // Create an object for a class
		System.out.println("Instance variable a value is : " + var.a);
		System.out.println("Instance variable b value is : " + var.b);
		System.out.println("Static variable e value is : " + e);
		var.Addition();
		var.Substraction();
		Multiplication(); // static method
		
	}

}
