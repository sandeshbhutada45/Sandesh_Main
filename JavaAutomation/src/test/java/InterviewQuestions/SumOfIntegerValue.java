package InterviewQuestions;

public class SumOfIntegerValue {

	public static void main(String[] args) {

		int num = 548;
		int sum = 0;
		while (num > 0) {
			int rem = num % 10; // 8
			sum = sum + rem; // 8
			num = num / 10; // 54.8
		}
		System.out.println(sum);
	}

}
