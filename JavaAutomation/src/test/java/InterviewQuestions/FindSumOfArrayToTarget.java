package InterviewQuestions;

public class FindSumOfArrayToTarget {

	public static void main(String[] args) {
		int arr[] = { 14, 5, 8, 6, 9, 2, 11, 12 };
		int target = 20;

		for (int i = 0; i < arr.length ; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] + arr[j] == target) {
					System.out.println(arr[i] + "," + arr[j]);
				}
			}
		}
	}

}
