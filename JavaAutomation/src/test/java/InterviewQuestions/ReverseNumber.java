package InterviewQuestions;

public class ReverseNumber {

	public static void main(String[] args) {
		int a = 462;
		int rev = 0;
		while (a > 0) {
			int rem = a % 10; // 46
			rev = rev * 10 + rem;// 0*10+46
			a = a / 10;
		}
		System.out.print(rev);

	}

}
