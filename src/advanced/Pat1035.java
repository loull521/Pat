package advanced;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Pat1035 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		List<Map.Entry<String, String>> list = new ArrayList<Map.Entry<String,String>>();
		for (int i=0; i<n; i++) {
			String name = in.next();
			String pwd = in.next();
			if (Pattern.matches(".*[l1O0].*", pwd)) {
				pwd = pwd.replaceAll("l", "L");
				pwd = pwd.replaceAll("1", "@");
				pwd = pwd.replaceAll("0", "%");
				pwd = pwd.replaceAll("O", "o");
				list.add(new AbstractMap.SimpleEntry(name,pwd));
			}
		}
		if (list.size() == 0) {
			if (n == 1)
				System.out.printf("There is 1 account and no account is modified");
			else
				System.out.printf("There are %d accounts and no account is modified", n);
		}
		else {
			System.out.println(list.size());
			for (Map.Entry<String, String> p : list) {
				System.out.println(p.getKey() + " " + p.getValue());
			}
		}
	}
}
