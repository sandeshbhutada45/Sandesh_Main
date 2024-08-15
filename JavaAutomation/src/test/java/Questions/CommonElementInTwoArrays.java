package Questions;

import java.util.ArrayList;

public class CommonElementInTwoArrays {

	public static void main(String[] args) {

		int a[] = { 1, 5, 7, 6, 2, 0 };
		int b[] = { 2, 4, 1, 7, 6, 9 };
		int count=0;
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b.length; j++) {
				if (a[i] == b[j]) {
					list.add(a[i]);
					count++;
				}
			}
		}
		System.out.println("Count "+count);
		System.out.println(list);

	}

}
