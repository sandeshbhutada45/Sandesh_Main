package Questions;

public class ReverseStringWords {

	public static void main(String[] args) {
		String str = "Sandesh Bhutada";

		String[] word = str.split("\\s");
		String rev = "";

		for (int i = word.length - 1; i >= 0; i--) {
			rev = rev + word[i];
			rev = rev + " ";
		}
		System.out.println(rev);

	}

}
