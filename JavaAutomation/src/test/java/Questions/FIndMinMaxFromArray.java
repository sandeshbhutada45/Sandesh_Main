package Questions;

public class FIndMinMaxFromArray {

	public static void main(String[] args) {
		int arr[] = { 4, 2, 1, 8, 3, 9, 6 };
		int max = arr[0];
		int min = arr[0];

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
			if (arr[i] < min) {
				min = arr[i];
			}
		}
		System.out.println("Max: " + max);
		System.out.println("Min: " + min);

	}

}
