package Questions;

import java.util.HashSet;

public class RemoveDuplicates {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 4, 1, 2, 9, 4, 9 };

		HashSet<Integer> set = new HashSet<Integer>();
		for (int i = 0; i < arr.length; i++) {
			set.add(arr[i]);
		}
		System.out.println(set);

	}

}
