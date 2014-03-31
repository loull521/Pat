package basic;

import java.util.Scanner;

public class Pat1006 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int i = in.nextInt();
		int b = i/100;
		int s = i%100/10;
		int n = i % 10;
		for (int j=0; j<b; j++)
			System.out.print('B');
		for (int j=0; j<s; j++)
			System.out.print('S');
		for (int j=1; j<=n; j++) {
			System.out.print(j);
		}
	}
}
