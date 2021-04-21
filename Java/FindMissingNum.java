package week1_Day2.ClassRoom;

import java.util.Arrays;

public class FindMissingNum {

	public static void main(String[] args) {

		int[] num = { 1, 3, 7, 9, 8, 6, 4, 2, 10 };

		Arrays.sort(num);

		for (int i = 0; i < num.length-1; i++) {
			if (num[i] + 1 != num[i + 1]) {
				System.out.println(num[i]+1);
				break;
			}
		}
	}
}
