package week1_Day2.ClassRoom;

public class ReverseWords {

	public static void main(String[] args) {

		String rev = "Today is a Beautiful Day";

		String[] split = rev.split(" ");

		for (int i = split.length - 1; i >= 0; i--) {

			System.out.print(split[i] + " ");
		}
	}
}
