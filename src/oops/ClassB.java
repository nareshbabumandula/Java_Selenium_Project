package oops;

public class ClassB extends ClassA {

	int d =100;
	int e = 200;
	
	public void Multiplication()
	{
		int f =d*e;
		System.out.println("Multiplication of d and e is : " + f);
	}
	
	public static void main(String[] args) {
		
		ClassB bb = new ClassB();
		System.out.println(bb.d);
		System.out.println(bb.e);
		bb.Multiplication();
		bb.Addition();
		bb.Substraction();
		System.out.println(bb.a);
		System.out.println(bb.b);
		
	}

}
