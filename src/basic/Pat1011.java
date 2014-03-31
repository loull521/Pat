package basic;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Pat1011 {

	public static void main(String[] args) throws FileNotFoundException {
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream("src\\basic\\1011"));
		System.setIn(bis);
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		for (int i=0; i<n; i++) {
			long a = in.nextLong();
			long b = in.nextLong();
			long c = in.nextLong();
			if (a + b > c)
				System.out.println("Case #2: true");
			else 
				System.out.println("Case #2: false");
		}
	}
}
