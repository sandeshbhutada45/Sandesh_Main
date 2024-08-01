package Questions;

public class DifferenceLowerUpperCaseLetter {

	public static void main(String[] args) {
		String str = "hsUWBbjyiJBFtBJbhfH";
		String lowercase = "";
		String uppercase = "";
		for (char ch : str.toCharArray()) {
			if (Character.isLowerCase(ch)) {
				lowercase = lowercase + ch;
			} else {
				uppercase = uppercase + ch;
			}
		}
		System.out.println("LowerCase is: " + lowercase);
		System.out.println("UpperCase is: " + uppercase);

	}

}
