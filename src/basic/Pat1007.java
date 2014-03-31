package basic;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Pat1007 {

	static List<Integer> primes = new ArrayList<Integer>();

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		if (n <= 4) {
			System.out.println(0);
			return;
		}
		int count = 0;
		for (int i = 3; i < n - 1;) {
			if (isPrime(i) && isPrime(i + 2))
				count++;
			i += 2;
		}
		System.out.println(count);
	}

	static boolean isPrime(int num) {
		if (num == 2 || num == 3) {
			return true;
		}
		if (num % 6 != 1 && num % 6 != 5) {
			return false;
		}
		for (int i = 5; i * i <= num; i += 6) {
			if (num % i == 0 || num % (i + 2) == 0) {
				return false;
			}
		}
		return true;
	}
}
