package basic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Pat1005 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		List<Integer> keys = new ArrayList<Integer>();
		for (int i=0; i<n; i++) {
			keys.add(in.nextInt());
		}
		Set<Integer> keyset = new HashSet<Integer>(keys);
		Iterator<Integer> it = keys.iterator();
		while (it.hasNext()) {
			Integer key = it.next();
			if (key == 1) keyset.remove(1);
			while (key != 1) {
				if (key%2 == 0) {
					key /= 2;
				}
				else {
					key = (key*3 + 1) / 2;
				}
				keyset.remove(key);
			}
		}
		keys = new ArrayList<Integer>(keyset);
		Collections.sort(keys, new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
				return o2 - o1;
			}
		});
		boolean flag = true;
		for (Integer key : keys) {
			if (flag) flag = false;
			else System.out.print(" ");
			System.out.print(key);
		}
	}
}
