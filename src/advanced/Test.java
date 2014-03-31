package advanced;

import java.util.Collections;
import java.util.regex.Pattern;

public class Test {

	public static void main(String[] args) {
		System.out.println(Pattern.matches(".*[l1O0].*", "jfk;jakfjLojkj"));
		String s = "loull";
		s = s.replace("l", "L");
		System.out.println(s);
		
		System.out.println(1 & 5);
		Collections.reverseOrder();
	}
}
