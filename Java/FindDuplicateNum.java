package week1_Day2.Assignment;

import java.util.Arrays;

public class FindDuplicateNum {

	public static void main(String[] args) {

		int[] input = { 10, 12, 14, 11, 12, 13, 10, 16 };

		Arrays.sort(input);
		int length = input.length;

		for (int i = 0; i < length - 1; i++) {
			if (input[i] == input[i + 1]) {

				System.out.println(input[i]);

			}
		}
	}
}
