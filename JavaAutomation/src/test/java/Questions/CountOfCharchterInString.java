package Questions;

import java.util.HashMap;

public class CountOfCharchterInString {

	public static void main(String[] args) {
		String s = "absahysnb";
		char[] chars = s.toCharArray();
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();

		for (char ch : chars) {
			if (map.containsKey(ch)) {
				int count = map.get(ch);
				map.put(ch, count + 1);
			} else {
				map.put(ch, 1);
			}
		}
		System.out.println(map);

	}
}
