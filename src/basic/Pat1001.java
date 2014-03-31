package basic;

import java.util.Scanner;

public class Pat1001 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int count = 0;
		int n = in.nextInt();
//		int n = 3;
		if(n == 1){
			System.out.println(0);
			return;
		}
		while(n != 1) {
			if (n%2 == 0) {
				n /= 2;
				count ++;
			}
			else {
				n = (3*n + 1) / 2;
				count ++;
			}
		}
		System.out.println(count);
	}
}
