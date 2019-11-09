package oops;

public class MethodOverloading {
	
	String USERNAME = "naresh";
	
	public void Addition(int a, int b)
	{
		int c = a+b;
		System.out.println("Addition if Integer a and b is : " + c);
	}

	public void Addition(int a, int b, int c)
	{
		int d = a+b+c;
		System.out.println("Addition if Integer a,b and c is : " + d);
	}
	
	public void Addition(float a, float b)
	{
		float c = a+b;
		System.out.println("Addition if Float a and b is : " + c);
	}

	public void Addition(double a, double b)
	{
		double c = a+b;
		System.out.println("Addition if Double a and b is : " + c);
	}

	
	public static void main(String[] args) {
		
		MethodOverloading mo = new MethodOverloading();
		mo.Addition(10,30,40); // Method overloading or compile polymorphism

	}

}
