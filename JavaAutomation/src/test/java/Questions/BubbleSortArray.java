package Questions;

import java.util.Arrays;

public class BubbleSortArray {

	public static void main(String[] args) {
		int a[] = { 5, 7, 2, 6, 1, 9, 3 };
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

	}

}
