package InterviewQuestions;

import java.util.Arrays;

public class DoubleNumbersInArray {

	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4, 5 };
		int c[]=new int[a.length];
		for (int i = 0; i < a.length; i++) {
			c[i] = a[i] * 2;
		}
		System.out.println(Arrays.toString(c));

	}

}
