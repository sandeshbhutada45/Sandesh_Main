package Main;

import java.util.Arrays;

import org.testng.annotations.Test;

public class JavaPracties {
	@Test
	public void test1() {

		String str1 = "Race";
		String str2 = "Care";
		str1=str1.toLowerCase();
		str2=str2.toLowerCase();

		if (str1.length() == str2.length()) {

			char s1[] = str1.toCharArray();

			char s2[] = str2.toCharArray();

			Arrays.sort(s1);
			Arrays.sort(s2);
			boolean result = Arrays.equals(s1, s2);

		      if(result) {
		        System.out.println(str1 + " and " + str2 + " are anagram.");
		      }
		      else {
		        System.out.println(str1 + " and " + str2 + " are not anagram.");
		      }
		   }
	}
}
