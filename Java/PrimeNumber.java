package week1_Day2.Assignment;

public class PrimeNumber {

	public static void main(String[] args) {

		int num = 9;
		// Assumption 
		boolean prime = true;
		
		for (int i = 2; i < num ; i++) {

			// condition for nonprime number

			if (num % i == 0) {
				prime = false;
				break;
			}
		}

		if (prime)
			System.out.println(num + " is a prime number.");
		else
			System.out.println(num + " is not a prime number.");
	}
}
