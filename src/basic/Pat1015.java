package basic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Pat1015 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int L = in.nextInt();
		int H = in.nextInt();
		List<Item> list1 = new ArrayList<Item>();
		List<Item> list2 = new ArrayList<Item>();
		List<Item> list3 = new ArrayList<Item>();
		List<Item> list4 = new ArrayList<Item>();
		for (int i=0; i<n; i++) {
			Item item = new Item();
			item.number = in.nextInt();
			item.ds = in.nextInt();
			item.cs = in.nextInt();
			if (item.ds >= H && item.cs >= H) list1.add(item);
			else if (item.ds >= H && item.cs >= L && item.cs < H) list2.add(item);
			else if (item.ds > item.cs && item.ds < H && item.cs >= L) list3.add(item);
			else if (item.ds >=L && item.cs >= L) list4.add(item);
		}
		Comparator<Item> cmp = new Comparator<Item>() {
			@Override
			public int compare(Item o1, Item o2) {
				int cd = o2.cs + o2.ds - o1.cs - o1.ds;
				if (cd != 0) return cd;
				else {
					int d = o2.ds - o1.ds;
					if (d != 0) return d;
					else {
						return o1.number - o2.number;
					}
				}
			}
		};
		Collections.sort(list1, cmp);
		Collections.sort(list2, cmp);
		Collections.sort(list3, cmp);
		Collections.sort(list4, cmp);
		System.out.println(list1.size() + list2.size() + list3.size() + list4.size());
		for (Item e : list1) System.out.println(e);
		for (Item e : list2) System.out.println(e);
		for (Item e : list3) System.out.println(e);
		for (Item e : list4) System.out.println(e);
	}
}

class Item {
	int number;
	int ds;
	int cs;
	@Override
	public String toString() {
		return number + " " + ds + " " + cs;
	}
}