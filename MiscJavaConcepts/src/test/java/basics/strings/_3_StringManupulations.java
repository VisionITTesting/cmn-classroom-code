package basics.strings;

public class _3_StringManupulations {

	public static void main(String[] args) {
		
		String x = "Test";
		String y = "Seleium";
		String c = "100";
		String d = "200";
		int a = 100;
		int b = 200;

		System.out.println("\n---------------------------------\n");
		
		// 1. 
		System.out.println(a+b); // 300
		
		// 2. 
		System.out.println(x+y); // TestSelenium
		
		// 3.
		System.out.println(a+b+x); // 300Test
		
		// 4.
		System.out.println(a+b+x+y); // 300TestSelenium
		
		// 5.
		System.out.println(x+y+a); // TestSelenium100 
		
		// 6.
		System.out.println(x+y+a+b); // TestSelenium100200
		
		System.out.println(c+d); // 100200
		
		// Use case
		int bill = 520;
		int tax = 30;
		int total = bill+tax;
		System.out.println("Food Bill is : " + total);
		System.out.println("Food Bill is : " + (bill+tax));

	}

}