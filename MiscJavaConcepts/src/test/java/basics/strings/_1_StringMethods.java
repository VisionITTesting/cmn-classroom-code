package basics.strings;

public class _1_StringMethods {

	public static void main(String[] args) {

		//Notes - 
		// String is a class & is a non primitive data type in java
		// Non primitive data types having some functions associated with it
		// String stores values in terms of a collection of Characters with index values

		System.out.println("\n---------------------------------\n");

		// 1. Finding a length of an String
		String str1 = "Hello Everyone Lets learn somthing about String"; 
		System.out.println("The length of str1 string is : " + str1.length());
		// Note - 	1. length() - to calculate the length of String
		//			2. length - is a keyword to calculate length of array

		System.out.println("\n---------------------------------\n");

		// 2. Find character at some specific index value 
		String str2 = "I am learing String in Java";
		System.out.println("Character in string str2 at Second index value is : " + str2.charAt(2));
		System.out.println(str2.length());
		//System.out.println("Character in string str2 at 48th index is : " + str2.charAt(48));

		System.out.println("\n---------------------------------\n");

		// 3. Find index number of a specific character in string
		String str3 = "Hello there";
		System.out.println("Index number of character 'e' in String str3 is : " + str3.indexOf('e'));
		System.out.println("Index number of character 'e' second occurence in String str3 is : " + str3.indexOf('e', 2));
		System.out.println("Index number of character 'e' second occurence in String str3 is : " + str3.indexOf('e', str3.indexOf('e')+1)); // alternate way
		System.out.println("Index number of character 'z' in string str3 is : " + str3.indexOf('z'));

		System.out.println("\n---------------------------------\n");

		// 4. Find start index of a specific word in a string
		String str4 = "GitHub is aquired by microsoft in year 2018";
		System.out.println("Index number for the word \"by\" in string str4 is : " + str4.indexOf("by"));
		System.out.println("Index number for the word \"apple\" in string str4 is : " + str4.indexOf("apple"));

		System.out.println("\n---------------------------------\n");

		// 5. To convert all characters in a string into upper case
		String str5 = "Selenium is used to automate web application";
		System.out.println("Converting string str5 to uppercase : " + str5.toUpperCase());


		System.out.println("\n---------------------------------\n");

		// 6. To convert all characters in a string into upper case
		String str6 = "SELENIUM CANNOt AUTOMATe DEXTOP APPLICATIONS";
		System.out.println("Converting string str6 to uppercase : " + str6.toLowerCase());

		System.out.println("\n---------------------------------\n");

		// 7. To remove empty spaces present before and after from the string
		String str7 = "            Selenium is free automation tool   ";
		System.out.println("After removing extra spaces from before & after of String str7 output is :- " + str7.trim());

		System.out.println("\n---------------------------------\n");

		// 8. To remove some repeating specific character from the string
		String str8 = "15/11/2012"; // 15:11:2012
		System.out.println("After replacing the '/' to ':' str8 becomes " + str8.replace('/', ':'));

		System.out.println("\n---------------------------------\n");

		// 9. To check a specific word available in a string [with Case sensitivity]
		String str9 = "Selenium can handle the html code";
		System.out.println("The availibilty of word \"Selenium\" is : " + str9.contains("Selenium"));

		System.out.println("\n---------------------------------\n");

		// 10. To fetch a part from a string
		String str10 = "The transation number is - 45AdSJ9t";
		System.out.println("The transation number is : " + str10.substring(27));

		System.out.println("\n---------------------------------\n");

		// 11. To fetch a word from a string
		String str11 = "Your transaction number is - 78E354dL thank you";
		String TransationId = str11.substring(29, 37);
		System.out.println("The extracted id from str11 is : " + TransationId);

		System.out.println("\n---------------------------------\n");

		// 12. To compare two strings
		String statement1 = "Java is platform independent";
		String statement2 = "java is platform independent";
		String statement3 = "Java is platform independent";
		System.out.println("Are statement1 & statement2 having exact same content : " + statement1.equals(statement2));
		System.out.println("Are statement1 & statement3 having exact same content : " + statement1.equals(statement3));
		System.out.println("Are statement1 & statement2 having exact same content : " + statement1.equalsIgnoreCase(statement2));

		System.out.println("\n---------------------------------\n");

		// 13. Splitting the String on basis or some specific char
		String str13 = "Java is based on Object Oeriented Programming Principles";
		String[] words = str13.split(" "); 
		for (int i = 0; i < words.length; i++) {
			System.out.println(words[i]);
		}
	}
}
