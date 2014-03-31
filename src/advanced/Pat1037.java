package advanced;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Pat1037 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
//		int nc = in.nextInt();
//		int[] cs = new int[nc];
//		for (int i=0; i<nc; i++) cs[i] = in.nextInt();
//		int np = in.nextInt();
//		int[] ps = new int[np];
//		for (int i=0; i<np; i++) ps[i] = in.nextInt();
//		Arrays.sort(cs);
//		Arrays.sort(ps);
		int nc = in.nextInt();
		List<Integer> cs = new ArrayList<Integer>();
		for (int i=0; i<nc; i++) cs.add(in.nextInt());
		int np = in.nextInt();
		List<Integer> ps = new ArrayList<Integer>();
		for (int i=0; i<np; i++) ps.add(in.nextInt());
		Collections.sort(cs);
		Collections.sort(ps);
		int k = Math.min(nc, np);
		int sum = 0;
		for (int i=0; i<k; i++) {
			if (cs.get(i)<0 && ps.get(i)<0) {
				sum += cs.get(i) * ps.get(i);
			}
			if (cs.get(nc-1-i)>0 && ps.get(np-1-i)>0) {
				sum+= cs.get(nc-1-i) * ps.get(np-1-i);
			}
		}
		System.out.println(sum);
	}
}
