package Assignment;

import java.util.ArrayList;

public class interview {

	public static void main(String args[]) {

		String str="123-456-789";
		String op=str.replaceAll("[^0-9]", "");
		System.out.println(op);
	}
}
