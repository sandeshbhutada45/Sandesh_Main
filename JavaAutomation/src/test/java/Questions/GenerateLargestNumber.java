package Questions;

import java.util.Arrays;

public class GenerateLargestNumber {

	public static void main(String[] args) {
		int arr[] = { 2, 4, 5, 8, 3, 7 };
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] < arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}

		}
		System.out.println(Arrays.toString(arr));
		for (int i=0;i<arr.length;i++) {
			System.out.print(arr[i]);
		}
	}
}
