package week1_Day2.Assignment;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {

		// Method 1 :-

		/*
		 * @SuppressWarnings("resource") Scanner 
		 * scan = new Scanner(System.in);
		 * System.out.println("Enter your input"); 
		 * String str = scan.nextLine(); String
		 * rev = ""; 
		 * char[] palArray = str.toCharArray();
		 * 
		 * for (int i = palArray.length-1; i >=0; i--) {
		 *  rev = rev+palArray[i]+"";
		 * 
		 * //System.out.println(rev);
		 *  }
		 * 
		 * if(rev.equals(str)) { 
		 * System.out.println("Given string is a palindrome"); 
		 * }
		 * else { System.out.println("Given string is not a palindrome"); }
		 */

		// Method 2 :-

		String str = "madam";
		int i = 0;
		int j = str.length() - 1;

		while (i < j) {

			if (str.charAt(i) != str.charAt(j)) {

				System.out.println("NOT a Palindrome");
				break;
			}
			i++;
			j--;
		}
		System.out.println("It's a Palindrome");
	}
}
