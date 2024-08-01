package Questions;

public class ReverseArray {

	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4, 5 };

		for (int i = a.length - 1; i >= 0; i--) {
			System.out.print(a[i]); // 54321
		}

		String arr[] = { "a", "b", "c" };
		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.print(arr[i]); // cba
		}
	}
}
