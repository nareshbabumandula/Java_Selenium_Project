package basics;

public class StringMethods {
	
	/**
	 * @Method StringMethodsExample
	 * @Description This method is used to perform various actions/manipulations on a string
	 * @Input NA
	 * @Output NA
	 * @throws
	 * @author NareshBabu
	 */
	public void StringMethodsExample()
	{
		String sText1 = "hello world";
		String sText2 = "this is core java";
		String sText3 = "WELCOME";
		String sText4 = "java training";
		String sText5 = "             core java training   ";
		String sText6 = "To create your account, we'll need some basic information about you";
				
		System.out.println(sText1.toUpperCase()); // Convert the string to uppercase
		System.out.println(sText1.length()); // Length of the string
		System.out.println(sText2.charAt(0)); // Character at given index
		System.out.println(sText3.toLowerCase()); // Convert the string to lowercase
		System.out.println(sText4.contains("java"));
		System.out.println(sText5.trim());
		System.out.println(sText1.concat(" ").concat(sText2));
		System.out.println(sText1 + " " + sText2);
		System.out.println(sText2.indexOf("core"));
		System.out.println(sText1.indexOf('o'));
		System.out.println(sText1.lastIndexOf('o'));
		System.out.println(sText2.startsWith("this"));
		System.out.println(sText1.equalsIgnoreCase("HELLO WORLD"));
		System.out.println(sText4.replace("java", "core java"));
		System.out.println(sText1.endsWith("world"));
		System.out.println("String empty status is : " + sText3.isEmpty());
		System.out.println(sText2.substring(0, 4));
			
		String asText[] = sText6.split(" ");
		System.out.println(asText[0]);
		System.out.println(asText.length);
		System.out.println(sText6.join(">", asText));
		
		for (int i = 0; i < asText.length; i++) {
			System.out.println(asText[i]);
		}
		
		for (String value : asText) {
			System.out.println(value);
		}
	}
	
	public static void main(String[] args) {
		StringMethods sm = new StringMethods();
		sm.StringMethodsExample();

	}

}
