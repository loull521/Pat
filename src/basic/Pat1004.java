package basic;

import java.util.Scanner;

public class Pat1004 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		Student maxStu=null, minStu=null;
		for (int i=0; i<n; i++) {
			Student stu = new Student();
			stu.name = in.next();
			stu.number = in.next();
			stu.score = in.nextInt();
			if (i == 0) {
				maxStu = stu;
				minStu = stu;
			}
			else {
				if (maxStu.score < stu.score) maxStu = stu;
				if (minStu.score > stu.score) minStu = stu;
			}
		}
		System.out.println(maxStu.name + " " + maxStu.number);
		System.out.println(minStu.name + " " + minStu.number); 
	}
}

class Student {
	String name;
	String number;
	int score;
}
