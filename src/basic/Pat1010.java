package basic;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Pat1010 {

	public static void main(String[] args) throws FileNotFoundException {
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream("src\\basic\\1010"));
		System.setIn(bis);
		Scanner in = new Scanner(System.in);
		boolean flag = true;
		while (in.hasNext()) {
			int i = in.nextInt();
			int e = in.nextInt();
			if (i * e != 0) {
				if (flag) flag = false;
				else System.out.print(" ");
				System.out.print(i*e + " " + (e-1));
			}
		}
		if (flag) System.out.print("0 0");
	}
}
