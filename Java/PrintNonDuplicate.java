package week1_Day2.Assignment;

public class PrintNonDuplicate {

	public static void main(String[] args) {

		String str = "testleafl1";

		for (int i = 0; i < str.length(); i++) {

			char ch = str.charAt(i);
			boolean repeat = false;

			for (int j = i + 1; j < str.length(); j++) {

				if (ch == str.charAt(j)) {
					System.out.println(ch + " :- " + "Repeated");
					repeat = true;
					break;
				}
			}
			if (!repeat) {
				System.out.println(ch + " :- " + "Not Repeated");
				break;
			}
		}
	}
}