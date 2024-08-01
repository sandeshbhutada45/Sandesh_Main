package Questions;

public class ReverseString {

	public static void main(String[] args) {
		String input = "Sandesh";
		String output = "";

		for (int i = input.length() - 1; i >= 0; i--) {
			output = output + input.charAt(i);
		}
		System.out.println(output);

	}

}
