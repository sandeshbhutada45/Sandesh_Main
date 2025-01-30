package Questions;

import java.util.ArrayList;

public class ShiftZeroToLast {

	public static void main(String[] args) {
		int arr[] = { 2, 0, 5, 6, 1, 3, 0, 8, 0, 4 };
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0) {
				list.add(arr[i]);
			}
		}
		while (list.size() < arr.length) {
			list.add(0);
		}
		System.out.println(list);
		
	}

}
