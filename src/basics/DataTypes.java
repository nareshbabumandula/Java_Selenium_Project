package basics;

public class DataTypes {

		
	public static void main(String[] args) {
			
		// Primitive datatypes
		int a =10;
		float b=12.66f;
		boolean c= true;
		boolean d= false;
		double e = 123.234324;
		char f = 'g';
		long l = 213234;
		byte j = 127;
		short s = 2334;
		System.out.println("Below are primitive datatypes..!");
		System.out.println("Integer value of a is : " + a);
		System.out.println("Float value of b is : " + b);
		System.out.println("Boolean value of c is : " + c);
		System.out.println("Boolean datatype value of d is : " + d);
		System.out.println("Double value of e is : " + e);
		System.out.println("Char value of f is : " + f);
		System.out.println("Long value of l is : " + l);
		System.out.println("Byte value of j is : " + j);
		System.out.println("Byte value of s is : " + s);
		System.out.println("Demo");
		System.out.println("Test");
		System.out.println("Non Primitive data types");
		String strText = "Hello world, this is core java";
		System.out.println(strText.toUpperCase());
		
		//Array
		int marks[] = {50, 80, 90, 30, 40};
		System.out.println(marks[0]);
		
		for (int mark : marks) {
			System.out.println(mark);
		}
		
		//Casting - Converting one type of data to another type
		
		int a1 = 129;
		byte b2 = (byte)a1; //storing a bigger datatype value into a smaller one - Narrowing
		System.out.println(b2);
		
		byte b3 = 125;
		int a4 = b3; //storing a smaller datatype value into a bigger one - Widening
		System.out.println(a4);
		
		
	}

}
