package oops;

public class ClassA {
	
	int a=10;
	int b=20;
	
	public void Addition()
	{
		int c =a+b;
		System.out.println("Addition of a and b is : " + c);
	}
	
	public void Substraction()
	{
		int c =b-a;
		System.out.println("Substraction of a and b is : " + c);
	}

	public static void main(String[] args) {
		ClassA obj = new ClassA();
		System.out.println(obj.a);
		System.out.println(obj.b);
		obj.Addition();
		obj.Substraction();
	}

}
