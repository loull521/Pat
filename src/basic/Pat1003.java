package basic;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Pat1003 {

	public static void main(String[] args) throws FileNotFoundException {
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream("src\\basic\\1003"));
		System.setIn(bis);
		
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		for (int i=0; i<n; i++) {
			String s = in.next();
			if (checkPAT(s))
				System.out.println("YES");
			else
				System.out.println("NO");
		}
	}
	
	private static boolean checkPAT(String s) {
		int i;
		for (i=0; i<s.length(); i++) {
			char c = s.charAt(i);
			if (c == 'A') continue;
			else if (c == 'P') break;
			else return false;
		}
		if (i == s.length()) return false;
		int a = i;
		for (i=i+1; i<s.length(); i++) {
			char c = s.charAt(i);
			if (c == 'A') continue;
			else if (c == 'T') break;
			else return false;
		}
		if (i == s.length()) return false;
		int b = i - a - 1;
		if (b == 0) return false;
		for (i=i+1; i<s.length(); i++) {
			char c = s.charAt(i);
			if (c != 'A') return false;
		}
		int c = i - a - b - 2;
		if (c == a * b)
			return true;
		return false;
	}
}
