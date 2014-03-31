package basic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Pat1020 {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		double[] a = new double[n];
		double[] b = new double[n];
		double[] c = new double[n];
		List<Thing> things = new ArrayList<Thing>();
		int d = in.nextInt();
		for (int i=0; i<n; i++) {
			a[i] = in.nextDouble();
		}
		for (int i=0; i<n; i++) {
			b[i] = in.nextDouble();
			c[i] = b[i] / a[i];
			Thing t = new Thing(a[i], b[i], c[i]);
			things.add(t);
		}
		Collections.sort(things, new Comparator<Thing>() {
			@Override
			public int compare(Thing o1, Thing o2) {
				return ((Double)o2.price).compareTo(o1.price);
			}
		});
		double cost = 0.0;
		for (Thing t : things) {
			if (t.num < d) {
				cost += t.worth;
				d -= t.num;
			}
			else {
				cost += t.price * d;
				break;
			}
		}
		System.out.printf("%.2f",cost);
	}
}

class Thing {
	double num;
	double worth;
	double price;
	Thing() {
	}
	Thing(double a, double b, double c) {
		num = a;
		worth = b;
		price = c;
	}
}
