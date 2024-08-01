package Questions;

import java.util.HashMap;

public class CountCaptialCharchter {

	public static void main(String[] args) {
		String s = "SandeshBhutadagshHRYYS";

		int count = 0;
		for (int i = 0; i <= s.length() - 1; i++) {
			if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') {
				count++;
			}
		}
		System.out.println(count);

		// Using HASHMAP

		char[] chars = s.toCharArray();

		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		for (char ch : chars) {
			if (ch >= 'A' && ch <= 'Z') {
				if (map.containsKey(ch)) {
					int size = map.get(ch);
					map.put(ch, size + 1);
				} else {
					map.put(ch, 1);
				}
			}
		}
		System.out.println(map);

	}

}
