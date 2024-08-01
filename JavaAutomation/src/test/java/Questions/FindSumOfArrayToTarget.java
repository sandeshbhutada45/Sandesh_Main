package Questions;

public class FindSumOfArrayToTarget {

	public static void main(String[] args) {
		int a[] = { 4, 6, 2, 3, 7, 1 };
		int target = 5;

		for (int i = 0; i < a.length - 1; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] + a[j] == target) {
					System.out.println(a[i] + " and " + a[j]);
				}
			}
		}

	}

}
