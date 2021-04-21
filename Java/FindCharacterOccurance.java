package week1_Day2.ClassRoom;

public class FindCharacterOccurance {

	public static void main(String[] args) {

// Using Iteration :-
		
		String company = "Testleaf";
		char c = 't';
		int count = 0; //Assign

		company = company.toLowerCase();
		char[] charArray = company.toCharArray();

		for (int i = 0; i < charArray.length; i++) {
			if (charArray[i] == c) {
				count++;
			}
		}
		System.out.println(c + " is present " + count + " times ");
		
		
// Without iteration :-
		
		// Convert the inputs to a uniform format
		/*
		String company = "Testleaf";
		char c = 't';
		
		company = company.toUpperCase();
		String charC = Character.toString(c).toUpperCase();
		
		
		// Find the length of the actual input
		int length = company.length();
		System.out.println("Total length :- " +length);
		
		// Replace the c character with empty string
		company = company.replace(charC, "");
		
		// Find the length after replacing
		int length2 = company.length();
		System.out.println("Length after Replacing :- " +length2);
		
		// Occurance = actual length - length after replacing
		System.out.println(length - length2); */
		
	}
}
