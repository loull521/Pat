package advanced;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Pat1038 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		List<String> list = new ArrayList<String>();
		for (int i=0; i<n; i++) {
			list.add(in.next());
		}
//		Comparator<String> cmp = new Comparator<String>() {
//			@Override
//			public int compare(String o1, String o2) {
//				int m = Math.max(o1.length(), o2.length());
//				for (int i=0; i<m; i++) {
//					int diff = o1.charAt(i%o1.length()) - o2.charAt(i%o2.length());
//					if ( diff != 0) return diff;
//				}
//				return 0;
//			}
//		};
		Comparator<String> cmp = new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				String s1 = o1 + o2;
				String s2 = o2 + o1;
				return s1.compareTo(s2);
			}
		};
		Collections.sort(list, cmp);
		StringBuffer bf = new StringBuffer();
		for (int i=0; i<list.size(); i++) {
//			if (i==0) System.out.print(Integer.parseInt(list.get(i)));
//			else System.out.print(list.get(i));
			bf.append(list.get(i));
		}
		int i;
		for (i=0; i<bf.length(); i++){
			if(bf.charAt(i) != '0') break;
		}
		bf.delete(0, i);
		if (bf.length() == 0) System.out.println("0");
		else System.out.println(bf.toString());
	}
}
