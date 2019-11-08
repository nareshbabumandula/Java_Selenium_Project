package basics;

public class MethodTypes {

	int a=10;
	int b=20;

	// Method without arguments and return type
	public void Addition()
	{
		int c =a+b;
		System.out.println("Addition of a and b is : " + c);
	}

	// Method with arguments and without return type
	public void Substraction(int a, int b)
	{
		int c =a-b;
		System.out.println("Substraction of a and b is : " + c);
	}

	// Method without arguments and with return type
	public int Multiplication()
	{
		int c =a*b;
		return c;
	}

	// Method without arguments and with return type
	public int Division(int a, int b)
	{
		int c =a/b;
		return c;
	}


	public static void main(String[] args) {
		MethodTypes mt = new MethodTypes();
		mt.Addition();
		mt.Substraction(100, 30);
		int d = mt.Multiplication();
		System.out.println("Multiplication of a and b is : " + d);
		int e = mt.Division(200, 100);
		System.out.println("Division of a and b is : " + e);
		

	}

}
