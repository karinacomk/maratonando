import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Solution {

	static String isValid(String s) {
		HashMap<Character, Integer> count_char = new HashMap<Character, Integer>();
		int del_count = 0;
		String result = "YES";

		for (int i = 0; i < s.length(); i++) {
			if (count_char.containsKey(s.charAt(i))) {
				count_char.put(s.charAt(i), count_char.get(s.charAt(i)) + 1);
			} else {
				count_char.put(s.charAt(i), 1);
			}
		}
		int current = 0;
		for (Map.Entry<Character, Integer> count : count_char.entrySet()) {
			if (current == 0) {
				System.out.println("CURRENT = 0");
				System.out.println("key = " + count.getKey());
				System.out.println("value = " + count.getValue());
				current = count.getValue();
			} else {
				System.out.println("\nkey = " + count.getKey());
				System.out.println("value = " + count.getValue());
				int diff = Math.abs(current - count.getValue());
				
				System.out.println("Diff = " + diff);
				System.out.println("Count = " + count.getValue());
				
				if (count.getValue() > 1 && diff > 0) {
					del_count += diff;
				} else if (count.getValue() == 1 && diff > 0) {
					del_count++;
				}
				
				System.out.println("Qtos deletar = " + del_count);
			}
		}
		if (del_count > 1) {
			result = "NO";
		}
		return result;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.next();
		String result = isValid(s);
		System.out.println("\n"+result);
	}
}
