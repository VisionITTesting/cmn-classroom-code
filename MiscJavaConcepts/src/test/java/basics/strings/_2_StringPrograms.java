package basics.strings;

public class _2_StringPrograms {

	public static void main(String[] args) {
		
		// Simple String with some data
		String str1 = "Java Python Php Dotnet Perl Ruby Javascript"; // 
		System.out.println(str1.length());
		
		// Transferring String data to char array
		char words[] = str1.toCharArray();
		System.out.println(words.length);

		System.out.println("\n---------------------------------\n");
		
		// printing data of char array
		for (int i = 0; i < words.length; i++) {
			System.out.print(words[i] + " ");
		}

		System.out.println("\n---------------------------------\n");
		
		// printing the string into reverse order
		for (int i = (words.length-1); i >= 0; i--) {
			System.out.print(words[i]);
		}

		System.out.println("\n---------------------------------\n");
		
		// Reversing every word in the string
		String temp[] = str1.split(" ");
		
		for (int i = 0; i < temp.length; i++) {
			
			char temp1[] = temp[i].toCharArray();
			
			for (int j = (temp1.length-1); j >= 0; j--) 
			{
				System.out.print(temp1[j]);
			}
			System.out.print(" ");
		}
		

	}

}