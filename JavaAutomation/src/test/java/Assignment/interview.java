package Assignment;

import java.util.Scanner;

public class interview {

	public static void main(String args[]) {

		String num = "VII";
		int roman =0;
		int value[] = { 1000, 900, 500, 400, 100, 90, 50, 10, 9, 5, 4, 1 };
		String symbol[] = { "M", "CM", "D", "CD", "C", "XC", "L", "X", "IX", "V", "IV", "I" };

		for (int i = 0; i < symbol.length; i++) {
			while (num.startsWith(symbol[i])) {
				roman = roman + value[i];
				num = num.substring(symbol[i].length());
			}
		}

		System.out.println(roman);
	}
}
