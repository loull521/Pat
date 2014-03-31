package advanced;

import java.util.Scanner;

public class Pat1036 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		Person male = null, female = null;
		for (int i=0; i<n; i++) {
			Person p = new Person();
			p.name = in.next();
			p.gender = in.next();
			p.id = in.next();
			p.score = in.nextInt();
			if (p.gender.equals("F")) {
				if (female == null) female = p;
				else if (female.score < p.score) female = p;
			}
			else {
				if (male == null) male = p;
				else if (male.score > p.score) male = p;
			}
		}
		if (female == null) System.out.println("Absent");
		else System.out.println(female.name + " " + female.id);
		if (male == null) System.out.println("Absent");
		else System.out.println(male.name + " " + male.id);
		if (female != null && male != null) System.out.println(female.score - male.score);
		else System.out.println("NA");
	}
}

class Person {
	String name;
	String gender;
	String id;
	int score;
}