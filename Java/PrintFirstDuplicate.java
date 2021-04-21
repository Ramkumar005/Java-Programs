package week1_Day2.Assignment;

public class PrintFirstDuplicate {

	public static void main(String[] args) {

		String str = "testleafl";
		boolean repeat = false;

		char[] charArray = str.toCharArray();

		for (int i = 0; i < charArray.length; i++) { // e

			for (int j = i+1; j < charArray.length; j++) {// s,t,l,e

				if (charArray[i] == charArray[j]) {  // t==t
					System.out.println(charArray[i]);
					repeat = true;
					break;
				}
			}
			if (repeat) {
			break;
			}
		}
		if (!repeat) {
			System.out.println("There is no duplicate in the given string");

		}
	}
}
