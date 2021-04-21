package week1_Day2.Assignment;

public class TwoSumNum {

	public static void main(String[] args) {

		int[] num = { 1, 2, 3, 4, 5 };
		int k = 6;
		boolean bMatch = false;

		for (int i = 0; i < num.length; i++) {

			for (int j = i + 1; j < num.length; j++) {

				if (num[i] + num[j] == k) {

					bMatch = true;
					System.out.println("True");
					break;
				}
			}
			if (bMatch)
				break;
		}
		if (!bMatch) {
			System.out.println("False");
		}
	}
}