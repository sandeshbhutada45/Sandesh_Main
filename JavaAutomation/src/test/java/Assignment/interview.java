package Assignment;

public class interview {

	public static void main(String args[]) {

		String input = "hello testing";
		char[] ch= input.toCharArray();
		String output="";
		for(char c: ch) {
			if(Character.isLowerCase(c)) {
				output=output+Character.toUpperCase(c);
			}
			else {
                output += c; // Add the letter as it is
            }
		}
		System.out.println(output);
	}
}
