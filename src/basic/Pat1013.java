package basic;

import java.util.Scanner;

public class Pat1013 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int m = in.nextInt();
		int n = in.nextInt();
		int[] a = new int[2000];
		a[1] = 2;
		a[2] = 3;
		int k = 3;
		for (int i=5; i<10000; i+=2) {
			if (isPrime(i)) {
				a[k++] = i;
			}
		}
		k--;
		if (n > k) n = k;
		if (m < 1) m = 1;
		k = 0;
		for (int i=m; i<=n; i++) {
			if (k == 0) ;
			else if (k%10 != 0) System.out.print(" ");
			else System.out.println();
			k++;
			System.out.print(a[i]);
		}
	}
	
	public static boolean isPrime(int num) {
		if (num == 2 || num == 3) return true;
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
