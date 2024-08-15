package Assignment;

public class interview {

	public static void main(String args[]) {

		String str = "mbsjJVsahgdcBkjHBKgHJDL";
		String lowercase = "";
		String uppercase = "";
		for (char c : str.toCharArray()) {
			if (Character.isLowerCase(c)) {
				lowercase = lowercase + c;
			} else {
				uppercase = uppercase + c;
			}
		}
		System.out.println("Lowercase: " + lowercase);
		System.out.println("UpperCase: " + uppercase);

	}
}
