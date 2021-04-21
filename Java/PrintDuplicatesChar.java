package week1_Day2.Assignment;

public class PrintDuplicatesChar {

	public static void main(String[] args) {

		String str = "testleaf";

		int length = str.length();
		char[] ch = str.toCharArray();

		for (int i = 0; i < length; i++) {
			for (int j = i + 1; j < length; j++) {

				if (ch[i] == ch[j]) {

					System.out.println("Duplicates characters are :- " + ch[i]);
					break;
				}
			}
		}
	}
}
