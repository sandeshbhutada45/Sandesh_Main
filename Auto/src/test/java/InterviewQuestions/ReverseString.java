package InterviewQuestions;

public class ReverseString {

	public static void main(String[] args) {
		String input = "Sandesh";
		String output = "";

		for (int i = input.length() - 1; i >= 0; i--) {
			output = output + input.charAt(i);
		}
		System.out.println(output);

		// Revsers Number
		int x = 12345;
		String s = String.valueOf(x).toString();
		System.out.println(s);
		String z = "";

		for (int i = s.length() - 1; i >= 0; i--) {
			z = z + s.charAt(i);
		}
		System.out.println(z);

	}

}
