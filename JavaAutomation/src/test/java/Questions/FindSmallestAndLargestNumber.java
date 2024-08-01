package InterviewQuestions;

import java.util.Arrays;

public class FindSmallestAndLargestNumber {

	public static void main(String[] args) {
		int a[] = { 4, 2, 7, 0, 10, 3 };
		int temp = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(a));
		int smallnumber = a[0];
		int largestnumber = a[a.length - 1];
		System.out.println(smallnumber + " " + largestnumber);

	}

}
