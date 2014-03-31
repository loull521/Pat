package basic;

import java.util.Scanner;

public class Pat1008 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		int[] nums = new int[n];
		for (int i=0; i<n; i++) {
			nums[i] = in.nextInt();
		}
		m = m%n;
		if (m == 0) {
			for (int i=0; i<n; i++) {
				if (i !=0 ) System.out.print(" ");
				System.out.print(nums[i]);
			}
			return;
		}
		for (int i=n-m; i<n; i++) {
			if (i != n-m) System.out.print(" ");
			System.out.print(nums[i]);
		}
		for (int i=0; i<n-m ;i++) {
			System.out.print(" " + nums[i]);
		}
	}
}
