package basic;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Pat1002 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.next();
		int n = 0;
		for (int i=0; i<s.length(); i++) {
			n += s.charAt(i) - '0';
		}
//		System.out.println(n);
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(0, "ling");
		map.put(1, "yi");
		map.put(2, "er");
		map.put(3, "san");
		map.put(4, "si");
		map.put(5, "wu");
		map.put(6, "liu");
		map.put(7, "qi");
		map.put(8, "ba");
		map.put(9, "jiu");
		s = n + "";
		for (int i=0; i<s.length(); i++) {
			Integer key = Integer.parseInt(s.charAt(i)+"");
			if(i != 0)
				System.out.print(" ");
			System.out.print(map.get(key));
		}
	}
}
