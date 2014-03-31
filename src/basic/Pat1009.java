package basic;

import java.util.Scanner;

public class Pat1009 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String line = in.nextLine();
		String[] ss = line.split(" ");
		for (int i=ss.length-1; i>=0; i--) {
			if (i != ss.length -1) System.out.print(" ");
			System.out.print(ss[i]);
		}
	}
}
