package week1_Day2.Assignment;

public class RemoveVowels {

	public static void main(String[] args) {

		String str = "I am Mechanical Engineer working in Software";

		String Vowels = str.replaceAll("[AEIOUaeiou]", "");
		System.out.println(Vowels);
	}
}
