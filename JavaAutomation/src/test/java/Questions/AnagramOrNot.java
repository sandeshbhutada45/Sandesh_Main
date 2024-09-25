package Questions;

import java.util.Arrays;

public class AnagramOrNot {

	public static void main(String[] args) {
		String str1 = "Care";
		String str2 = "Race";
		str1 = str1.toLowerCase();
		str2 = str2.toLowerCase();

		if (str1.length() == str2.length()) {
			char[] s1 = str1.toCharArray();
			char[] s2 = str2.toCharArray();

			Arrays.sort(s1);
			Arrays.sort(s2);
			boolean result = Arrays.equals(s1, s2);

			if (result) {
				System.out.println(str1 + " and " + str2 + " are anagram.");
			} else {
				System.out.println(str1 + " and " + str2 + " are not anagram.");
			}
		}

		else {
			System.out.println(str1 + " and " + str2 + " are not anagram.");
		}
	}
}
