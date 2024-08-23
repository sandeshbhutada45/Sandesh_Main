package Questions;

public class RemoveNonNumericCharacters {

	public static void main(String[] args) {

		String str = "123-4%56-78$9";
		String output = str.replaceAll("[^0-9]", "");
		System.out.println(output);
	}

}
