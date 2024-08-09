package Assignment;

import java.util.HashMap;

public class interview {

	public static void main(String args[]) {

		String str = "Sandesh Bhutada";
		String rev="";
		for (int i = str.length()-1; i >= 0; i--) {
			rev=rev+str.charAt(i);
		}
		System.out.println(rev);
	}
}
