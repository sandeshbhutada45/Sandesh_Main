package Questions;

public class SwapString {

	public static void main(String[] args) {
		String a = "Sandesh";
		String b = "Bhutada";

		a = a + b;
		System.out.println(a); // SandeshBhutada

		b = a.substring(0, a.length() - b.length());
		System.out.println(b); // Sandesh

		a = a.substring(b.length());
		System.out.println(a); // Bhutada

	}

}
