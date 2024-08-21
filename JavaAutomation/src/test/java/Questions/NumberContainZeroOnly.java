package Questions;

import java.util.Scanner;

public class NumberContainZeroOnly {

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int start = (int) Math.pow(10, n - 1);
		int end = (int) Math.pow(10, n) - 1;

		for (int i = start; i <= end; i++) {
			if (Integer.toString(i).contains("0")) {
				System.out.println(i);
			}
		}

	}
}