package basic;

import java.util.Scanner;

public class Pat1012 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[] a = new int[5];
		int flag = 1, count = 0;
		boolean[] b = new boolean[5];
		for (int i=0; i<b.length; i++) {
			b[i] = false;
		}
		int N = in.nextInt();
		for (int k=0; k<N; k++) {
			int n = in.nextInt();
			if (n%10 == 0) {
				a[0] += n;
				b[0] = true;
			}
			else if (n%5 == 1) {
				a[1] += n*flag;
				flag *= -1;
				b[1] = true;
			}
			else if (n%5 == 2) {
				a[2]++;
				b[2] = true;
			}
			else if (n%5 == 3) {
				a[3] += n;
				count++;
				b[3] = true;
			}
			else if (n%5 == 4) {
				if (n > a[4]) a[4] = n;
				b[4] = true;
			}
		}
		for (int i=0; i<a.length; i++) {
			if (i != 0) System.out.print(" ");
			if (!b[i]) System.out.print("N");
			else {
				if (i == 3) System.out.printf("%.1f", 1.0*a[i]/count);
				else System.out.print(a[i]);
			}
		}
	}
}
