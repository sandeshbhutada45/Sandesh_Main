package InterviewQuestions;

import java.util.Arrays;

public class FindSecondLargestNumber {

	public static void main(String[] args) {
		int a[] = { 1, 4, -2, 8, -7, 9 };
		int temp = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[j] > a[i]) {
					temp = a[j];
					a[j] = a[i];
					a[i] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(a));
		System.out.println("Second Largest Number is: " + a[1]);

	}

}
