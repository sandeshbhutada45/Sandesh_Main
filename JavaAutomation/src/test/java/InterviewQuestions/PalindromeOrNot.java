package InterviewQuestions;

public class PalindromeOrNot {

	public static void main(String[] args) {
		int n = 151;
		int original = n;
		int rev = 0;
		while (n > 0) {
			int rem = n % 10;// 1
			rev = rev * 10 + rem;// 1
			n = n / 10;
		}
		System.out.println(rev);

		if (original == rev) {
			System.out.println("Number is Palindrome");
		} else {
			System.out.println("Number is not Palindrome");
		}
	}

}
