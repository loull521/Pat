package advanced;

import java.util.Arrays;
import java.util.Scanner;

public class Pat1037_2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int nc = in.nextInt();
		int[] cs = new int[nc];
		for (int i=0; i<nc; i++) cs[i] = in.nextInt();
		int np = in.nextInt();
		int[] ps = new int[np];
		for (int i=0; i<np; i++) ps[i] = in.nextInt();
		Arrays.sort(cs);
		Arrays.sort(ps);
		int k = Math.min(nc, np);
		int sum = 0;
		for (int i=0; i<k; i++) {
			if(cs[i]<0 && ps[i]<0) {
				sum += cs[i]*ps[i];
			}
			if (cs[nc-1-i]>0 && ps[np-1-i]>0) {
				sum += cs[nc-1-i]*ps[np-1-i];
			}
			if (cs[i]>=0 && cs[nc-1-i]<=0) break;
		}
		System.out.println(sum);
	}
}
