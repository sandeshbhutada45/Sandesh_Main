package InterviewQuestions;

import java.util.Arrays;

public class MergeTwoArrayAndSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 4, 8, 6, 7, 9 };
		int b[] = { 5, 3, 1, 2, 10 };

		int c[] = new int[a.length + b.length]; // 10

		for (int i = 0; i < a.length; i++) {
			c[i] = a[i]; // {4,8,6,7,9,0,0,0,0,0}
		}
		for (int i = 0; i < b.length; i++) {
			c[i + a.length] = b[i];
		}
		System.out.println(Arrays.toString(c));

//		Arrays.sort(c);
		for (int i = 0; i < c.length; i++) {
			for (int j = i + 1; j < c.length; j++) {
				if (c[i] > c[j]) {
					int temp = c[i];
					c[i] = c[j];
					c[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(c));

	}

}
